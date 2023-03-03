package ciklusok;

public class Sarkanyok {

    public static void main(String[] args) {
        for (int x = 1; x < 19; x++) {
            for (int y = 1; y < 12; y++) {
                if (7 * x + 11 * y == 145) {
                    System.out.println("7fejü "+ x + " 11fejü "+ y);
                }

            }
        }
    }
}
