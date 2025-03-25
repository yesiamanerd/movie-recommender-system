package io.datajek.spring.basics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    // use filter interface to select filter
    @Autowired
    @Qualifier("CF")
    private Filter filter;

    public String[] recommendMovie(String movie) {

        // print the name of the interface implemntation being used
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations(movie);

        // return the results
        return results;
    }
}
