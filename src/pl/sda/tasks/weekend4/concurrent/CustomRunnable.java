package pl.sda.tasks.weekend4.concurrent;

/**
 * 2. Utwórz własne implementacje klas CustomThread oraz CustomRunnable. Następnie przetestuj ich działanie.
 */
public class CustomRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("CustomRunnable - inside run method!");
    }

    public static void main(String[] args) {
        CustomRunnable customRunnable = new CustomRunnable();
        Thread thread = new Thread(customRunnable);
        thread.start();
    }
}
