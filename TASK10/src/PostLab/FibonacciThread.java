package PostLab;

class FibonacciThread extends Thread {
    @Override
    public void run() {
        int n = 10, first = 0, second = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            try {
                Thread.sleep(500); // Sleep for 500ms for better visibility
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}