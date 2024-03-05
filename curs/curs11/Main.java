package curs.curs11;

public class Main {
    public static void main(String[] args) {

        String denumireFirma = "Curs.Inc"; // tip de date imutabil
        denumireFirma = "Altadenumire.Inc";

        StringBuilder denumireContract = new StringBuilder("Contract de studii");
        denumireContract.append(" de anul acesta ");
        System.out.println(denumireContract);
        denumireContract.append(1);
        System.out.println(denumireContract);

        System.out.println(denumireContract.indexOf("c"));
        System.out.println(denumireContract.substring(0,11));
        System.out.println(denumireContract.insert(1,"CUVANT_NOU"));

        System.out.println(denumireContract);

        System.out.println(denumireContract.deleteCharAt(3));
        System.out.println(denumireContract.reverse());
        System.out.println(denumireContract.toString());

        Double sumaContract = 100.22; // obiect, nu primitiva
        int sumaContractIntreg = 100; // Integer
        System.out.println(sumaContract.toString());
    }
}
