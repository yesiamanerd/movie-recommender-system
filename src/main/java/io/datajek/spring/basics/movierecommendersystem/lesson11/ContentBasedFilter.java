package io.datajek.spring.basics.movierecommendersystem.lesson11;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ContentBasedFilter() {
        logger.info("ContentBasedFilter constructor called");
    }

    @PostConstruct
    public void postConstruct(){
        // load movies into cache
        logger.info("In ContentBasedFilter postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        // clear movies from cache
        logger.info("In ContentBasedFilter preDestroy");
    }

    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {
        //calculate similarity between movies
        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
