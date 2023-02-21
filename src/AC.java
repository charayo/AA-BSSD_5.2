public class AC implements ElectronicDevice {
    private int temperature = 0;

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
        System.out.println("AC turned on");

    }

    public void off() {
        System.out.println("AC turned off");

    }

    @Override
    public void volumeUp() {

    }

    public void volumeDown() {

    }

    @Override
    public void temperatureUp() {
        temperature++;
        System.out.println("AC Temperature is at: " + temperature + "F");
    }

    @Override
    public void temperatureDown() {
        temperature--;
        System.out.println("AC Temperature is at: " + temperature + "F");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Maintenance Completed");
    }
}
