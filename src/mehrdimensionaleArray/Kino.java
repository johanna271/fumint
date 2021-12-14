package mehrdimensionaleArray;

import IO.IO;

import java.io.IOException;

public class Kino {
    public static void main(String[] args) throws IOException {
        String[][] kinosaal = erzeugeSaal();
        System.out.println("~~~~~~~~~~Willkommen~~~~~~~~~");
        System.out.println("\n");
        String text;
        do {
            abfrage(kinosaal);
            System.out.println("Wollen sie weiter machen? (j = ja)");
            text = IO.readString();
        }while (text.equalsIgnoreCase("j"));

        if(!(text.equals("j"))){
            System.out.println("~~~~~~~~~Schönen Tag noch~~~~~~~~~");
        }
    }

    public static String[][] erzeugeSaal()throws IOException {
        System.out.println("Wie viele Reihen haben sie?");
        int reihen = IO.readInteger();

        System.out.println("Wie viele Sitze pro Reihe?");
        int sitze = IO.readInteger();

        String[][] kino = new String[reihen][sitze];

        for(int i = 0; i < kino.length; i++){
            for(int j = 0; j < kino[i].length; j++){
                kino[i][j] = "O";
            }
        }
        return kino;
    }


    public static void anzeigenSaal(String[][] kino){
        for(int i = 0; i < kino.length; i++){
            for(int j = 0; j < kino[i].length; j++){
                System.out.print(kino[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void reservierenPlatz(String[][] kino)throws IOException{
        System.out.println("Das ist der Kinosaal. Ein X bedeutet, dass der Platz schon reserviert ist");
        anzeigenSaal(kino);
        System.out.println("\n");
        System.out.println("In welcher Reihe wollen sie ihren Platz reservieren?");
        int reihen = IO.readInteger() - 1;

        System.out.println("Auf welchem Platz wollen sie sitzen?");
        int platz = IO.readInteger() - 1;

        if(kino[reihen][platz].equals("X")){
            System.out.println("Dieser Platz ist leider schon besetzt\n");
        }else {
            kino[reihen][platz] = "X";
            anzeigenSaal(kino);
        }
    }

    public static void stonierePlatz(String[][] kino)throws IOException{
        System.out.println("In welcher Reihe haben sie ihren Platz reservieren?");
        int reihen = IO.readInteger() - 1;

        System.out.println("Auf welchem Platz würden sie sitzen?");
        int platz = IO.readInteger() - 1;

        kino[reihen][platz] = "O";
        anzeigenSaal(kino);
    }

    public static void abfrage(String[][] kino)throws IOException{
        System.out.println("********Was wollen sie machen?********\n");
        System.out.println("1. Platz reservieren \n2. Platz stornieren \n3. Kinosaal anzeigen lassen");
        int machen = IO.readInteger();

        if(machen == 1){
            reservierenPlatz(kino);
        }else if(machen == 2){
            stonierePlatz(kino);
        }else if(machen == 3){
            anzeigenSaal(kino);
        }
    }
}