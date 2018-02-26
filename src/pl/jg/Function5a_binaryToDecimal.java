package pl.jg;

public class Function5a_binaryToDecimal {
    static void binaryToDecimal() {
        System.out.println("Wprowadź liczbę zapisaną systemem dwójkowym");
        String binaryNumber = Main.sc.nextLine();
        int count = binaryNumber.length()-1;
        int decimalNumber = 0;
        int iteration = 0;
        while (count >= 0) {
            char binaryChar = binaryNumber.charAt(count);
            if (binaryChar == 48) {
            } else if (binaryChar == 49) {
                decimalNumber += Math.pow(2,iteration);
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
