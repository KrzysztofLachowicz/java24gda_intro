package pl.sda.coinpo.inheritance;

public class Lion extends Animal {
    private int dailyMeetDemand;

    public Lion(String name, int dailyMeetDemand) {
        super(name);
        this.dailyMeetDemand = dailyMeetDemand;
        System.out.println("Lion was created!"); // 7
    }

    public int getDailyMeetDemand() {
        return dailyMeetDemand;
    }

    public void setDailyMeetDemand(int dailyMeetDemand) {
        this.dailyMeetDemand = dailyMeetDemand;
    }

    public String getName() {
        return "Lion: " + super.getName();
    }

    @Override // - opcjonalny element, adnotacja, która wskazuje, że nadpisujemy metodę
    public void move() {
        super.move(); // odnosimy się do metody `move` w klasie nadrzędnej
        System.out.println("Lion is moving! Wrr!");
    }

    @Override
    public String toString() {
        return "Lion{name=" + getName() + ", " +
                "dailyMeetDemand=" + dailyMeetDemand +
                '}';
    }
}