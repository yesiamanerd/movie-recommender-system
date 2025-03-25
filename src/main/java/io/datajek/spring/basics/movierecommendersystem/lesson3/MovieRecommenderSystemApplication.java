package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());
        String[] result = recommender.recommendMovie("Finding Dory");
        System.out.println(Arrays.toString(result));
    }

}
