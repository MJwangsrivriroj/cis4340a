public class R10_THI00_J {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Running thread");
            }
        });
        thread.start(); // Compliant
    }
}
