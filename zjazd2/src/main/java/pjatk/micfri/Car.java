package pjatk.micfri;

public class Car {
    float przebieg;
    int ilosc_kol;
    String marka;
    String model;
    String kolor;

    Car(String marka, String model, Float przebieg, int ilosc_kol) {
        this.model = model;
        this.marka = marka;
        this.przebieg = przebieg;
        this.ilosc_kol = ilosc_kol;
    }

    Car(String kolor) {
        this.kolor = kolor;

    }

    public float getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(float przebieg) {
        this.przebieg = przebieg;
    }

    public int getIlosc_kol() {
        return ilosc_kol;
    }

    public void setIlosc_kol(int ilosc_kol) {
        this.ilosc_kol = ilosc_kol;
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
}
