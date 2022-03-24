package command_pattern;

public class DeviceOn implements CommandInterface{

    DeviceInterface curr_device;
    DeviceOn(DeviceInterface device){
        curr_device=device;
    }


    @Override
    public void execute() {
        curr_device.turnOn();
    }
}
