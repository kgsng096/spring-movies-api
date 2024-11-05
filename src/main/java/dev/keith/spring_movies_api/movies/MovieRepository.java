package dev.keith.spring_movies_api.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //automatic queries
    Optional<Movie> findMovieByImdbId(String imdbId);
}
