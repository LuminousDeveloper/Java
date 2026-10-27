# ☕ Programowanie Obiektowe (Java) — projekty z zajęć

Przedmiot: **Programowanie Obiektowe** — praca w **IntelliJ IDEA**, język **Java**.
Zasada porządkowa: **jeden projekt = jeden katalog** w głównym katalogu repo.

## 🗂️ Projekty

| # | Projekt | Temat | Kod źródłowy |
|---|---------|-------|--------------|
| 1 | [`MagazynElektronika/`](MagazynElektronika) | System zarządzania magazynem sklepu z elektroniką — konsolowe menu z klasą `Scanner` | [`src/`](MagazynElektronika/src) |

## 💡 Zagadnienia z projektu 1

Klasy i obiekty, dziedziczenie (`extends`), nadpisywanie metod, konstruktory, `this`, klasa `Scanner`, pętle i instrukcje warunkowe — szczegóły w [`MagazynElektronika/README.md`](MagazynElektronika/README.md).

## 🏗️ Struktura repozytorium

```
Java/
├── README.md                  ← ten plik (spis projektów)
└── MagazynElektronika/        ← projekt 1: magazyn sklepu z elektroniką
    ├── README.md              ← szczegółowy opis projektu
    ├── src/                   ← kod źródłowy (klasy Java)
    ├── MagazynElektronika.iml ← moduł IntelliJ IDEA
    └── .idea/                 ← konfiguracja IntelliJ IDEA
```

## 🚀 Jak uruchomić wybrany projekt

1. Sklonuj repo:
   ```bash
   git clone https://github.com/LuminousDeveloper/Java.git
   ```
2. W **IntelliJ IDEA**: **File → Open…** i wybierz katalog *konkretnego projektu*, np. `MagazynElektronika`.
3. Kliknij zielony przycisk ▶ przy metodzie `main` w klasie `Main` — program uruchamia interaktywne menu w konsoli.
