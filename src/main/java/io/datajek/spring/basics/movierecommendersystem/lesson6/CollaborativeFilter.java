package io.datajek.spring.basics.movierecommendersystem.lesson6;


import org.springframework.stereotype.Component;


@Component("CF")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movies) {
        return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
    }
}
