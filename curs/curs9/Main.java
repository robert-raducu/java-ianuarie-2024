package curs.curs9;

//-crearea a 3 clase: Bloc, Contract, Laptop
//-pentru fiecare clasa -> vom pune 4 proprietati, constructor,
// 1 metoda(daca reusim e okay, daca nu rezolvam)
//
//-intr-un for(){} cu indexul initializat cu valoarea 10, afisam un mesaj daca
//indexul ajunge la valoarea 3.

public class Main {
    public static void main(String[] args) {

        /**EXEMPLU BREAK*/

        DENUMIRE:
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

            /* PAR */
            if (i % 2 == 0) {
                System.out.println("Am gasit numar par: " + i);
                break DENUMIRE;
            }
        }

        /**EXEMPLU CONTINUE*/
        DENUMIRE:
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

            /* PAR */
            if (i % 2 == 0) {
                System.out.println("Am gasit numar par: " + i);
                continue;
            }
            System.out.println("Am trecut de continue");
        }

        //Exercitiu

        for (int i = 10;i>=0;i--){
            if ( i == 3){
                System.out.println("Indexul are valoarea 3");
                break;
            }
        }
    }
}
