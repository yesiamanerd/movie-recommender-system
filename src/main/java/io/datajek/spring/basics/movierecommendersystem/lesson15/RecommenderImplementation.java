package io.datajek.spring.basics.movierecommendersystem.lesson15;

import org.springframework.beans.factory.annotation.Autowired;

public class RecommenderImplementation {

    @Autowired
    private Filter filter;

    //constructor
    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    //getter and setter methods
    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter)
    {
        this.filter = filter;
    }

    //no-arg constructor
    public RecommenderImplementation(){

    }

    public String[] recommendMovies(String movie) {

        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }

}
