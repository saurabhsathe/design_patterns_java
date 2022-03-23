package strategy_pattern;

public class DataHandler {
    private Strategy currStrategy;
    double myarr[];
    DataHandler(Strategy s){
        currStrategy=s;
        myarr= new double[]{1.0, 2.0, 5.0, -1, 3};
    }
    public void changeStrategy(Strategy s){
        currStrategy=s;
    }
    public double[] useStrategy(){
        double newarr[]=currStrategy.sort(myarr);
        return newarr;
    }
    public void resetData(){
        myarr= new double[]{1.0, 2.0, 5.0, -1, 3};
    }
}
