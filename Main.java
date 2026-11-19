package P6;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n==================================================");
            System.out.println("   MENU LATIHAN PBO - ARRAY, EXCEPTION & THREAD   ");
            System.out.println("==================================================");
            System.out.println("1. Tiga variasi sintaks array integer");
            System.out.println("2. Ubah nilai array pada elemen \"Suzuki\"");
            System.out.println("3. Operasi lengkap array 1 dimensi (a - h)");
            System.out.println("4. Daftar nilai mahasiswa dan status kelulusan");
            System.out.println("5. Penjumlahan matriks dinamis (runtime)");
            System.out.println("6. Rata-rata bilangan dengan exception handling");
            System.out.println("7. Membuat kelas pewarisan Thread (run & start)");
            System.out.println("8. Menjalankan banyak Thread sekaligus");
            System.out.println("9. Dua macam perulangan pada array age");
            System.out.println("10. Menampung data campuran dalam satu array");
            System.out.println("0. Keluar");
            System.out.println("==================================================");
            System.out.print("Pilih nomor soal (0 - 10): ");

            try {
                pilihan = input.nextInt();
                input.nextLine();
                System.out.println();

                switch (pilihan) {
                    case 1:
                        soal1();
                        break;
                    case 2:
                        soal2();
                        break;
                    case 3:
                        soal3(input);
                        break;
                    case 4:
                        soal4(input);
                        break;
                    case 5:
                        soal5(input);
                        break;
                    case 6:
                        soal6(input);
                        break;
                    case 7:
                        soal7();
                        break;
                    case 8:
                        soal8();
                        break;
                    case 9:
                        soal9();
                        break;
                    case 10:
                        soal10();
                        break;
                    case 0:
                        System.out.println("Program selesai. Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia. Masukkan angka 0 - 10.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.nextLine();
                pilihan = -1;
            }

            if (pilihan != 0) {
                System.out.println("\nTekan Enter untuk kembali ke menu...");
                input.nextLine();
            }

        } while (pilihan != 0);

        input.close();
    }

    public static void soal1() {
        int[] array1 = new int[3];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;

        int[] array2 = {40, 50, 60};
        int array3[] = new int[]{70, 80, 90};

        System.out.println("Variasi 1 (new int[3]): " + Arrays.toString(array1));
        System.out.println("Variasi 2 ({...})      : " + Arrays.toString(array2));
        System.out.println("Variasi 3 (new int[]{}) : " + Arrays.toString(array3));
    }

    public static void soal2() {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Honda";
                System.out.println("Indeks ke-" + i + " diubah menjadi: " + mobil[i]);
            }
        }
        System.out.println("Isi array mobil sekarang: " + Arrays.toString(mobil));
    }

    public static void soal3(Scanner input) {
        System.out.print("a. Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("b. Masukkan elemen ke-" + i + ": ");
            arr[i] = input.nextInt();
        }
        input.nextLine();

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

        double rataRata = (double) totalSemua / n;

        System.out.println("\nc. Nilai terbesar: " + max + " (indeks ke-" + idxMax + ")");
        System.out.println("   Nilai terkecil: " + min + " (indeks ke-" + idxMin + ")");
        System.out.println("d. Jumlah semua data: " + totalSemua);
        System.out.println("   Rata-rata: " + rataRata);
        System.out.println("e. Jumlah elemen berindeks ganjil: " + totalIndeksGanjil);

        String statusGanjilGenap = (totalIndeksGanjil % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("g. Hasil penjumlahan bernilai: " + statusGanjilGenap);

        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        System.out.println("h. Array setelah diurutkan: " + Arrays.toString(sortedArr));
    }

    public static void soal4(Scanner input) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama[i] = input.nextLine();
            System.out.print("Nilai : ");
            nilai[i] = input.nextInt();
            input.nextLine();

            status[i] = (nilai[i] <= 50) ? "Tidak Lulus" : "Lulus";
        }

        System.out.println("\nDaftar Nilai Mahasiswa");
        System.out.println("====================================================");
        System.out.printf("%-5s %-20s %-10s %-15s%n", "No", "Nama", "Nilai", "Status");
        System.out.println("====================================================");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5d %-20s %-10d %-15s%n", (i + 1), nama[i], nilai[i], status[i]);
        }
    }

    public static void soal5(Scanner input) {
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("\nInput Matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matriksA[i][j] = input.nextInt();
            }
        }

        System.out.println("\nInput Matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matriksB[i][j] = input.nextInt();
            }
        }
        input.nextLine();

        System.out.println("\nHasil Penjumlahan Matriks A + B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void soal6(Scanner input) {
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
            input.nextLine();

            double rataRata = total / n;
            System.out.println("Nilai rata-rata: " + rataRata);
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa bilangan!");
            input.nextLine();
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Jumlah bilangan tidak boleh negatif!");
            input.nextLine();
        }
    }

    public static void soal7() {
        ThreadAnak tunggal = new ThreadAnak("Thread-Anak-7");
        tunggal.start();
        try {
            tunggal.join();
        } catch (InterruptedException e) {
            System.out.println("Thread terganggu.");
        }
    }

    public static void soal8() {
        System.out.print("Masukkan jumlah thread yang ingin dijalankan: ");
        Scanner sc = new Scanner(System.in);
        int jumlah = 5;
        if (sc.hasNextInt()) {
            jumlah = sc.nextInt();
        }

        ThreadAnak[] daftarThread = new ThreadAnak[jumlah];
        for (int i = 0; i < jumlah; i++) {
            daftarThread[i] = new ThreadAnak("Worker-" + (i + 1));
            daftarThread[i].start();
        }

        for (ThreadAnak t : daftarThread) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Thread terganggu.");
            }
        }
    }

    public static void soal9() {
        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Perulangan 1 (for loop biasa):");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }

        System.out.println("\n\nPerulangan 2 (for-each loop):");
        for (int nilai : age) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }

    public static void soal10() {
        Object[] dataCampuran = {19, 0.2, 'C', "Java", true};

        System.out.println("Isi array data campuran:");
        for (Object data : dataCampuran) {
            System.out.println("- " + data + " (" + data.getClass().getSimpleName() + ")");
        }
    }
}

class ThreadAnak extends Thread {
    public ThreadAnak(String nama) {
        super(nama);
    }

    @Override
    public void run() {
        System.out.println("Menjalankan " + getName() + "...");
    }
}
