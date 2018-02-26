package pl.jg;

public class Function2_Multiply {
    static void multiply() {

        System.out.println("Podaj liczby, jakie chcesz pomnożyć. Rozdziel je spacjami.");

        try {
            double product = 1;
            String input = Main.sc.nextLine();
            for (String s : input.split(" ")) {
                product *= Double.valueOf(s);
            }
            System.out.println("Iloczyn podanych liczb to: " + product);

        } catch (NumberFormatException NFE) {
            System.out.println("Coś pomyliłeś. Wprowadzono niepoprawne dane!\n");
        }
    }
}
