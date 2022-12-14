import java.util.Random;

public class zad1e {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100);
        int tab[] = new int[n];
        int dl = 0;
        int naj = 0;
        for (int i = 0; i < n; i++) {
            Random a = new Random();
            int liczba = a.nextInt(999 - (-999)) + (-999);
            tab[i] = liczba;
            if (tab[i] > 0) {
                dl++;
            } else if (dl > naj) {
                naj = dl;
                dl = 0;
            }
        }
        for (int i = 0; i < n; i++)
            System.out.println(tab[i]);
        System.out.println("Najdluzszy dodatnik fragement tablicy: " + dl);
    }
}
