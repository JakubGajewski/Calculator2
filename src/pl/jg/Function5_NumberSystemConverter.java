package pl.jg;

public class Function5_NumberSystemConverter {
    static void numberSystemConverter() {
        System.out.println("    Wybierz akcję - wciśnij odpowiedni klawisz i zatwierdź enterem.");
        System.out.println("    A - System dwójkowy do systeny dziesiętnego");
        System.out.println("    B - System dwójkowy do systemu szesnastkowego");
        System.out.println("    C - System dziesiętny do systemu dwójkowego");
        System.out.println("    D - System dziesiętny do systemu szesnastkowego");
        System.out.println("    E - System szesnastkowy do systemu dwójkowgo");
        System.out.println("    F - System szesnastkowy do systemu dziesiętnego");

        String chosenAction = Main.sc.nextLine().toUpperCase();
        switch (chosenAction) {
            case "A":
                Function5a_binaryToDecimal.binaryToDecimal();
                break;
            case "B":
                Function5b_binaryToHexadecimal.binaryToHexadecimal();
                break;
            case "C":
                Function5c_decimalToBinary.decimalToBinary();
                break;
            case "D":
                Function5d_decimalToHexadecimal.decimalToHexadecimal();
                break;
            case "E":
                Function5e_hexadecimalToBinary.hexadecimalToBinary();
                break;
            case "F":
                Function5f_hexadecimalToDecimal.hexadecimalToDecimal();
                break;
            default:
                System.out.println("Coś źle wprowadziłeś.\n");
                numberSystemConverter();
        }
    }
}



