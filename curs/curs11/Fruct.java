package curs.curs11;

//-Create a Java program that replaces all occurrences of a specified character in a
//given string with another character and prints the new string.
//-Create a Java program that removes the leading and trailing spaces from a given string and
//prints the new string.

//        OOP:
//        -crearea a 2 clase: Fruct, Leguma.
//        -crearea a 4 proprietati pentru fiecare,
//        -2 metode in clasa Fruct care vor afisa "Am rulat metoda+denumirea_metodei"
//        -creare getteri pentru 2 proprietati ale clasei Fruct
public class Fruct {
    String nume;
    String culoare;
    String forma;
    int nrSeminte;

    public Fruct(String numeParam, String culoareParam, String formaParam, int nrSeminteParam) {
        this.nume = numeParam;
        this.culoare = culoareParam;
        this.forma = formaParam;
        this.nrSeminte = nrSeminteParam;
    }

    void afiseazaMetodaUnu() {
        System.out.println("Aceasta este prima metoda");
    }

    void afiseazaMetodaDoi() {
        System.out.println("Aceasta este a doua metoda");
    }

    public String getNume() {
        return nume;
    }

    public int getNrSeminte() {
        return nrSeminte;
    }
}
