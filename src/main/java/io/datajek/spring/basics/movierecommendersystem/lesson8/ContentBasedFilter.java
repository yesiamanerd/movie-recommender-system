package io.datajek.spring.basics.movierecommendersystem.lesson8;


import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter{

    public ContentBasedFilter() {
        super();
        System.out.println("content-based filter constructor called");
    }

    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {

        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
