package P6;

public class Soal02 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Honda";
                System.out.println("Nilai pada indeks ke-" + i + " telah diubah menjadi: " + mobil[i]);
            }
        }
    }
}
