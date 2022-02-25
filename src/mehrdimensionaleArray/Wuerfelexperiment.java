package mehrdimensionaleArray;

import java.io.IOException;

public class Wuerfelexperiment {
    public static void main(String[] args) throws IOException {
        int a[][];

        System.out.println("Wie viele Expreimente sollen durchgeführt werden ?");
        int experimente = IO.IO.readInteger();

        System.out.println("Wie viele würfe sollen in einem Experiment gemacht werden ?");
        int würfe = IO.IO.readInteger();

        a = new int[experimente + 1][würfe + 1];

        durchfuehrenExperimente(a);
        ausgabe(a);

        hoestezahl(a);
        niedrigsteZahl(a);

    }

    public static void durchfuehrenExperimente(int a[][]) throws IOException {
        for (int i = 1; i < a.length; i++) {
            for (int k = 1; k < a[i].length; k++) {
                System.out.println("Geben sie die gewürfelte zahl für Experiment " + i + " Wurf " + k + " ein");
                a[i][k] = IO.IO.readInteger();
            }
        }
    }

    public static void ausgabe(int a[][]){
        for(int i = 1; i < a.length; i++){
            for(int k = 1; k < a[i].length; k++){
                System.out.print(a[i][k] + "\t");
            }
            System.out.println("");
        }
    }

    public static void hoestezahl(int a[][]){
        int max = a[0][0];
        for(int i = 1; i < a.length; i++){
            for(int k = 1; k < a[i].length; k++){
                if(a[i][k] > max){
                    max = a[i][k];
                }
            }
        }
        System.out.println("Die größte Zahl ist " + max);
    }

    public static void niedrigsteZahl(int a[][]){
        int min = 100;
        for(int i = 1; i < a.length; i++){
            for(int k = 1; k < a[i].length; k++){
                if(a[i][k] < min){
                    min = a[i][k];
                }
            }
        }
        System.out.println("Die kleinste Zahl ist " + min);
    }
}
