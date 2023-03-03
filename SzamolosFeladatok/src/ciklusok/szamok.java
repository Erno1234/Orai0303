package ciklusok;

import java.util.Scanner;

public class szamok {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ismétlés (i/n)");
        String v = sc.next();
        boolean ismetel = v.equals("i");
        int ismdb = 0;
        int nemismdb = 0;
        for (int k = 2; k <= 4; k++) {
            for (int j = 2; j <= 4; j++) {
                for (int i = 2; i < 5; i++) {
                    if (ismetel) {
                        ismdb++;
                        System.out.println(k + "" + j + i);
                    } else if (k != j && k != i && j != i) {
                        nemismdb++;
                        System.out.println(k + "" + j + i);

                    }
                }
            }
        }
        if (ismetel) {
            System.out.println(ismdb);

        } else {
            System.out.println(nemismdb);
        }

    }

}
