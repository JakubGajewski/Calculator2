package pl.jg;

public class Function5d_decimalToHexadecimal {
    static void decimalToHexadecimal() {
        System.out.println("Wprowadź liczbę zapisaną systemem dziesiętnym");
        try {
            int decimalNumber = Integer.valueOf(Main.sc.nextLine());
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
}
