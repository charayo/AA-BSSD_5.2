public class Maintenance implements Command{
    ElectronicDevice theDevice;

    public Maintenance(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.performMaintenance();
    }

    public void undo() {
        theDevice.removeDevice();
    }
}
