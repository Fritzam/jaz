package pl.pjatk.zjazd1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MyConfiguration {

    @Bean
    public Student createNewStudent() {
        return new Student();
    }

    @Bean
    public List<String> defaultData() {
        return List.of("Java", "jest", "fajniejsza", "niz", "C");
    }
}
