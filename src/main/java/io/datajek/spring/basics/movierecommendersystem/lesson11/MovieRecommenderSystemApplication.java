package io.datajek.spring.basics.movierecommendersystem.lesson11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages = "io.datajek.spring.basics.movierecommendersystem.lesson10")
@ComponentScan(includeFilters = @ComponentScan.Filter (
        type= FilterType.REGEX,
        pattern="io.datajek.spring.basics.movierecommendersystem.lesson9.*"))
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        // use Application context to get recommender object
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
        System.out.println(recommender);

        // retrieving prototype bean from application context twice
        Movie m1 = appContext.getBean(Movie.class);
        System.out.println(m1);

        Movie m2 = appContext.getBean(Movie.class);
        System.out.println(m2);
    }
}