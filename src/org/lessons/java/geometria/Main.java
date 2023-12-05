package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creazione di uno scanner per leggere input da terminale
        Scanner scanner = new Scanner(System.in);

        // Richiesta all'utente di inserire base e altezza
        System.out.print("Inserisci la base del rettangolo: ");
        int base = scanner.nextInt();

        System.out.print("Inserisci l'altezza del rettangolo: ");
        int altezza = scanner.nextInt();

        // Creazione di un nuovo oggetto Rettangolo
        Rettangolo rettangolo = new Rettangolo(base, altezza);

        // Calcolo e stampa dell'area e del perimetro
        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
        System.out.println("Il perimetro del rettangolo è: " + rettangolo.calcolaPerimetro());

        // Chiusura dello scanner
        scanner.close();
    }
}