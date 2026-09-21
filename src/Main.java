//class Osoba {
//    String imie;
//    int wiek;
//
//    Osoba(String imie, int wiek){
//        this.imie = imie;
//        this.wiek = wiek;
//    }
//
//    void przedstawSie() {
//        System.out.println("Cześć, mam na imię " + imie + " i mam " + wiek + " lat.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Osoba osoba1 = new Osoba("Anna", 25);
//        Osoba osoba2 = new Osoba("Piotr", 30);
//
//        osoba1.przedstawSie();
//        osoba2.przedstawSie();
//    }
//}

class Samochod {
    String marka;
    String model;
    int predkosc;

    Samochod(String marka, String model){
        this.marka = marka;
        this.model = model;
        this.predkosc = 0;
    }

    void przyspiesz(int oIle){
        if (oIle > 0) {
            this.predkosc += oIle;
            System.out.println(marka + " " + model + " przyspiesza o " + oIle + " km/h.");
        }
    }

    public void wyswietlPredkosc() {
        System.out.println("Aktualna prędkość (" + marka + " " + model + "): " + predkosc + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Samochod auto1 = new Samochod("Toyota", "Corolla");
        Samochod auto2 = new Samochod("BMW", "Seria 3");

        auto1.wyswietlPredkosc();
        auto1.przyspiesz(50);
        auto1.wyswietlPredkosc();

        System.out.println("---");

        auto2.wyswietlPredkosc();
        auto2.przyspiesz(70);
        auto2.przyspiesz(30);
        auto2.wyswietlPredkosc();
    }
}