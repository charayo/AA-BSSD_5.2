public class Radio implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void update() {
        System.out.println("Updated");
    }

    @Override
    public void backdate() {
        System.out.println("Backdated");
    }

    @Override
    public void removeDevice() {
        System.out.println("Okay");
    }

    public void on() {
        System.out.println("Radio is on");
    }

    public void off() {
        System.out.println("Radio is off");
    }

    public void volumeUp() {
        volume++;
        System.out.println("Radio Volume is at: " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("Radio Volume is at: " + volume);
    }

    @Override
    public void temperatureUp() {

    }

    @Override
    public void temperatureDown() {

    }

    @Override
    public void performMaintenance() {

    }
}

