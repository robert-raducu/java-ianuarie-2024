package curs.curs8;

public class Main {

    public static void main(String[] args) {

//        String variabilaTest = "ceva";
//
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i);
//        }

        int numarCursuri = 4;
        switch (numarCursuri) {
            case 3:
                System.out.println("Destule");
                break;
            case 9:
                System.out.println("Prea multe");
                break;
            case 10:
                System.out.println("Noapte buna!");
                break;
            default:
                System.out.println("Nu e un caz adevarat");
        }

        int numarZileDeVacanta = 10;
        while (numarZileDeVacanta < 20) {
            System.out.println(numarZileDeVacanta);
            numarZileDeVacanta++;
        }

        System.out.println(" ");

        int doVar = 100;
        do {
            System.out.println(doVar);
            doVar++;
        } while (doVar < 110);
    }
}
