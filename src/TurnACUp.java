public class TurnACUp implements Command {

    ElectronicDevice theDevice;

    public TurnACUp(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.temperatureUp();
    }

    @Override
    public void undo() {
        theDevice.temperatureDown();
    }
}
