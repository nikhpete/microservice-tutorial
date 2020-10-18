package com.nick.movieinfoservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class MovieSummary {

    private String id;
    private String title;
    private String overview;
    
	@Override
	public String toString() {
		return "MovieSummary [id=" + id + ", title=" + title + ", overview=" + overview + "]";
	}
}
