package io.datajek.spring.basics.movierecommendersystem.lesson10;


import io.datajek.spring.basics.movierecommendersystem.lesson8.Filter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CollaborativeFilter implements Filter {

    public CollaborativeFilter() {
        super();
        System.out.println("collaborative filter constructor called");
    }

    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {

        //implement logic of collaborative filter

        //return movie recommendations
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
