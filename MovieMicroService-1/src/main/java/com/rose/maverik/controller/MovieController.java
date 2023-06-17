package com.rose.maverik.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rose.maverik.Repository.MovieRepo;
import com.rose.maverik.entity.Movie;
import com.rose.maverik.entity.MovieTitle;

@RestController
@RequestMapping("/api")
public class MovieController {
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	MovieRepo repo;

	@GetMapping("/movie")
	public List<MovieTitle> getmovie() {
		List<String>list = new ArrayList<String>(List.of("Avengers"));
		ResponseEntity<MovieTitle[]> response = null;
		for (String string : list) {
			response = restTemplate.getForEntity(
		
				"https://gateway.maverik.com/movie/api/movie/title/ " + string + "?source=web", MovieTitle[].class);
		List <MovieTitle> movieList=Arrays.asList(response.getBody());
		
		for (MovieTitle title : movieList) {
			System.out.println(title.getImdbID());
			ResponseEntity <Movie> movie =restTemplate.getForEntity("https://gateway.maverik.com/movie/api/movie/"+title.getImdbID()+"?source=web", Movie.class);
			repo.save(movie.getBody());
			
		}
		
		}
		
		
		return Arrays.asList(response.getBody());
	
	}
	
}
