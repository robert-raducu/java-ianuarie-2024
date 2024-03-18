package curs.curs12;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        /** random **/
//        Random random = new Random();
//        System.out.println(random.nextInt(1,10));

        /** scanner **/
//        Scanner scanner = new Scanner(System.in);
//        int numarUtilizator = 0;
//        while(numarUtilizator != 10){
//            numarUtilizator = scanner.nextInt();
//            System.out.println("Este nevoie de 10");
//        }
//        System.out.println("Numar primit este: "+numarUtilizator);
        /** math **/
//        double numarMaxim = Math.max(3.4,3.5);
//        System.out.println(numarMaxim);

        /** array */
//        int[] arrayNou = new int[]{10, 20, 30};
//        int numarElemente = arrayNou.length;
//        System.out.println(numarElemente);
//        System.out.println(arrayNou.length);

        String[] listaDeFructe = {"Mar", "Para", "Banana"};
//        System.out.println(listaDeFructe[1]);
//        int[][] numarElementeMatrice = {{1, 2}, {3, 4}, {5, 6}};
//        System.out.println(numarElementeMatrice.length);

//        for(int i = 0; i < listaDeFructe.length;i++){
//            System.out.println(listaDeFructe[i]);
//        }
//
//        // varianta alternativa de parcurgere a unui for intr un vector
//        for(String fruct : listaDeFructe){
//            System.out.println(fruct);
//        }

        String[] listaCopiataFructe = Arrays.copyOfRange(listaDeFructe,0,1);
        for(String fruct : listaCopiataFructe){
            System.out.println(fruct+"COPIE");
        }

        Arrays.sort(listaDeFructe);
        for(String fruct : listaDeFructe){
            System.out.println(fruct);
        }
    }


}
