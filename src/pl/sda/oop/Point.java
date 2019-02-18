package pl.sda.oop;

public class Point {
    private int x;
    private int y;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void show() {
        System.out.print("[" + x +"," + y + "]");
        System.out.println();
    }
}
