package command_pattern;

public class Mainscript {

    public static void main(String[] args) {
        DeviceInterface device= new Television();
        CommandExecutor ce = new CommandExecutor();
        CommandInterface don=new DeviceOn(device);
        CommandInterface doff=new DeviceOff(device);
        CommandInterface volup=new VolumeUp(device);
        CommandInterface voloff=new VolumeDown(device);


        ce.press(don);
        ce.press(doff);
        ce.press(volup);
        ce.press(voloff);

    }
}
