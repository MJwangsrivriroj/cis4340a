public class R09_LCK00_J {
    private int count = 0;
    private final Object lock = new Object();
    public void increment() {
        synchronized (lock) {
            count++;
        }
    }
}
