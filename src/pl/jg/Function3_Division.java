package pl.jg;

public class Function3_Division {
    static void divide() {

        System.out.println("Podaj liczby, jakie chcesz podzielić. Rozdziel je spacjami.");

        try {
            String input = Main.sc.nextLine();
            String[] inputArray = new String [input.split(" ").length];
            inputArray = input.split(" ");
            double quotient = Double.valueOf(inputArray[0]);
            for (int i = 1; i < input.split(" ").length; i++) {
                if (i == 0){
                    System.out.println("Nie dzieli się przez zero!");
                    break;
                }
                quotient /= Double.valueOf(Double.valueOf(inputArray[i]));
            }
            System.out.println("Iloraz podanych liczb to: " + quotient);

        } catch (NumberFormatException NFE) {
            System.out.println("Wprowadziłeś niepoprawne dane.");
        }
    }
}
