package pjatk.micfri;

import java.util.List;

public class Car {
    String rodzaj_pojazdu;
    float przebieg;
    String marka;
    String model;
    String kolor;
    String wlasciciel;

    Car(String marka, String model, Float przebieg, String rodzaj_pojazdu) {
        this.model = model;
        this.marka = marka;
        this.przebieg = przebieg;
        this.rodzaj_pojazdu = rodzaj_pojazdu;
    }

    Car(String kolor) {
        this.kolor = kolor;

    }

    Car() {

    }

    public float getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(float przebieg) {
        this.przebieg = przebieg;
    }
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getRodzaj_pojazdu() {
        return rodzaj_pojazdu;
    }

    public void setRodzaj_pojazdu(String rodzaj_pojazdu) {
        this.rodzaj_pojazdu = rodzaj_pojazdu;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }


    /*{
    "marka": "Lexus",
    "model": "IS300h",
    "przebieg": 30000,
    "rodzaj_pojazdu": "samochod"
}*/
}
