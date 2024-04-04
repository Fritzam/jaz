package pl.pjatk.zjazd1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class PracaDomowaClass {
    PracaDomowaClass() {
        jaZyje();
    }

    void jaZyje() {
        System.out.println("Jest tak jak mowie! Zyje i mam sie dobrze!");
    }
}
