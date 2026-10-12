public class SprzetElektroniczny {
    protected String nazwa;
    protected double cena;
    protected int ilosc;

    public SprzetElektroniczny(String nazwa, double cena, int ilosc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena + " PLN");
        System.out.println("Stan magazynowy: " + ilosc + " szt.");
        System.out.println();
    }

    public void sprzedaj(int sztuki) {
        if (ilosc >= sztuki) {
            ilosc -= sztuki;
            System.out.println("Sprzedano " + sztuki + " szt. produktu: " + nazwa);
        } else {
            System.out.println("Brak wystarczającej ilości w magazynie!");
        }
    }

    public void dostawa(int sztuki) {
        ilosc += sztuki;
        System.out.println("Przyjęto dostawę " + sztuki + " szt. produktu: " + nazwa);
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIlosc() {
        return ilosc;
    }
}
