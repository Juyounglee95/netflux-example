package juyoung.springframework.netfluxexample.service;

import juyoung.springframework.netfluxexample.domain.Movie;
import juyoung.springframework.netfluxexample.domain.MovieEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieService {

    Flux<MovieEvent> events(String movieId);

    Mono<Movie> getMovieById(String id);

    Flux<Movie> getAllMovies();

}

