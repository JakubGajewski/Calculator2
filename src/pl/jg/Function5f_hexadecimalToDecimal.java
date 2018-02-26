package pl.jg;

public class Function5f_hexadecimalToDecimal {
    static void hexadecimalToDecimal(){

        System.out.println("Wprowadź liczbę zapisaną systemem szesnastkowym");
        String hexadecimalNumber = Main.sc.nextLine().toUpperCase();
        int count = hexadecimalNumber.length()-1;
        int decimalNumber = 0;
        int iteration = 0;
        while (count >= 0) {
            char hexadecimalChar = hexadecimalNumber.charAt(count);
            if (hexadecimalChar >= 48 && hexadecimalChar <= 57) {
                decimalNumber += ((hexadecimalChar -48)*Math.pow(16,iteration));
            } else if (hexadecimalChar >= 65 && hexadecimalChar <= 70) {
                decimalNumber += ((hexadecimalChar -55)*Math.pow(16,iteration));
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
