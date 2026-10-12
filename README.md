Nazwa projektu: System Zarządzania Magazynem Sklepu z Elektroniką

Opis działania: Program służy do zarządzania stanem magazynowym w sklepie z elektroniką. Umożliwia podgląd dostępnego sprzętu, symulację sprzedaży, przyjmowanie dostaw towaru oraz zmianę cen urządzeń za pomocą interaktywnego menu w konsoli z wykorzystaniem klasy Scanner.

Struktura i zawartość plików (.java):

1. Plik SprzetElektroniczny.java (Klasa bazowa / Superclass)
Opis: Przechowuje podstawowe dane wspólne dla całego sprzętu elektronicznego w sklepie.
Pola danych: nazwa (tekst), cena (liczba), ilosc (liczba sztuk w magazynie).
Konstruktor: Ustawia nazwę, cenę oraz ilość sztuk za pomocą słowa kluczowego this.
Metody:
- wyswietlInformacje(): Wyświetla nazwę, cenę i obecny stan magazynowy.
- sprzedaj(int sztuki): Odejmuje podaną liczbę sztuk od stanu magazynowego, jeśli na stanie jest wystarczający zapas.
- dostawa(int sztuki): Zwiększa liczbę dostępnych sztuk w magazynie o podaną wartość.

2. Plik Laptop.java (Pierwsza klasa pochodna / Subclass)
Opis: Klasa reprezentująca komputery przenośne, która dziedziczy po klasie SprzetElektroniczny za pomocą słowa kluczowego extends.
Dodatkowe pola danych: ramGb (liczba całkowita określająca pamięć RAM w GB).
Konstruktor: Przypisuje wartości dla nazwy, ceny, ilości oraz pamięci RAM.
Metody: Nadpisuje (override) metodę wyswietlInformacje(), aby obok bazowych danych wyświetlać również ilość pamięci RAM.

3. Plik Smartfon.java (Druga klasa pochodna / Subclass)
Opis: Klasa reprezentująca telefony, która dziedziczy po klasie SprzetElektroniczny.
Dodatkowe pola danych: pojemnoscBaterii (liczba całkowita w mAh).
Konstruktor: Przypisuje wartości dla nazwy, ceny, ilości oraz pojemności baterii.
Metody: Nadpisuje metodę wyswietlInformacje(), aby dodawać informację o pojemności baterii do opisu smartfona.

4. Plik Main.java (Klasa startowa z metodą main)
Opis: Główny punkt startowy programu zawarty w metodzie main().
Działanie:
- Tworzy obiekty klas Laptop oraz Smartfon z początkowymi danymi i stanem magazynowym.
- Tworzy obiekt Scanner do odczytywania danych z klawiatury.
- Uruchamia pętlę wyświetlającą menu z opcjami:
  1. Wyświetl stan magazynu (wywołuje metody wyswietlInformacje() dla laptopa i smartfona).
  2. Sprzedaj laptopa (pobiera ze Scanner liczbę sztuk do sprzedania i wywołuje metodę sprzedaj()).
  3. Przyjmij dostawę smartfonów (pobiera ze Scanner liczbę dostarczonych sztuk i wywołuje metodę dostawa()).
  4. Zmień cenę laptopa lub smartfona (pobiera nową kwotę ze Scanner i przypisuje ją do pola cena).
  5. Zakończ działanie programu.
