package pl.jg;

import java.text.ParseException;

public class Function5b_binaryToHexadecimal {
    static void binaryToHexadecimal() {
        System.out.println("Wprowadź liczbę zapisaną systemem dwójkowym");
        String binaryNumber = Main.sc.nextLine();
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
}
