package com.nick.ratinginfoservice.resources;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nick.ratinginfoservice.models.Rating;
import com.nick.ratinginfoservice.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String id) {
		return new Rating(id, 4);
	}
	
	@RequestMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String id) {
		
		UserRating userRating = new UserRating();
		userRating.setUserId(id);
		userRating.setRatings(Arrays.asList(
				new Rating("123", 6),
				new Rating("5678", 3)
			   ));
		
		return userRating;
	}

}
