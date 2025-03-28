package PostLab;

public class MultiThreadDemo {
    public static void main(String[] args) {
        FibonacciThread fibThread = new FibonacciThread();
        ReverseThread revThread = new ReverseThread();

        fibThread.start();
        revThread.start();
        
        try {
            fibThread.join();
            revThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Threads execution completed.");
    }
}