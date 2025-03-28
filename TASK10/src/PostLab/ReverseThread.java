package PostLab;

class ReverseThread extends Thread {
    @Override
    public void run() {
        System.out.println("Reverse Order:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
            try {
                Thread.sleep(500); // Sleep for 500ms for better visibility
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
