package org.experis.food;

public class FavoriteFood {

//    Esercizio 2: Miei cibi preferiti :pizza::hamburger::avocado:
//    Nel programma inizializzate un array (con i metodi visti a lezione) con la classifica dei vostri cibi preferiti (minimo 5, massimo 10 elementi)
//    Poi stampate a video:
//    la lunghezza della classifica
//    il vostro cibo top (prima posizione della classifica)
//    il vostro cibo preferito ma non troppo (ultima posizione della classifica)
//    il cibo di mezza classifica, cioè che si trova nella posizione mediana

    public static void main(String[] args) {
        String[] favoriteFood = {"Pizza","Hamburger","Pasta","Gelato","Tacos","Insalata"};

        System.out.println("Ci sono " + favoriteFood.length + " cibi nella classifica");
        System.out.println("Il cibo top è: " + favoriteFood[0]);
        System.out.println("Il cibo bottom è: " + favoriteFood[favoriteFood.length - 1]);
        System.out.println("Il cibo middle è: " + favoriteFood[(favoriteFood.length - 1) / 2]);

    }
}
