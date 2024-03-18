package curs.curs13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//-creare clase Bloc, Apartament, Masina.
//-4 proprietati pentru fiecare.
//-creare getteri, setteri.
//-creare 4 metode statice pentru fiecare clasa.
//-creare 2 propretati statice pentru fiecare clasa.
//-creare 1 obiect pentru fiecare clasa cu proprietatile populate.

public class Main {
    public static void main(String[] args) {

        String[] listaDeFructe = {"Mar", "Para", "Banana"};

        Arrays.sort(listaDeFructe);
        for(String fruct : listaDeFructe){
            System.out.println(fruct);
        }

        System.out.println("Mai sus am sortarea pentru listaDeFructe");

        /** NU copiem array ul de mai jos**/
        String[] listaDeFructeTryCopy = listaDeFructe;
        Arrays.sort(listaDeFructeTryCopy, Comparator.reverseOrder());
        for(String fruct : listaDeFructe){
            System.out.println(fruct);
        }

        /** STATIC **/

        Contract contract = new Contract();
        Contract.metodaContract();

        String variabilaNumar = String.valueOf(3);
        System.out.println(Contract.numarDePagini); // se apeleaza cu denumirea clasei
        // Contract.numarDePagini;


        /** ARRAY LIST **/

        ArrayList arrayList1 = new ArrayList();
    }
}
