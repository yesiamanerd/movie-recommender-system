package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        // ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        // use ApplicationContext to find which filter is being used
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        // call method to get the recommendations
        String[] result = recommender.recommendMovie("Finding Dory");


        // display results
        System.out.println(Arrays.toString(result));
    }

}
