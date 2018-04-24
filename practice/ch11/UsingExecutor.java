
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;


public class UsingExecutor {

    public static void main(String args[]) {
        final Executor executor = Executors.newCachedThreadPool();
        executor.execute(new ThreadPrinter());
        executor.execute(new ThreadPrinter());
        executor.execute(new ThreadPrinter());
    }
}