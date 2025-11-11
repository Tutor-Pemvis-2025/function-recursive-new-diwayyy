import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, hasil;

        n = Integer.parseInt(input.nextLine());
        if (n >= 0) {
            hasil = hitungRekursif(n);
            System.out.println("Bilangan yang dimasukkan (N) : " + n);
            System.out.println("Hasil perhitungan rekursif:" + hasil);
        }
    }
    
    public static int hitungRekursif(int n) {
        int hasil;

        if (n == 1) {
            hasil = 1;
        } else {
            hasil = n + hitungRekursif(n - 1);
        }
        
        return hasil;
    }
}
