public class R08_VNA00_J {
    private volatile int count = 0;
    public void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}
