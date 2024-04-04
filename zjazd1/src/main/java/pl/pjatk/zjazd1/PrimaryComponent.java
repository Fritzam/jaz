package pl.pjatk.zjazd1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/*@Configuration
@ImportResource("classpath: kontekst.xml")*/
@Component
public class PrimaryComponent {

    public PrimaryComponent(@Value("${my.own.value}: defaultadsad") String valueFromProperties, PracaDomowaClass pracaDomowaClass) {
        System.out.println("I am the first component");
        System.out.println(valueFromProperties);
        pracaDomowaClass.jaZyje();
    }

    public void introduction() {
        System.out.println("Greetings, I am first component. I'm alive!");
    }

    public void details() {
        System.out.println("I am PrimaryComponent, and this method name is details");
    }

}
