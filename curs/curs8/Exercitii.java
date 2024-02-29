package curs.curs8;

import java.util.Scanner;

public class Exercitii {
    public static void main(String[] args) {
        /** prima cerinta **/
//        for(int i = 1; i < 11; i++){
//            System.out.println(i);
//        }

        /** a doua cerinta **/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int odd = 0;
        int even = 0;
        for (int idx = 1; idx < n; idx++) {
            if (idx % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Odd numbers: " + odd + " and even numbers: " + even);

        /** a treia cerinta **/
        int abc = 5;
        if (abc > 10) {
            System.out.println("The number is greater than 10");
        } else
            System.out.println("The number is not greater than 10");
    }
}
