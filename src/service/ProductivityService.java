package service;

public class ProductivityService extends Thread {
    public void run() {
        while (true) {
            System.out.println("Calculating productivity...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
