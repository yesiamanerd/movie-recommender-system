package io.datajek.spring.basics.movierecommendersystem.lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    // use filter interface to select filter
    @Autowired
    private Filter filter;

    public RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }

    public String[] recommendMovie(String movie) {

        // print the name of the interface implemntation being used
        System.out.println("Name of the filter in use: " + filter + "\n");

        // use content based filter to find similar movies
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations(movie);

        // return the results
        return results;
    }
}
