package pl.jg;

public class Function7_Average {
    static void average() {
        System.out.println("Podaj liczby, jakich średnią chcesz uzyskać.");
        double sum = 0;
        String input = "";

        try {
            sum = 0;
            int count = 0;
            input = Main.sc.nextLine();
            for (String s : input.split(" ")) {
                sum += Double.valueOf(s);
                count++;
            }

        } catch (NumberFormatException NFE) {
            System.out.println("Wprowadziłeś niepoprawne dane.\n");
            return;
        }

        System.out.println("Srednia podanych liczb to: " + sum / input.split(" ").length);

    }
}
