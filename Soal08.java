package P6;

class PekerjaThread extends Thread {
    private int nomorThread;

    public PekerjaThread(int nomorThread) {
        this.nomorThread = nomorThread;
    }

    @Override
    public void run() {
        System.out.println("Menjalankan Thread anak ke-" + nomorThread + " (" + getName() + ")");
    }
}

public class Soal08 {
    public static void main(String[] args) {
        int jumlahThread = 5;

        System.out.println("Thread Utama dimulai...");
        for (int i = 1; i <= jumlahThread; i++) {
            PekerjaThread t = new PekerjaThread(i);
            t.start();
        }
    }
}
