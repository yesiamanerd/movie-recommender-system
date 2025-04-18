package io.datajek.spring.basics.movierecommendersystem.lesson13;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@SpringBootApplication
@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        //ApplicationContext manages the beans and dependencies
//        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        try(AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class)){
            //use ApplicationContext to find which filter is being used
            RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

            //call method to get recommendations
            String[] result = recommender.recommendMovies("Finding Dory");

            //display results
            System.out.println(Arrays.toString(result));

            //close the application context
            appContext.close();
        }


    }

}
