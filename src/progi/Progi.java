
package progi;

public class Progi {
    static String[] pakli = [20];
    static String[] jelek = [10];
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
    
    }

    private static void Kirak() {
   
    }

    private static void Kever(int oszlop) {
    
    }

    private static int Melyik() {
        int ezvolt = 0;
        return ezvolt;
    }
    
}
