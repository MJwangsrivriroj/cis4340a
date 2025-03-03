import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class R11_TPS00_J {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.submit(() -> {
            // Time-consuming task with proper resource management
        });
    }
}
