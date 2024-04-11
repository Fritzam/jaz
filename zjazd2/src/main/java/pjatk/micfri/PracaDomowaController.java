package pjatk.micfri;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/homework")
public class PracaDomowaController {

    //localhost:8080/homework/sklep/pojazdy/samochod?marka=Lexus&model=IS300&przebieg=45000
    @GetMapping("/sklep/pojazdy/{rodzaj_pojazdu}")
    public ResponseEntity<Car> getPath(@PathVariable String rodzaj_pojazdu,
                                       @RequestParam String marka,
                                       @RequestParam String model,
                                       @RequestParam String przebieg) {
        return ResponseEntity.ok(new Car(marka, model, Float.parseFloat(przebieg), rodzaj_pojazdu));
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
