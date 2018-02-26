package pl.jg;

public class Function5e_hexadecimalToBinary {
    static void hexadecimalToBinary() {
        System.out.println("Wprowadź liczbę zapisaną systemem szesnastkowym");
        String hexadecimalNumber = Main.sc.nextLine().toUpperCase();
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
        decimalNumber = Integer.valueOf(Main.sc.nextLine());
        StringBuilder reversedBinNumber = new StringBuilder("");
        int modulo;
        while (decimalNumber > 0) {
            modulo = decimalNumber % 2;
            reversedBinNumber.append(modulo);
            decimalNumber /= 2;
        }
        System.out.println("Podana liczba w systemie szesnastkowym to: " + reversedBinNumber.reverse().toString());

    }
}