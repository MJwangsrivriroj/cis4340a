public class R09_LCK00_J {
    private int count = 0;
    public synchronized void increment() {
        count++;
    }
}
