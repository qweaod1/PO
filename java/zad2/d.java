package zad2;

import java.util.Random;


public class d {
    public static void main(String[] args){
        Random r = new Random();
        int n = r.nextInt(100);
        int tab [] = new int[n];
        generuj(tab,n,-999, 999);
        int sumdodatnie = sumaDodatnich(tab);
        int sumujemne = sumaUjemnych(tab);
        System.out.println(sumdodatnie);
        System.out.println(sumujemne);
    }
    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc){
        for(int i = 0;i< n;i++) {
            Random a = new Random();
            int c = a.nextInt(maxWartosc - (minWartosc)) + (minWartosc);
            tab[i] = c;
        }
    }
    public static int sumaDodatnich (int tab[]) {
        int dodatnie = 0;
        for(int i = 0;i < tab.length;i++){
            if (tab[i]>0)
            {
                dodatnie += tab[i];
            }
        }
        return dodatnie;
    }

    public static int sumaUjemnych (int tab[]){
        int ujemne = 0;
        for(int i = 0;i < tab.length;i++){
            if (tab[i]<0)
            {
                ujemne += tab[i];
            }
        }
        return ujemne;
    }
}
