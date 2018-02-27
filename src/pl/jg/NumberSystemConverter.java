package pl.jg;

import java.util.Scanner;

public class NumberSystemConverter {
    static void numberSystemConverter(Scanner sc) {
        System.out.println("    Wybierz akcję - wciśnij odpowiedni klawisz i zatwierdź enterem.");
        System.out.println("    A - System dwójkowy do systeny dziesiętnego");
        System.out.println("    B - System dwójkowy do systemu szesnastkowego");
        System.out.println("    C - System dziesiętny do systemu dwójkowego");
        System.out.println("    D - System dziesiętny do systemu szesnastkowego");
        System.out.println("    E - System szesnastkowy do systemu dwójkowgo");
        System.out.println("    F - System szesnastkowy do systemu dziesiętnego");

        String chosenAction = sc.nextLine().toUpperCase();
        switch (chosenAction) {
            case "A":
                binaryToDecimal(sc);
                break;
            case "B":
                binaryToHexadecimal(sc);
                break;
            case "C":
                decimalToBinary(sc);
                break;
            case "D":
                decimalToHexadecimal(sc);
                break;
            case "E":
                hexadecimalToBinary(sc);
                break;
            case "F":
                hexadecimalToDecimal(sc);
                break;
            default:
                System.out.println("Coś źle wprowadziłeś.\n");
                numberSystemConverter(sc);
        }
    }

    static void binaryToDecimal(Scanner sc) {
        System.out.println("Wprowadź liczbę zapisaną systemem dwójkowym");
        String binaryNumber = sc.nextLine();
        int count = binaryNumber.length() - 1;
        int decimalNumber = 0;
        int iteration = 0;
        while (count >= 0) {
            char binaryChar = binaryNumber.charAt(count);
            if (binaryChar == 48) {
            } else if (binaryChar == 49) {
                decimalNumber += Math.pow(2, iteration);
            } else {
                System.out.println("Wprowadzono niepoprawne dane");
                break;
            }
            count--;
            iteration++;
        }
        System.out.println("Podana liczba w systemie dziesiętnym to: " + decimalNumber);
    }

    static void binaryToHexadecimal(Scanner sc) {
        System.out.println("Wprowadź liczbę zapisaną systemem dwójkowym");
        String binaryNumber = sc.nextLine();
        int count = binaryNumber.length() - 1;
        int decimalNumber = 0;
        int iteration = 0;
        while (count >= 0) {
            char binaryChar = binaryNumber.charAt(count);
            if (binaryChar == 48) {
            } else if (binaryChar == 49) {
                decimalNumber += Math.pow(2, iteration);
            } else {
                System.out.println("Wprowadzono niepoprawne dane");
                break;
            }
            count--;
            iteration++;
        }
        StringBuilder reversedHexNumber = new StringBuilder("");
        int modulo;
        while (decimalNumber > 0) {
            modulo = decimalNumber % 16;
            if (modulo < 10) {
                reversedHexNumber.append(modulo);
            } else {
                reversedHexNumber.append((char) (modulo + 55));
            }
            decimalNumber /= 16;
        }
        System.out.println("Podana liczba w systemie szesnastkowym to: " + reversedHexNumber.reverse().toString());
    }

    static void decimalToBinary(Scanner sc) {
        System.out.println("Wprowadź liczbę zapisaną systemem dziesiętnym");
        try {
            int decimalNumber = Integer.valueOf(sc.nextLine());
            StringBuffer reversedBinNumber = new StringBuffer("");
            int modulo;
            while (decimalNumber > 0) {
                modulo = decimalNumber % 2;
                reversedBinNumber.append(modulo);
                decimalNumber /= 2;
            }
            System.out.println("Podana liczba w systemie szesnastkowym to: " + reversedBinNumber.reverse().toString());
        } catch (NumberFormatException NFE) {
            System.out.println("Wprowadzono błędne dane");
        }
    }

    static void decimalToHexadecimal(Scanner sc) {
        System.out.println("Wprowadź liczbę zapisaną systemem dziesiętnym");
        try {
            int decimalNumber = Integer.valueOf(sc.nextLine());
            StringBuilder reversedHexNumber = new StringBuilder("");
            int modulo;
            while (decimalNumber > 0) {
                modulo = decimalNumber % 16;
                if (modulo < 10) {
                    reversedHexNumber.append(modulo);
                } else {
                    reversedHexNumber.append((char) (modulo + 55));
                }
                decimalNumber /= 16;
            }
            System.out.println("Podana liczba w systemie szesnastkowym to: " + reversedHexNumber.reverse().toString());
        } catch (NumberFormatException NFE) {
            System.out.println("Wprowadzono błędne dane");
        }
    }

    static void hexadecimalToBinary(Scanner sc) {
        System.out.println("Wprowadź liczbę zapisaną systemem szesnastkowym");
        String hexadecimalNumber = sc.nextLine().toUpperCase();
        int count = hexadecimalNumber.length() - 1;
        int decimalNumber = 0;
        int iteration = 0;
        while (count >= 0) {
            char hexadecimalChar = hexadecimalNumber.charAt(count);
            if (hexadecimalChar >= 48 && hexadecimalChar <= 57) {
                decimalNumber += ((hexadecimalChar - 48) * Math.pow(16, iteration));
            } else if (hexadecimalChar >= 65 && hexadecimalChar <= 70) {
                decimalNumber += ((hexadecimalChar - 55) * Math.pow(16, iteration));
            } else {
                System.out.println("Wprowadzono niepoprawne dane");
                break;
            }
            count--;
            iteration++;
        }
        System.out.println("Wprowadź liczbę zapisaną systemem dziesiętnym");
        decimalNumber = Integer.valueOf(sc.nextLine());
        StringBuilder reversedBinNumber = new StringBuilder("");
        int modulo;
        while (decimalNumber > 0) {
            modulo = decimalNumber % 2;
            reversedBinNumber.append(modulo);
            decimalNumber /= 2;
        }
        System.out.println("Podana liczba w systemie szesnastkowym to: " + reversedBinNumber.reverse().toString());
    }

    static void hexadecimalToDecimal(Scanner sc) {

        System.out.println("Wprowadź liczbę zapisaną systemem szesnastkowym");
        String hexadecimalNumber = sc.nextLine().toUpperCase();
        int count = hexadecimalNumber.length() - 1;
        int decimalNumber = 0;
        int iteration = 0;
        while (count >= 0) {
            char hexadecimalChar = hexadecimalNumber.charAt(count);
            if (hexadecimalChar >= 48 && hexadecimalChar <= 57) {
                decimalNumber += ((hexadecimalChar - 48) * Math.pow(16, iteration));
            } else if (hexadecimalChar >= 65 && hexadecimalChar <= 70) {
                decimalNumber += ((hexadecimalChar - 55) * Math.pow(16, iteration));
            } else {
                System.out.println("Wprowadzono niepoprawne dane");
                break;
            }
            count--;
            iteration++;
        }
        System.out.println("Podana liczba w systemie dziesiętnym to: " + decimalNumber);
    }
}



