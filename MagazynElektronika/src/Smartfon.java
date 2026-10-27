public class Smartfon extends SprzetElektroniczny {
    private int pojemnoscBaterii;

    public Smartfon(String nazwa, double cena, int ilosc, int pojemnoscBaterii) {
        super(nazwa, cena, ilosc);
        this.pojemnoscBaterii = pojemnoscBaterii;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena + " PLN");
        System.out.println("Stan magazynowy: " + ilosc + " szt.");
        System.out.println("Pojemność baterii: " + pojemnoscBaterii + " mAh");
        System.out.println();
    }

    public int getPojemnoscBaterii() {
        return pojemnoscBaterii;
    }
}
