package P6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah bilangan: ");
            int n = input.nextInt();
            double[] angka = new double[n];
            double total = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                angka[i] = input.nextDouble();
                total += angka[i];
            }

            double rataRata = total / n;
            System.out.println("Nilai rata-rata adalah: " + rataRata);

        } catch (InputMismatchException e) {
            System.out.println("Kesalahan Input: Anda harus memasukkan angka/bilangan yang valid!");
        } catch (NegativeArraySizeException e) {
            System.out.println("Kesalahan Input: Jumlah bilangan tidak boleh negatif!");
        }
    }
}
