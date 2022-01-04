



package com.vitalijsm;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String phrase;

        System.out.println("Labdien! Vai gribat kļūt par RCS studentu? ");

       phrase = scanner.nextLine();

        if(phrase.equals("Jā")) {
            System.out.println("Kas tieši Jūs interesē: Java, PHP, Phyton, SQL, Iesācēju pamatkurss, cits?");
        } else {
            System.out.println("Plašākai informācijai lūgums zvanīt +37123220885!");
        }

        String firstAnswer;

        firstAnswer = scanner.nextLine();

        if(firstAnswer.equals("Java")) {
            System.out.println("Java tuvākais kurss būs 10.01.2022. Plašākai informācijai lūgums zvanīt +37123220885! Paldies, ka izvēlējaties RCS!");
        }
        if(firstAnswer.equals("PHP")) {
            System.out.println("PHP tuvākais kurss būs 13.01.2022. Plašākai informācijai lūgums zvanīt +37123220885! Paldies, ka izvēlējaties RCS!");
        }
        if(firstAnswer.equals("Phyton")) {
            System.out.println("Phyton tuvākais kurss būs 20.01.2022. Plašākai informācijai lūgums zvanīt +37123220885! Paldies, ka izvēlējaties RCS!");
        }
        if(firstAnswer.equals("SQL")) {
            System.out.println("SQL tuvākais kurss būs 22.01.2022. Plašākai informācijai lūgums zvanīt +37123220885! Paldies, ka izvēlējaties RCS!");
        }
        if(firstAnswer.equals("Iesācēju pamatkurss")) {
            System.out.println("Tuvākais Iesācēju pamatkurss būs 02.02.2022. Plašākai informācijai lūgums zvanīt +37123220885! Paldies, ka izvēlējaties RCS!");
        }
        if(firstAnswer.equals("cits")) {
            System.out.println("Vai Jums interesē C++?");
        } else {
            System.out.println("Plašākai informācijai lūgums zvanīt +37123220885!");
        }

        String secondAnswer;

        secondAnswer = scanner.nextLine();

        if(secondAnswer.equals("Jā")) {
            System.out.println("C++ tuvākais kurss sāksies tikai maijā! Plašākai informācijai lūgums zvanīt +37123220885!!");
        }
        if(secondAnswer.equals("Nē")) {
            System.out.println("Plašākai informācijai lūgums zvanīt +37123220885!");
        }

    }
}


