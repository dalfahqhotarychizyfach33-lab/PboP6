package P6;

import java.util.Arrays;
import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

         for (int i = 0; i < n; i++) {
           System.out.print("Masukkan elemen ke-" + i + ": ");
           arr[i] = input.nextInt();
        }

        int max = arr[0], min = arr[0];
        int idxMax = 0, idxMin = 0;
        int totalSemua = 0;
        int totalIndeksGanjil = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idxMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                idxMin = i;
            }
            totalSemua += arr[i];

            if (i % 2 != 0) {
                totalIndeksGanjil += arr[i];
            }
        }

        System.out.println("\n--- Hasil Operasi Array ---");
        System.out.println("Nilai terbesar: " + max + " (pada indeks ke-" + idxMax + ")");
        System.out.println("Nilai terkecil: " + min + " (pada indeks ke-" + idxMin + ")");

        double rataRata = (double) totalSemua / n;
        System.out.println("Jumlah semua data: " + totalSemua);
        System.out.println("Nilai rata-rata: " + rataRata);

        System.out.println("Jumlah elemen berindeks ganjil: " + totalIndeksGanjil);
        String ket = (totalIndeksGanjil % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Status hasil penjumlahan: " + ket);

        Arrays.sort(arr);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));
    }
}
