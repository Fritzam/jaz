package pl.pjatk.zjazd1;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ThirdComponent{
    public ThirdComponent(ApplicationContext appContext) {
        PrimaryComponent primaryComponent = appContext.getBean("primaryComponent", PrimaryComponent.class);
        SecondaryComponent secondaryComponent = appContext.getBean("secondaryComponent" ,SecondaryComponent.class);
        primaryComponent.details();
        secondaryComponent.details();
    }
}
