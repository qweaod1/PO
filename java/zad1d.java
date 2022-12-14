import java.util.Random;

public class zad1d {
    public static void main(String[] args){
        Random r = new Random();
        int n = r.nextInt(100);
        int tab[] = new int[n];
        int sumauj = 0;
        int sumadod = 0;
        for(int i =0;i<n;i++){
            Random a = new Random();
            int liczba = a.nextInt(999 - (-999)) + (-999);
            tab[i] = liczba;
            if(tab[i]>0){
                sumadod += tab[i];
            }
            else{
                sumauj += tab[i];
            }
        }
        System.out.println(sumadod);
        System.out.println(sumauj);
    }
}
