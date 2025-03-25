package io.datajek.spring.basics.movierecommendersystem.lesson7;


import org.springframework.stereotype.Component;


@Component
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movies) {
        return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
    }
}
