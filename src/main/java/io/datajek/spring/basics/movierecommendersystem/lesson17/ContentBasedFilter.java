package io.datajek.spring.basics.movierecommendersystem.lesson17;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("CBF")
@Primary
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movies) {
        return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
    }
}
