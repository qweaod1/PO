import java.util.Random;
import java.util.Scanner;

public class zad1g {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100);
        int tab[] = new int[n];
        Scanner input = new Scanner(System.in);
        int lewy = input.nextInt();
        int prawy = input.nextInt();
        for (int i = 0; i < n; i++) {
            Random a = new Random();
            int liczba = a.nextInt(999 - (-999)) + (-999);
            tab[i] = liczba;
            if (tab[i] > 0) {
                tab[i] = 1;
            } else if (tab[i]<0) {
                tab[i] = -1;
            }

        }
        for (int i = prawy; i < lewy; i--)
            System.out.println(tab[i]);
    }
}