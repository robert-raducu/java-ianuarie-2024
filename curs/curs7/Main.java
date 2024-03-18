package curs.curs7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Person persoanaNoua1 = new Person();
//        Person persoanaNoua2 = new Person();

//        persoanaNoua1.name = "Andrei";
//        persoanaNoua2.name = "Maria";
//        persoanaNoua1.age = 11;
//        persoanaNoua2.age = 45;

//        System.out.println("Numele fetei este " + persoanaNoua2.name);
//        if (persoanaNoua1.age != persoanaNoua2.age){
//            System.out.println("Varsta este diferita");
//        }

//        Person persoana3 =  new Person("Aristotel", 54);
//        System.out.println(persoana3.name);

//        Scanner scanner = new Scanner(System.in);
//        int numarUtilizator = scanner.nextInt();
//        System.out.println(numarUtilizator);

        Bloc bloc1 = new Bloc(true,1990,7);
        Bloc bloc2 = new Bloc(true,2010,6);
        Bloc bloc3 = new Bloc(false,1988,12);

        Contract contract1 = new Contract("cerere","errbat",12);
        Contract contract2 = new Contract("adeverinta","a3f445",4);
        Contract contract3 = new Contract("indemnizatie","aas2235",8);

        Masina masina1 = new Masina(2021,"albastra","Ferrari");
        Masina masina2 = new Masina(1978,"rosie","Dacia");
        Masina masina3 = new Masina(2001,"neagra","Volkswagen");

        if(masina2.anFabricatie > 2020){
            System.out.println("Este noua!");
        }
        else {
            System.out.println("Este veche!");
        }
    }
}
