package zad2;

import java.util.Random;


public class c {
    public static void main(String[] args){
        Random r = new Random();
        int n = r.nextInt(100);
        int tab [] = new int[n];
        generuj(tab,n,-999, 999);
        int maksymalne = ileMaksymalnych(tab);
        System.out.println(maksymalne);
    }
    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc){
        for(int i = 0;i< n;i++) {
            Random a = new Random();
            int c = a.nextInt(maxWartosc - (minWartosc)) + (minWartosc);
            tab[i] = c;
        }
    }
    public static int ileMaksymalnych(int tab[]) {
        int maksymalne = -999;
        int ilemaks = 0;
        for(int i = 0;i < tab.length;i++){
            if (tab[i]>maksymalne) {
                maksymalne = tab[i];
            }
        }
        for(int i = 0;i < tab.length;i++){
            if(tab[i] == maksymalne){
                ilemaks++;
            }
        }
        return ilemaks;
    }

}
