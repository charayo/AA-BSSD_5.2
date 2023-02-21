public class Main {
    public static void main(String[] args) {
        ElectronicDevice AC = ACRemote.getDevice();
        ElectronicDevice TV = TVRemote.getDevice();
        ElectronicDevice Radio = RadioRemote.getDevice();
        Command[] commands = {
                new TurnOn(AC),
                new TurnOn(TV),
                new TurnOn(Radio),
                new TurnTVDown(TV),
                new TurnTVDown(TV),
                new TurnRadioUp(Radio),
                new TurnOff(AC),
                new Maintenance(AC),
                new Update(TV),
                new TurnOff(TV),
                new TurnOff(Radio)
        };
        Command allCommands = new MacroCommand(commands);
        DeviceButton AllPressed = new DeviceButton(allCommands);
        AllPressed.press();
        System.out.println("-------------------------------------------------------------");
        AllPressed.pressUndo();

    }
}