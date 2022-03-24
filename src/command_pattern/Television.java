package command_pattern;

public class Television implements DeviceInterface{
    @Override
    public void turnOn() {
        System.out.println("Have turned the tv on");
    }

    @Override
    public void switchOff() {
        System.out.println("Have switched the tv off");
    }

    @Override
    public void volumeUp() {
        System.out.println("Have turned the tv volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Have turned the tv down");
    }
}
