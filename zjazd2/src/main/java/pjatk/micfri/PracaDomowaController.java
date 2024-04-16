package pjatk.micfri;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/homework")
public class PracaDomowaController {

    //localhost:8080/homework/sklep/pojazdy?marka=Citroen&model=C5&przebieg=200000
    //localhost:8080/homework/sklep/pojazdy/Honda
    @GetMapping({"/sklep/pojazdy/{rodzaj_pojazdu}", "/sklep/pojazdy"})
    public ResponseEntity<Car> getPath(@PathVariable(required = false) String rodzaj_pojazdu,
                                       @RequestParam(required = false) String marka,
                                       @RequestParam(required = false) String model,
                                       @RequestParam(required = false) String przebieg) {
        String templateMarka = null;
        String templateModel = null;
        String templatePrzebieg = "0";
        if (marka != null) {
            templateMarka = marka;
        }
        if (model != null ) {
            templateModel = model;
        }
        if (przebieg != null) {
            templatePrzebieg = przebieg;
        }
        if (rodzaj_pojazdu != null) return ResponseEntity.ok(new Car(templateMarka, templateModel, Float.parseFloat(templatePrzebieg), rodzaj_pojazdu));
        return ResponseEntity.ok(new Car(templateMarka, templateModel, Float.parseFloat(templatePrzebieg), null));
    }

    //localhost:8080/homework/sklep/pojazdy/samochody
    @PostMapping("/sklep/pojazdy/samochody")
    public ResponseEntity<Car> postCar(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }


    //localhost:8080/homework/samochody/user/Charlie
    @PutMapping("samochody/user/{nazwa_usera}")
    public ResponseEntity<Car> putCar(@RequestBody Car car, @PathVariable String nazwa_usera) {
        car.setWlasciciel(nazwa_usera);
        return ResponseEntity.ok(car);
    }

    //localhost:8080/homework/samochody/user/kazik
    @DeleteMapping("samochody/user/{user}")
    public ResponseEntity<String> removeUser(@PathVariable String user) {
        ArrayList<Car> list = new ArrayList<>();
        list.add(new Car("Peugeot", "207", (float) 15000, "Samochod"));
        list.get(0).setWlasciciel(user);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getWlasciciel().equals(user)) {
                System.out.println(list.size());
                list.remove(i);
                System.out.println(list.size());
            }
        }
        return ResponseEntity.ok().build();
    }
}
