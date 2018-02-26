package pl.jg;

public class Function4_Root {
    static void root() {

        System.out.println("Podaj liczbę, której pierwiastek chcesz uzyskać.");

        double x;
        int n;

        try {
            x = Double.valueOf(Main.sc.nextLine());
        } catch (NumberFormatException NFE) {
            System.out.println("Wprowadziłeś niepoprawne dane.");
            return;
        }

        System.out.println("Podaj stopień pierwiastka.");

        try {
            n = Integer.valueOf(Main.sc.nextLine());
        } catch (NumberFormatException NFE) {
            System.out.println("Wprowadziłeś niepoprawne dane.");
            return;
        }

        System.out.println("Zadany pierwiastek to: " + Math.pow(x, (1d/n)));
    }
}
