package org.experis.train;

import java.util.Scanner;

public class CalcolaBiglietto {

//    Esercizio 1: Biglietto del treno
//    Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e l’età del passeggero.
//    Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
//    il prezzo del biglietto è definito in base ai km (0.21 € al km) va applicato uno sconto del 20% per i minorenni va applicato uno sconto del 40% per gli over 65.
//    Il programma va implementato nel metodo main della classe CalcolaBiglietto. Per acquisire l’input dell’utente usate la classe Scanner, come visto stamattina a lezione.
    public static void main(String[] args) {
        double priceKm = 0.21;
        int discount = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Numero di chilometri che vuoi percorrere: ");
        int km = keyboard.nextInt();

        System.out.print("Età: ");
        int age = keyboard.nextInt();

        if (age < 18) discount = 20;
        if (age > 65) discount = 40;

        double priceTicket = (double) (km * priceKm) * ((100.0 - discount) / 100);

        System.out.println("Price Ticket: " + priceTicket);

        keyboard.close();

    }
}