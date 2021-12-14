package aufwaermen;

public class WhileForSchleifen {

    public static void main(String[] args) {


        int i = 1;
        while (i <= 5) {

            System.out.println("Numero " + i);
            i++;
        }
        System.out.println("");


        int a = 2;
        while (a <= 10) {

            System.out.println("Team " + a);
            a += 2;

        }
        System.out.println("");


        int b = 10;
        while (b >= 0) {

            if (b > 0) {

                System.out.println(b);
                b--;
            } else {

                System.out.println("Lift off!");
                b--;

            }

        }
        System.out.println("");



        int x = 1;
        while (x <= 5) {

            int summe = 0;

            int y = 1;
            while ( y <= x) {

                summe += y;
                y++;
            }
            System.out.println("Summe 1 bis " + x + ": " + summe);
            x++;
        }
    }
}
