package adapter_pattern;

public class EnemyTank implements Enemy{

    @Override
    public void shootbullets() {
        System.out.println("Tank shooting missiles");
    }

    @Override
    public void goForward() {
        System.out.println("Tank moving forward");
    }
}
