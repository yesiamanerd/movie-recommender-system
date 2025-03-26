package io.datajek.spring.basics.movierecommendersystem.lesson17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    // use filter interface to select filter
    @Autowired
    @Qualifier("CF")
    private Filter filter;

    @Value("${recommender.implementation.favoriteMovie: Finding Dory}")
    String favoriteMovie;

    public String[] recommendMovie(String movie) {

        // print the name of the interface implemntation being used
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations(movie);

        // return the results
        return results;
    }

    public String getFavoriteMovie(){
        return favoriteMovie;
    }
}
