package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    // use filter interface to select filter
    @Autowired
    private Filter collaborativeFilter;

    public String[] recommendMovie(String movie) {

        // print the name of the interface implemntation being used
        System.out.println("Name of the filter in use: " + collaborativeFilter + "\n");
        String[] results = collaborativeFilter.getRecommendations(movie);

        // return the results
        return results;
    }
}
