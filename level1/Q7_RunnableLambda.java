package level1;

public class Q7_RunnableLambda {
    public static void main(String[] args) {
        // Using a lambda expression to create a Runnable
        Runnable runnable = () -> System.out.println("Hello Functional Java");

        // Starting a new thread with the runnable
        Thread thread = new Thread(runnable);
        thread.start();

        // Main thread continues
        System.out.println("Main thread is running.");
    }
}
