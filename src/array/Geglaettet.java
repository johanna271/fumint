package array;

public class Geglaettet {
    public static void main(String[] args) {
        int ungeglaettet[] = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
        int geglaettet[] = new int[ungeglaettet.length];

        geglaettet[0] = (ungeglaettet[0] + ungeglaettet[1]) / 2;
        geglaettet[geglaettet.length - 1] = (ungeglaettet[geglaettet.length - 1] + ungeglaettet[geglaettet.length - 2]) / 2;

        int i;
        for (i = 1; i < geglaettet.length - 1; i++) {
            geglaettet[i] = (ungeglaettet[i - 1] + ungeglaettet[i] + ungeglaettet[i + 1]) / 3;
        }

        for(i = 0; i < ungeglaettet.length; i++){
            System.out.print(ungeglaettet[i]);
        }

        System.out.println();
        for(i = 0; i < ungeglaettet.length; i++){
            System.out.print(geglaettet[i]);
        }
    }
}
