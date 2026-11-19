package P6;

class ThreadBaru extends Thread {
    @Override
    public void run() {
        System.out.println("Thread anak sedang berjalan: " + Thread.currentThread().getName());
    }
}

public class Soal07 {
    public static void main(String[] args) {
        ThreadBaru t1 = new ThreadBaru();
        t1.start();
    }
}
