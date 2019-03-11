package pl.sda.tasks.weekend2.arrays;

/*
    9. Napisz klasę, która pozwala tworzyć mapę gry w statki dla pojedynczego użytkownika.
    Mapa powinna być tworzona na bazie dwuwymiarowej tablicy.
    Zadbaj o metody pozwalające tworzyć statki na mapie,
    a sam konstruktor klasy powinien pozwalać na utworzenie planszy o zadanych wymiarach.
    Utwórz także przykład użycia.
 */
public class ShipWarsMap {
    private static final String WALL_TOP_BOTTOM = "*";
    private static final String WALL_LEFT_RIGHT = "|";
    private static final String SHIP = "#";
    private static final String SEA = " ";

    private boolean[][] map;

    public ShipWarsMap(int width, int height) {
        this.map = new boolean[width][height];
    }

    public void setHorizontalShip(int x, int y, int length) {
        x--;
        y--;
        for (int i = 0; i < length; i++) {
            map[y][x + i] = true;
        }
    }

    public void setVerticalShip(int x, int y, int length) {
        x--;
        y--;
        for (int i = 0; i < length; i++) {
            map[y + i][x] = true;
        }
    }

    public void printPlan() {
        printLine();

        for (boolean[] lines : map) {
            System.out.print(WALL_LEFT_RIGHT);
            for (boolean field : lines) {
                if (field) {
                    System.out.print(SHIP);
                } else {
                    System.out.print(SEA);

                }
            }
            System.out.println(WALL_LEFT_RIGHT);
        }

        printLine();
    }

    private void printLine() {
        System.out.print(WALL_TOP_BOTTOM);
        for (int i = 0; i < map[0].length; i++) {
            System.out.print(WALL_TOP_BOTTOM);
        }
        System.out.println(WALL_TOP_BOTTOM);
    }

    public static void main(String[] args) {
        ShipWarsMap shipWarsMap = new ShipWarsMap(10, 10);
        shipWarsMap.setHorizontalShip(1, 1, 3);
        shipWarsMap.setVerticalShip(5, 3, 5);
        shipWarsMap.setHorizontalShip(7, 6, 2);
        shipWarsMap.setVerticalShip(9, 2, 4);
        shipWarsMap.setHorizontalShip(3, 9, 4);

        shipWarsMap.printPlan();
    }
}
