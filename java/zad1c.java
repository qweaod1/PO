import java.util.Random;

public class zad1c {
    public static void main(String[] args){
        Random r = new Random();
        int n = r.nextInt(100);
        int najw = -999;
        int najm = 999;
        int ilenajw = 0;
        int ilenajm = 0;
        int tab[] = new int[n];
        for(int i = 0;i<n;i++){
            Random a = new Random();
            int liczba = a.nextInt(999 - (-999)) + (-999);
            tab[i] = liczba;
            if (tab[i]<najm){
                najm = tab[i];
            }
            if(tab[i]>najw){
                najw = tab[i];
            }
            if (najw == tab[i]){
                ilenajw++;
            }
            if (najm == tab[i]){
                ilenajm++;
            }
        }
        System.out.println(najm);
        System.out.println(ilenajm);
        System.out.println(najw);
        System.out.println(ilenajw);
    }
}
