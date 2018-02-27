package pl.jg;

import java.util.Scanner;

import static java.lang.System.in;
import static pl.jg.NumberSystemConverter.numberSystemConverter;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        System.out.println("Podaj nazwę użytkownika - moja propozycja to \"user\"");
        String userName = sc.nextLine();
        if (!userName.equals("user")) {
            System.out.println("Niepoprawna nazwa użytkownika. Zamykanie programu.");
            System.exit(0);
        }
        System.out.println("Podaj hasło - moja propozycja to \"password\"");
        String userPassword = sc.nextLine();
        if (!userPassword.equals("password")) {
            System.out.println("Niepoprawne hasło. Zamykanie programu.");
            System.exit(0);
        }


        while (true) {

            System.out.println("Wybierz akcję - wciśnij odpowiedni klawisz i zatwierdź enterem.");
            System.out.println("1 - dodawanie");
            System.out.println("2 - mnożenie");
            System.out.println("3 - dzielenie");
            System.out.println("4 - pierwiastek");
            System.out.println("5 - konwersja między systemami liczb");
            System.out.println("6 - oblicz medianę");
            System.out.println("7 - oblicz średnią");
            System.out.println("x - wyjdź z programu");
            String chosenAction = sc.nextLine().toLowerCase();
            switch (chosenAction) {
                case "1":
                    ArithmeticOperations.sumOfElements(sc);
                    break;
                case "2":
                    ArithmeticOperations.multiply(sc);
                    break;
                case "3":
                    ArithmeticOperations.divide(sc);
                    break;
                case "4":
                    ArithmeticOperations.root(sc);
                    break;
                case "5":
                    numberSystemConverter(sc);
                    break;
                case "6":
                    ArithmeticOperations.median(sc);
                    break;
                case "7":
                    ArithmeticOperations.average(sc);
                    break;
                case "x":
                    System.out.println("Do widzenia, zapraszamy ponownie!");
                    System.exit(0);
                default:
                    System.out.println("Coś źle wprowadziłeś.\n");
            }
        }
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
