package io.datajek.spring.basics.movierecommendersystem.lesson14;


import org.springframework.beans.factory.annotation.Qualifier;


@Qualifier("CF")
//@Primary
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
