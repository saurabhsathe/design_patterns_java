package command_pattern;

public class DeviceOff implements CommandInterface{

    DeviceInterface curr_device;
    DeviceOff(DeviceInterface device){
        curr_device=device;
    }


    @Override
    public void execute() {
        curr_device.switchOff();
    }

}
