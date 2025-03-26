package io.datajek.spring.basics.movierecommendersystem.lesson12;


import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Qualifier;

@Named
@Qualifier("CF")
//@Primary
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
