package io.datajek.spring.basics.movierecommendersystem.lesson12;


import jakarta.inject.Named;
import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.annotation.Qualifier;

@Named
@Qualifier("CBF")
@Primary
public class ContentBasedFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
