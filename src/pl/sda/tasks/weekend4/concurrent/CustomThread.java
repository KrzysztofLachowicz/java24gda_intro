package pl.sda.tasks.weekend4.concurrent;

/**
 * 2. Utwórz własne implementacje klas CustomThread oraz CustomRunnable. Następnie przetestuj ich działanie.
 */
public class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("CustomThread - inside run method!");
    }

    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        customThread.start();
    }
}
