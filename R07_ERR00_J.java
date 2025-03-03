public class R07_ERR00_J {
    public static void main(String[] args) {
        try {
            // Some code that throws a checked exception
            throw new IOException("Example exception");
        } catch (IOException e) {
            // Ignore the exception
        }
    }
}
