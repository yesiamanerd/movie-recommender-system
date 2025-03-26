package io.datajek.spring.basics.movierecommendersystem.lesson12;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Qualifier;


@Named
public class RecommenderImplementation {

    @Inject
    @Qualifier("CF")
    private Filter filter;

    public String[] recommendMovies(String movie) {

        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }

}
