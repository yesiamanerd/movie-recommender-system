package io.datajek.spring.basics.movierecommendersystem.lesson3;

public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movies) {
        return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
    }
}
