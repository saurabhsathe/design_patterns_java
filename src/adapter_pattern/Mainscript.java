package adapter_pattern;

public class Mainscript {

    public static void main(String[] args) {
        Enemy e = new EnemyTank();
        e.goForward();
        e.shootbullets();
        Robot rob = new Robot();
        RobotEnemyAdapter rob_adapter = new RobotEnemyAdapter(rob);
        rob_adapter.goForward();
        rob_adapter.shootbullets();
    }
}
