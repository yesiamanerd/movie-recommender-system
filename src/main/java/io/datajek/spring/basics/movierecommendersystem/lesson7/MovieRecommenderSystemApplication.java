package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        // ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        // REcommenderImplementation injects dependency using constructor
        System.out.println("Constructor injection in REcommenderImplementation class");

        // use ApplicationContext to find which filter is being used
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        // call method to get the recommendations
        String[] result = recommender.recommendMovie("Finding Dory");

        // display results
        System.out.println(Arrays.toString(result));


        // RecommenderImplementation2 injects dependency using setter method
        System.out.println("Setter injection in RecommenderImplementation2 class");
        RecommenderImplementation2 recommender2 = appContext.getBean(RecommenderImplementation2.class);
        result = recommender2.recommendMovie("Finding Dory");

        System.out.println(Arrays.toString(result));
    }

}
