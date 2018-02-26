package pl.jg;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    static Scanner sc = new Scanner(in);

    public static void main(String[] args) {

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
                    Function1_SumOfElements.sumOfElements();
                    break;
                case "2":
                    Function2_Multiply.multiply();
                    break;
                case "3":
                    Function3_Division.divide();
                    break;
                case "4":
                    Function4_Root.root();
                    break;
                case "5":
                    Function5_NumberSystemConverter.numberSystemConverter();
                    break;
                case "6":
                    Function6_Median.median();
                    break;
                case "7":
                    Function7_Average.average();
                    break;
                case "x":
                    System.out.println("Do widzenia, zapraszamy ponownie!");
                    System.exit(0);
                default:
                    System.out.println("Coś źle wprowadziłeś.\n");
            }
        }

        // write your code here
    }
}
