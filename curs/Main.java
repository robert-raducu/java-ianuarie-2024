package curs;

public class Main {

    public static void main(String[] args) {
        int y = 2;
        double z = 3.0;
        double x = 3 + 6 * --y;
        String firstName = "Georgiana";
        String lastName = "Bivolaru";
        System.out.println(y);
        System.out.println(x);
        System.out.println(firstName + " " + lastName);

        boolean a = false;
        System.out.println(a);
        System.out.println(" ");

        int counter = 0;
        System.out.println(counter);
        System.out.println(counter++);
        System.out.println(counter--);
        System.out.println(--counter);
        System.out.println(++counter);
        System.out.println(" ");

        System.out.println("Variabila x este " + x);
        System.out.println(x*=z);
    }

}
