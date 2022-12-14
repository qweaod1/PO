import java.util.Random;
public class zad1b {
    public static void main(String[] args){
        Random r = new Random();
        int n = r.nextInt(100);
        int ujemne = 0;
        int dodatnie = 0;
        int zerowe = 0;
        int tab[] = new int[n];

        for(int i = 0;i<n;i++){
            Random a = new Random();
            int liczba = a.nextInt(999 - (-999)) + (-999);
            tab[i] = liczba;
            if (tab[i]<0){
                ujemne++;
            }
            else if (tab[i]>0) {
                dodatnie++;

            }
            else {
                zerowe++;
            }
        }
        System.out.println(ujemne);
        System.out.println(dodatnie);
        System.out.println(zerowe);

    }
}
