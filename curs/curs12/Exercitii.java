package curs.curs12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

//-Write a program that prints the current date and time.
//        -Add 5 hours and 30 minutes to the current time and print it.
//        -From a given LocalDateTime, extract the date and time and print them
//        separately.(methods: toLocalDate(), toLocalTime())
//        -Check if a given date-time is before or after the current date-time.
//        (methods: LocalDateTime.of(), isBefore() )
//        -Convert a string representing date-time in the format yyyy-MM-dd HH:mm to LocalDateTime.
//-Generate a random integer between 1 and 300.

// https://github.com/iulian1i/java-ianuarie-2024/blob/main/curs/curs12/Main.java
public class Exercitii {
    public static void main(String[] args) {
        LocalDate dataCurenta = LocalDate.now();
        System.out.println(dataCurenta);

        LocalDateTime dataCurentaOre = dataCurenta.atStartOfDay().plusHours(5).plusMinutes(30);
        System.out.println("Data dupa 5 ore jumatate: " + dataCurentaOre);

        LocalDateTime dataDeTimp = LocalDateTime.now();
        LocalDate data = dataDeTimp.toLocalDate();
        LocalTime timp = dataDeTimp.toLocalTime();
        System.out.println("Am extras: " + data);
        System.out.println("Am extras timpul: " + timp);

        LocalDateTime now = LocalDateTime.of(2024,03,30,16,35,34,1000);
        if(now.isBefore(dataDeTimp)){
            System.out.println("Inainte de data curenta");
        }
        else{
            System.out.println("Dupa data curenta");
        }

        System.out.println("----");
        String SirDeCaractere = "2024-04-04 13:21";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime StringInData = LocalDateTime.parse(SirDeCaractere,formatter);
        System.out.println(StringInData);
        System.out.println("----");

        Random rand = new Random();
        System.out.println(rand.nextInt(1,1096));
    }
}
