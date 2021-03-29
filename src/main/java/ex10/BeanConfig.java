package ex10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Musician strong() {
        return new Drummer();
    }

    @Bean
    public Musician king() {
        return new guitarist();
    }

    @Bean
    public Musician queen() {
        return new trombonist();
    }
}
