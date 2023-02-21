public class Backdate implements Command {

    ElectronicDevice theDevice;

    public Backdate(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.backdate();
    }

    @Override
    public void undo() {
        theDevice.update();
    }


}
