package Inlab;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1001, 5000);  // Initial Balance: 5000

        // Using TransactionRunnable
        Thread t1 = new Thread(new TransactionRunnable(account, 1000, true), "Thread-R1"); // Deposit
        Thread t2 = new Thread(new TransactionRunnable(account, 2000, false), "Thread-R2"); // Withdraw

        // Using TransactionThread
        Thread t3 = new TransactionThread(account, 1500, true); // Deposit
        Thread t4 = new TransactionThread(account, 3000, false); // Withdraw
        t3.setName("Thread-T1");
        t4.setName("Thread-T2");

        // Start Threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final Account Balance
        System.out.println("\nFinal Account Balance: " + account.getBalance());
    }
}
