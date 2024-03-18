package curs.curs14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> numeMasini = new ArrayList<>(); //nu avem o lungime definita
        numeMasini.add("Masina 1");
        numeMasini.add("Masina 2");
        numeMasini.add("Masina 3");

        for(String masina: numeMasini){
            System.out.println(masina);
        }

        System.out.println(numeMasini.get(1)); //nu putem sa il luam pur si simplu, pt ca e o clasa

        System.out.println("Lungimea ArrayList este:" + numeMasini.size());

        System.out.println("ArrayList NU este gol: " + !numeMasini.isEmpty());

        /* Sterge element */
        numeMasini.remove("Masina 1");

        /* Sterge tot ArrayList*/
        //numeMasini.clear();
        for(String masina: numeMasini){
            System.out.println(masina);
        }

        System.out.println("Contine acest element?" + numeMasini.contains("Masini 4"));

        /** SHOPPING CART **/
        List<Product> cart = new ArrayList<>();
        Product produsNou = new Product("ciocolata",15);
        cart.add(produsNou);

//        for(Product produs : cart){
        cart.remove(produsNou);
//}

        /** WRAPPER CLASSES **/
    }
}
