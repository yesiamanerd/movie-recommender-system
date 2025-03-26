package io.datajek.spring.basics.movierecommendersystem.lesson11;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class RecommenderImplementation {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Filter filter;

//    // constructor injection
//    @Autowired
//    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
//        super();
//        this.filter = filter;
//        System.out.println("Constructor invoked...");
//    }

    @Autowired
    public void setFilter(Filter filter) {
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }

    @PostConstruct
    public void postConstruct(){
        // initialization code goes here
        logger.info("In RecommenderImplementation postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        // cleanup code
        logger.info("In RecommenderImplementation preDestroy");
    }

//    public String[] recommendMovie(String movie) {
//
//        // print the name of the interface implemntation being used
//        System.out.println("Name of the filter in use: " + filter + "\n");
//        String[] results = filter.getRecommendations(movie);
//
//        // return the results
//        return results;
//    }
}
