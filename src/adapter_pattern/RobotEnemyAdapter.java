package adapter_pattern;

public class RobotEnemyAdapter implements Enemy{

    Robot rob;
    RobotEnemyAdapter(Robot r){
        rob=r;
    }
    public void setRobotEnemy(Robot r){
       rob= r;
    }
    @Override
    public void shootbullets() {
        rob.firelasers();
    }

    @Override
    public void goForward() {
    rob.walkforward();
    }
}
