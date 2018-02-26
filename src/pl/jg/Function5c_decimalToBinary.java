package pl.jg;

public class Function5c_decimalToBinary {
    static void decimalToBinary() {
        System.out.println("Wprowadź liczbę zapisaną systemem dziesiętnym");
        try {
            int decimalNumber = Integer.valueOf(Main.sc.nextLine());
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
}
