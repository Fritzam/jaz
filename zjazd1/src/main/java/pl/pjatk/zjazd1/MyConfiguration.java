package pl.pjatk.zjazd1;

import org.springframework.beans.factory.annotation.Value;
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
    public PracaDomowaClass createNewPracaDomowa(@Value("${my.own.property}") String value) {
        if (value.equals("true")) {
            return new PracaDomowaClass();
        }
        return null;
    }

    @Bean
    public List<String> defaultData() {
        return List.of("Java", "jest", "fajniejsza", "niz", "C");
    }
}
