# System Zarządzania Magazynem Sklepu z Elektroniką

## Opis projektu

Program służy do zarządzania stanem magazynowym w sklepie z elektroniką. Umożliwia podgląd dostępnego sprzętu, symulację sprzedaży, przyjmowanie dostaw towaru oraz zmianę cen urządzeń za pomocą interaktywnego menu w konsoli z wykorzystaniem klasy `Scanner`.

## Struktura projektu

Projekt składa się z czterech plików Java:

- `SprzetElektroniczny.java` — klasa bazowa.
- `Laptop.java` — klasa pochodna reprezentująca laptopy.
- `Smartfon.java` — klasa pochodna reprezentująca smartfony.
- `Main.java` — klasa główna uruchamiająca program.

## 1. SprzetElektroniczny.java

### Opis
Klasa bazowa przechowująca podstawowe informacje wspólne dla wszystkich urządzeń elektronicznych.

### Pola danych
- `nazwa` — nazwa urządzenia.
- `cena` — cena urządzenia.
- `ilosc` — liczba sztuk dostępnych w magazynie.

### Konstruktor
Ustawia nazwę, cenę oraz ilość urządzenia za pomocą słowa kluczowego `this`.

### Metody
- `wyswietlInformacje()` — wyświetla nazwę, cenę i aktualny stan magazynowy.
- `sprzedaj(int sztuki)` — zmniejsza stan magazynowy, jeśli dostępna liczba sztuk jest wystarczająca.
- `dostawa(int sztuki)` — zwiększa liczbę sztuk dostępnych w magazynie.

## 2. Laptop.java

### Opis
Klasa reprezentująca laptopy. Dziedziczy po klasie `SprzetElektroniczny` za pomocą słowa kluczowego `extends`.

### Dodatkowe pole danych
- `ramGb` — ilość pamięci RAM w gigabajtach (GB).

### Konstruktor
Ustawia nazwę, cenę, ilość sztuk oraz ilość pamięci RAM laptopa.

### Metody
- `wyswietlInformacje()` — nadpisuje metodę z klasy bazowej i wyświetla podstawowe informacje o laptopie oraz ilość pamięci RAM.

## 3. Smartfon.java

### Opis
Klasa reprezentująca smartfony. Dziedziczy po klasie `SprzetElektroniczny`.

### Dodatkowe pole danych
- `pojemnoscBaterii` — pojemność baterii wyrażona w miliamperogodzinach (mAh).

### Konstruktor
Ustawia nazwę, cenę, ilość sztuk oraz pojemność baterii smartfona.

### Metody
- `wyswietlInformacje()` — nadpisuje metodę z klasy bazowej i wyświetla podstawowe informacje o smartfonie oraz pojemność jego baterii.

## 4. Main.java

### Opis
Klasa główna zawierająca metodę `main()`, która uruchamia program.

### Działanie programu

1. Tworzy obiekty klas `Laptop` i `Smartfon` z początkowymi danymi.
2. Tworzy obiekt klasy `Scanner`, który umożliwia pobieranie danych z klawiatury.
3. Wyświetla menu interaktywne w konsoli.
4. Wykonuje operacje wybrane przez użytkownika.

### Opcje menu

| Opcja | Funkcja |
|-------|---------|
| 1 | Wyświetlenie stanu magazynu laptopów i smartfonów. |
| 2 | Sprzedaż wybranej liczby laptopów. |
| 3 | Przyjęcie dostawy smartfonów. |
| 4 | Zmiana ceny laptopa lub smartfona. |
| 5 | Zakończenie działania programu. |

## Wykorzystane zagadnienia Java

Projekt wykorzystuje następujące elementy programowania obiektowego i języka Java:

- **Klasy i obiekty** — reprezentowanie urządzeń elektronicznych.
- **Dziedziczenie** — wykorzystanie słowa kluczowego `extends`.
- **Nadpisywanie metod** — dostosowanie metody `wyswietlInformacje()` w klasach pochodnych.
- **Konstruktory** — inicjalizacja obiektów.
- **Słowo kluczowe `this`** — odwoływanie się do pól aktualnego obiektu.
- **Klasa `Scanner`** — pobieranie danych od użytkownika.
- **Pętle i instrukcje warunkowe** — obsługa menu i wykonywanie operacji.

## Uruchomienie programu

1. Umieść wszystkie cztery pliki `.java` w tym samym katalogu.
2. Skompiluj pliki poleceniem:

   ```bash
   javac SprzetElektroniczny.java Laptop.java Smartfon.java Main.java
