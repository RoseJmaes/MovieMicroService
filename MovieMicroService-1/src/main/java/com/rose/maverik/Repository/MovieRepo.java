package com.rose.maverik.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.rose.maverik.entity.Movie;
import com.rose.maverik.entity.MovieTitle;

public interface MovieRepo extends JpaRepository<Movie, String> {
	

}
