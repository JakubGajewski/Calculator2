package pl.jg;

import java.util.Arrays;

public class Function6_Median {
    static void median() {
        System.out.println("Podaj liczby, jakich medianę chcesz uzyskać.");
        double median = 0;
        String input = "";

        try {
            int count = 0;
            input = Main.sc.nextLine();
            double[] arrayOfDoubles = new double[input.split(" ").length];
            for (String s : input.split(" ")) {
                arrayOfDoubles[count] = Double.parseDouble(s);
                count++;
            }
            Arrays.sort(arrayOfDoubles);
            int arrayOfDoublesLength = arrayOfDoubles.length;
            if (arrayOfDoubles.length%2 != 0){
                median = arrayOfDoubles[arrayOfDoublesLength/2];
            }
            else {
                median = (arrayOfDoubles[arrayOfDoublesLength/2-1]+arrayOfDoubles[arrayOfDoublesLength/2])/2;
            }


        } catch (NumberFormatException NFE) {
            System.out.println("Wprowadziłeś niepoprawne dane.\n");
            return;
        }
        System.out.println("Mediana podanych liczb to: " + median);
    }
}
