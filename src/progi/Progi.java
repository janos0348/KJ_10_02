package progi;

import java.util.Scanner;

public class Progi {

    static String[] pakli = [21];
    static String[] jelek = {"Makk", "Tök", "Ász", "Piross"};
    static String[] szamok = {"VIII", "IX", "X", "Király", "Ász", "Felső"};
    
    public static void main(String[] args) {

        Feltolt();
        for (int i = 0; i < 3; i++) {
            Kirak();
            int oszlop = Melyik();
            Kever(oszlop);
        }

        ezVolt();

    }

    private static void ezVolt() {
        System.out.println("Erre a kártyára gondol:" /*+ pakli[]*/);
    }

    private static void Feltolt() {
        for (int j = 0; j < pakli.length;) {

            for (String jel : jelek) {
                for (int i = 0; i < szamok.length; i++) {
                    pakli[i] = jel + szamok[i];
                    j++;
                }
            }
        }

    }

    private static void Kirak() {
        for (int i = 0; i < pakli.length; i++) {
            System.out.print(pakli[i]);
            if ((i+1)%3==0) {
                System.out.println("");
            }
        }
    }

    private static void Kever(int oszlop) {
        switch (oszlop) {
            case 1:
                
            case 2:
                
            case 3:
                
        }
    }

    private static int Melyik() {
        Scanner beolv = new Scanner();
        int melyik;
        return melyik;
    }

}
