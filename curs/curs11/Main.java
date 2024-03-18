package curs.curs11;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

//        String denumireFirma = "Curs.Inc"; // tip de date imutabil
//        denumireFirma = "Altadenumire.Inc";
//
//        StringBuilder denumireContract = new StringBuilder("Contract de studii");
//        denumireContract.append(" de anul acesta ");
//        System.out.println(denumireContract);
//        denumireContract.append(1);
//        System.out.println(denumireContract);
//
//        System.out.println(denumireContract.indexOf("c"));
//        System.out.println(denumireContract.substring(0,11));
//        System.out.println(denumireContract.insert(1,"CUVANT_NOU"));
//
//        System.out.println(denumireContract);
//
//        System.out.println(denumireContract.deleteCharAt(3));
//        System.out.println(denumireContract.reverse());
//        System.out.println(denumireContract.toString());
//
//        Double sumaContract = 100.22; // obiect, nu primitiva
//        int sumaContractIntreg = 100; // Integer
//
//        String sumaContractString = String.valueOf(sumaContract);
//
//        System.out.println(sumaContract.toString());
//
//        ///
//
//        LocalDate dataCurenta = LocalDate.now();
//        System.out.println(dataCurenta);
//
//        LocalDateTime momentulCurent = LocalDateTime.now();
//        LocalDate dataDeIeri = LocalDate.of(2024, 3, 4);
//        System.out.println(dataDeIeri);
//
//        LocalDateTime momentulDeIeri = LocalDateTime.of(2024,3,4,16,58);
//        System.out.println(momentulDeIeri);
//        System.out.println(LocalDate.now().minusDays(1));

        String aluna = "arahida";
        char caracter1 = 'a';
        char caracter2 = 't';

        System.out.println(aluna.replace(caracter1,caracter2));

        String masina = " Volvo ";
        System.out.println(masina.trim());

        Fruct capsuna = new Fruct("capsuna","rosu","rotunda",100);
        Leguma telina = new Leguma("telina","alba","lunguiata","aromat");

        capsuna.afiseazaMetodaUnu();
        System.out.println(capsuna.getNrSeminte());

        telina.afiseazaTextura();
        System.out.println(telina.getGust());
    }
}
