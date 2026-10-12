import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Laptop> laptopy = new ArrayList<>();
        ArrayList<Smartfon> smartfony = new ArrayList<>();

        laptopy.add(new Laptop("Dell XPS 15", 4999.99, 10, 16));
        laptopy.add(new Laptop("MacBook Pro 14", 6999.99, 8, 32));
        laptopy.add(new Laptop("Lenovo ThinkPad X1", 5499.99, 12, 16));
        laptopy.add(new Laptop("HP Spectre x360", 4599.99, 15, 8));

        smartfony.add(new Smartfon("iPhone 14", 3999.99, 20, 3200));
        smartfony.add(new Smartfon("Samsung Galaxy S23", 3499.99, 25, 5000));
        smartfony.add(new Smartfon("Xiaomi 13 Pro", 2999.99, 30, 4820));
        smartfony.add(new Smartfon("Google Pixel 7", 2799.99, 18, 4355));

        while (true) {
            System.out.println("=== SYSTEM ZARZĄDZANIA MAGAZYNEM SKLEPU Z ELEKTRONIKĄ ===");
            System.out.println();
            System.out.println("1. Wyświetl stan magazynu");
            System.out.println("2. Sprzedaj laptopa");
            System.out.println("3. Przyjmij dostawę smartfonów");
            System.out.println("4. Zmień cenę laptopa lub smartfona");
            System.out.println("5. Zakończ działanie programu");
            System.out.println();
            System.out.print("Wybierz opcję: ");

            int wybor = scanner.nextInt();
            System.out.println();

            switch (wybor) {
                case 1:
                    System.out.println("--- STAN MAGAZYNU ---");
                    System.out.println();
                    System.out.println("LAPTOPY:");
                    for (int i = 0; i < laptopy.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        laptopy.get(i).wyswietlInformacje();
                    }
                    System.out.println("SMARTFONY:");
                    for (int i = 0; i < smartfony.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        smartfony.get(i).wyswietlInformacje();
                    }
                    break;

                case 2:
                    System.out.println("--- WYBIERZ LAPTOPA DO SPRZEDANIA ---");
                    for (int i = 0; i < laptopy.size(); i++) {
                        System.out.println((i + 1) + ". " + laptopy.get(i).getNazwa() + " (Stan: " + laptopy.get(i).getIlosc() + " szt.)");
                    }
                    System.out.print("Wybierz numer laptopa: ");
                    int numerLaptopa = scanner.nextInt() - 1;
                    if (numerLaptopa >= 0 && numerLaptopa < laptopy.size()) {
                        System.out.print("Podaj liczbę laptopów do sprzedania: ");
                        int sztukiLaptop = scanner.nextInt();
                        laptopy.get(numerLaptopa).sprzedaj(sztukiLaptop);
                    } else {
                        System.out.println("Nieprawidłowy numer!");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("--- WYBIERZ SMARTFON DO DOSTAWY ---");
                    for (int i = 0; i < smartfony.size(); i++) {
                        System.out.println((i + 1) + ". " + smartfony.get(i).getNazwa());
                    }
                    System.out.print("Wybierz numer smartfona: ");
                    int numerSmartfona = scanner.nextInt() - 1;
                    if (numerSmartfona >= 0 && numerSmartfona < smartfony.size()) {
                        System.out.print("Podaj liczbę smartfonów w dostawie: ");
                        int sztukiSmartfon = scanner.nextInt();
                        smartfony.get(numerSmartfona).dostawa(sztukiSmartfon);
                    } else {
                        System.out.println("Nieprawidłowy numer!");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("--- WYBIERZ URZĄDZENIE DO ZMIANY CENY ---");
                    System.out.println("LAPTOPY:");
                    for (int i = 0; i < laptopy.size(); i++) {
                        System.out.println((i + 1) + ". " + laptopy.get(i).getNazwa() + " (Cena: " + laptopy.get(i).getCena() + " PLN)");
                    }
                    System.out.println("SMARTFONY:");
                    for (int i = 0; i < smartfony.size(); i++) {
                        System.out.println((laptopy.size() + i + 1) + ". " + smartfony.get(i).getNazwa() + " (Cena: " + smartfony.get(i).getCena() + " PLN)");
                    }
                    System.out.print("Wybierz numer urządzenia: ");
                    int numerUrzadzenia = scanner.nextInt() - 1;
                    System.out.print("Podaj nową cenę: ");
                    double nowaCena = scanner.nextDouble();
                    
                    if (numerUrzadzenia >= 0 && numerUrzadzenia < laptopy.size()) {
                        laptopy.get(numerUrzadzenia).setCena(nowaCena);
                        System.out.println("Zmieniono cenę laptopa " + laptopy.get(numerUrzadzenia).getNazwa() + " na: " + nowaCena + " PLN");
                    } else if (numerUrzadzenia >= laptopy.size() && numerUrzadzenia < laptopy.size() + smartfony.size()) {
                        int indexSmartfona = numerUrzadzenia - laptopy.size();
                        smartfony.get(indexSmartfona).setCena(nowaCena);
                        System.out.println("Zmieniono cenę smartfona " + smartfony.get(indexSmartfona).getNazwa() + " na: " + nowaCena + " PLN");
                    } else {
                        System.out.println("Nieprawidłowy numer!");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Zakończono działanie programu.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Nieprawidłowy wybór! Wybierz opcję od 1 do 5.");
                    System.out.println();
                    break;
            }
        }
    }
}

