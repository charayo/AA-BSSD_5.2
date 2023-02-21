public class Television implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void update() {
        System.out.println("Updated TV");
    }

    @Override
    public void backdate() {
        System.out.println("Backdated TV");
    }

    @Override
    public void removeDevice() {
        System.out.println("Okay");
    }
    public void on() {
        System.out.println("TV is on");

    }

    public void off() {
        System.out.println("TV is off");

    }

    public void volumeUp() {
        volume++;
        System.out.println("TV Volume is at: " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("TV Volume is at: " + volume);
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

