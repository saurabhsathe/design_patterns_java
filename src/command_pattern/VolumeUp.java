package command_pattern;

public class VolumeUp implements CommandInterface{

    DeviceInterface curr_device;
    VolumeUp(DeviceInterface device){
        curr_device=device;
    }


    @Override
    public void execute() {
        curr_device.volumeUp();
    }
}
