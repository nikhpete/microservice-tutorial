package com.nick.moviecatalogservice.resource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.nick.moviecatalogservice.models.CatalogItem;
import com.nick.moviecatalogservice.models.UserRating;
import com.nick.moviecatalogservice.services.MovieInfoService;
import com.nick.moviecatalogservice.services.UserRatingService;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@Autowired
	private MovieInfoService movieInfoService;
	
	@Autowired
	private UserRatingService userRatingService;

	@Autowired
	private WebClient.Builder webClientBuilder;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

		UserRating ratings = userRatingService.getUserRating(userId);

		return ratings.getRatings().stream().map(rating -> movieInfoService.getCalatogItem(rating)).collect(Collectors.toList());
	}
}

/*
Movie movie = webClientBuilder
.build()
.get()
.uri("http://localhost:8082/movies/"+ rating.getMovieId())
.retrieve()
.bodyToMono(Movie.class)
.block();
*/