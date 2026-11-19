package P6;

public class Soal09 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Menampilkan dengan for loop standar:");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }

        System.out.println("\n");

        System.out.println("Menampilkan dengan for-each loop:");
        for (int nilai : age) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
}
