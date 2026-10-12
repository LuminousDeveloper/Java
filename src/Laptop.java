public class Laptop extends SprzetElektroniczny {
    private int ramGb;

    public Laptop(String nazwa, double cena, int ilosc, int ramGb) {
        super(nazwa, cena, ilosc);
        this.ramGb = ramGb;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena + " PLN");
        System.out.println("Stan magazynowy: " + ilosc + " szt.");
        System.out.println("Pamięć RAM: " + ramGb + " GB");
        System.out.println();
    }

    public int getRamGb() {
        return ramGb;
    }
}
