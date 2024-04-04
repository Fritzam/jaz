package pl.pjatk.zjazd1;

import org.springframework.stereotype.Component;

@Component
public class SecondaryComponent {
    public SecondaryComponent(PrimaryComponent primaryComponent) {
        System.out.println("I am the secondary component");
        primaryComponent.introduction();
    }

    public void details() {
        System.out.println("I am PrimaryComponent, and this method name is details");
    }
}
