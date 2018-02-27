package pl.jg;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticOperations {
    static void average(Scanner sc) {
        System.out.println("Podaj liczby, jakich średnią chcesz uzyskać.");
        double sum = 0;
        String input = "";

        try {
            sum = 0;
            int count = 0;
            input = sc.nextLine();
            for (String s : input.split(" ")) {
                sum += Double.valueOf(s);
                count++;
            }

        } catch (NumberFormatException NFE) {
            System.out.println("Wprowadziłeś niepoprawne dane.\n");
            return;
        }

        System.out.println("Srednia podanych liczb to: " + sum / input.split(" ").length);

    }

    static void divide(Scanner sc) {
        System.out.println("Podaj liczby, jakie chcesz podzielić. Rozdziel je spacjami.");

        try {
            String input = sc.nextLine();
            String[] inputArray = new String[input.split(" ").length];
            inputArray = input.split(" ");
            double quotient = Double.valueOf(inputArray[0]);
            for (int i = 1; i < input.split(" ").length; i++) {
                if (i == 0) {
                    System.out.println("Nie dzieli się przez zero!");
                    break;
                }
                quotient /= Double.valueOf(Double.valueOf(inputArray[i]));
            }
            System.out.println("Iloraz podanych liczb to: " + quotient);

        } catch (NumberFormatException NFE) {
            System.out.println("Wprowadziłeś niepoprawne dane.");
        }
    }

    static void median(Scanner sc) {
        System.out.println("Podaj liczby, jakich medianę chcesz uzyskać.");
        double median = 0;
        String input = "";

        try {
            int count = 0;
            input = sc.nextLine();
            double[] arrayOfDoubles = new double[input.split(" ").length];
            for (String s : input.split(" ")) {
                arrayOfDoubles[count] = Double.parseDouble(s);
                count++;
            }
            Arrays.sort(arrayOfDoubles);
            int arrayOfDoublesLength = arrayOfDoubles.length;
            if (arrayOfDoubles.length % 2 != 0) {
                median = arrayOfDoubles[arrayOfDoublesLength / 2];
            } else {
                median = (arrayOfDoubles[arrayOfDoublesLength / 2 - 1] + arrayOfDoubles[arrayOfDoublesLength / 2]) / 2;
            }


        } catch (NumberFormatException NFE) {
            System.out.println("Wprowadziłeś niepoprawne dane.\n");
            return;
        }
        System.out.println("Mediana podanych liczb to: " + median);
    }

    static void root(Scanner sc) {

        System.out.println("Podaj liczbę, której pierwiastek chcesz uzyskać.");

        double x = 0;
        int n = 0;

        try {
            x = Double.valueOf(sc.nextLine());
        } catch (NumberFormatException NFE) {
            System.out.println("Wprowadziłeś niepoprawne dane.");
        }

        System.out.println("Podaj stopień pierwiastka.");

        try {
            n = Integer.valueOf(sc.nextLine());
        } catch (NumberFormatException NFE) {
            System.out.println("Wprowadziłeś niepoprawne dane.");
        }

        System.out.println("Zadany pierwiastek to: " + Math.pow(x, (1d / n)));
    }

    static void multiply(Scanner sc) {

        System.out.println("Podaj liczby, jakie chcesz pomnożyć. Rozdziel je spacjami.");

        try {
            double product = 1;
            String input = sc.nextLine();
            for (String s : input.split(" ")) {
                product *= Double.valueOf(s);
            }
            System.out.println("Iloczyn podanych liczb to: " + product);

        } catch (NumberFormatException NFE) {
            System.out.println("Coś pomyliłeś. Wprowadzono niepoprawne dane!\n");
        }
    }

    static void sumOfElements(Scanner sc) {

        System.out.println("Podaj liczby, jakie chcesz zsumować. Rozdziel je spacjami.");

        try {
            double sum = 0;
            String input = sc.nextLine();
            for (String s : input.split(" ")) {
                sum += Double.valueOf(s);
            }
            System.out.println("Suma podanych liczb to: " + sum);

        } catch (NumberFormatException NFE) {
            System.out.println("Wprowadziłeś niepoprawne dane.");
        }
    }
}
