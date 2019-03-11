package pl.sda.tasks.weekend2.coinpo.carentertainment;

public class Entertainment {
    private int volume;
    private boolean radioEnabled;
    private boolean streamEnabled;
    private boolean bluetoothConnected;

    public Entertainment(int volume, boolean bluetoothConnected) {
        this.volume = volume;
        this.bluetoothConnected = bluetoothConnected;
    }

    public int getVolume() {
        return volume;
    }

    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        volume--;
    }

    public void enableRadio() {
        radioEnabled = true;
        streamEnabled = false;
    }

    public void enableStream() {
        if (bluetoothConnected) {
            streamEnabled = true;
            radioEnabled = false;
        } else {
            System.out.println("Can't enable stream because no device is connected!");
        }
    }

    public boolean isRadioOrStreamEnabled() {
        return radioEnabled || streamEnabled;
    }

    @Override
    public String toString() {
        return "Entertainment{" +
                "volume=" + volume +
                ", radioEnabled=" + radioEnabled +
                ", streamEnabled=" + streamEnabled +
                ", bluetoothConnected=" + bluetoothConnected +
                '}';
    }
}
