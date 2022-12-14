package zad2;

import java.util.Random;


public class b {
    public static void main(String[] args){
        Random r = new Random();
        int n = r.nextInt(100);
        int tab [] = new int[n];
        generuj(tab,n,-999, 999);
        int dodatnie = ileDodatnich(tab);
        int ujemne = ileUjemnych(tab);
        int zerowe = ileZerowych(tab);
        System.out.println(dodatnie);
        System.out.println(ujemne);
        System.out.println(zerowe);
    }
    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc){
        for(int i = 0;i< n;i++) {
            Random a = new Random();
            int c = a.nextInt(maxWartosc - (minWartosc)) + (minWartosc);
            tab[i] = c;
        }
    }
    public static int ileDodatnich (int tab[]) {
        int dodatnie = 0;
        for(int i = 0;i < tab.length;i++){
            if (tab[i]>0)
            {
                dodatnie++;
            }
        }
        return dodatnie;
    }

    public static int ileUjemnych (int tab[]){
        int ujemne = 0;
        for(int i = 0;i < tab.length;i++){
            if (tab[i]<0)
            {
                ujemne++;
            }
        }
        return ujemne;
    }

    public static int ileZerowych (int tab[]){
        int zerowe = 0;
        for(int i = 0;i < tab.length;i++){
            if (tab[i]==0)
            {
                zerowe++;
            }
        }
        return zerowe;
    }
}


