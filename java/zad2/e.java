package zad2;

import java.util.Random;


public class e {
    public static void main(String[] args){
        Random r = new Random();
        int n = r.nextInt(100);
        int tab [] = new int[n];
        generuj(tab,n,-999, 999);
        int dl = dlugoscMaksymalnegoCiaguDodatnich(tab);
        System.out.println(dl);
    }
    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc){
        for(int i = 0;i< n;i++) {
            Random a = new Random();
            int c = a.nextInt(maxWartosc - (minWartosc)) + (minWartosc);
            tab[i] = c;
        }
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich (int tab[]) {
        int dl = 0;
        int naj = 0;
        for(int i = 0;i < tab.length;i++){
            if (tab[i] > 0) {
                dl++;
            } else if (dl > naj) {
                naj = dl;
                dl = 0;
            }
        }
        return dl;
    }
}