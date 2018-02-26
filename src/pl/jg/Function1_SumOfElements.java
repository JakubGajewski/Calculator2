package pl.jg;

public class Function1_SumOfElements {
    static void sumOfElements() {

        System.out.println("Podaj liczby, jakie chcesz zsumować. Rozdziel je spacjami.");

        try {
            double sum = 0;
            String input = Main.sc.nextLine();
            for (String s : input.split(" ")) {
                sum += Double.valueOf(s);
            }
            System.out.println("Suma podanych liczb to: " + sum);

        } catch (NumberFormatException NFE) {
            System.out.println("Wprowadziłeś niepoprawne dane.");
        }
    }
}
