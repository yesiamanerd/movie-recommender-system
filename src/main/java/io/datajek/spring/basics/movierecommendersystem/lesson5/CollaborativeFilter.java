package io.datajek.spring.basics.movierecommendersystem.lesson5;


import org.springframework.stereotype.Component;


@Component
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movies) {
        return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
    }
}
