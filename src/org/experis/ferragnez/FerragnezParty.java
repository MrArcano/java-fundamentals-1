package org.experis.ferragnez;

import java.util.Scanner;

public class FerragnezParty {
//    Bonus: Festa Ferragnez :palla_da_discoteca:
//    State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi che accedano alla festa solo gli invitati presenti sulla lista (in fondo al post).
//    Nel programma bisogna:
//    creare e inizializzare l’array contenente i nomi degli invitati
//    chiedere all’utente come si chiama
//    verificare che il nome sia presente nella lista
//    lasciarlo entrare o rispedirlo cortesemente da dove è venuto :occhiali_da_sole:
//    Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic
    public static void main(String[] args) {
        String[] guestList = {"Dua Lipa",
                              "Paris Hilton",
                              "Manuel Agnelli",
                              "J-Ax",
                              "Francesco Totti",
                              "Ilary Blasi",
                              "Bebe Vio",
                              "Luis",
                              "Pardis Zarei",
                              "Martina Maccherone",
                              "Rachel Zeilic"};

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = keyboard.next();
        boolean exist = false;

        for (int i = 0; i < guestList.length; i++) {
            if (guestList[i].equals(name)) exist = true;
        }
        System.out.println(exist ? "Sei dentro la lista" : "Non in lista");
        keyboard.close();
    }
}
