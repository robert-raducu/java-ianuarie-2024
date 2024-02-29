package curs.curs10;

public class Main {
    public static void main(String[] args){
        /** creat un obiect de tip floare / am creat o instanta de tip floare **/
        Floare lalea = new Floare(3,"verde");
        int number = lalea.metodaCareIntoarce10();
        System.out.println(number);
    }

}
