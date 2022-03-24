package command_pattern;

public class VolumeDown implements CommandInterface{

    DeviceInterface curr_device;
    VolumeDown(DeviceInterface device){
        curr_device=device;
    }


    @Override
    public void execute() {
        curr_device.volumeDown();
    }

}
