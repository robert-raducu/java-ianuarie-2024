package curs.curs10;

//Exercitii:
//        -crearea a 3 clase: Om, Contract, Student.
//        -4 proprietati pentru fiecare clasa.
//        -2 constructori pentru fiecare clasa.
//        -getteri si setteri pentru fiecare clasa.
//        -2 obiecte pentru fiecare clasa pe care vom avea toate proprietatile setate.

public class Main {
    public static void main(String[] args){
        /** creat un obiect de tip floare / am creat o instanta de tip floare **/
        Floare lalea = new Floare(3,"verde");
        int number = lalea.metodaCareIntoarce10();
        System.out.println(number);

        String var = "leu   ";
        System.out.println(var.trim().toUpperCase().charAt(1));
        System.out.println(var.replace("l","L"));
        System.out.println(var);

        Om primulOm = new Om( 190.2,"Cicatrice");
        System.out.println(primulOm.getInaltime());
    }

}
