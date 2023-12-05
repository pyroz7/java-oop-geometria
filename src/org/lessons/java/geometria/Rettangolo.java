package org.lessons.java.geometria;

public class Rettangolo {
    int base;
    int altezza;

    // Costruttore con parametri
    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Metodo per calcolare l'area
     int calcolaArea() {
        return base * altezza;
    }

    // Metodo per calcolare il perimetro
     int calcolaPerimetro() {
        return 2 * (base + altezza);
    }
}
