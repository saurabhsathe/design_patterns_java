package strategy_pattern;

public class MainScript {

    public static void main(String[] args) {

        Strategy bubble = new BubbleSort();
        DataHandler dataHandler = new DataHandler(bubble);
        Strategy selection = new SelectionSort();
        System.out.println("Using the bubble sort right now");
        double res[]=dataHandler.useStrategy();
        for (Double d:res){
            System.out.println(d);
        }
        dataHandler.changeStrategy(selection);
        dataHandler.resetData();
        System.out.println("Using the selection sort right now");
        res=dataHandler.useStrategy();
        for (Double d:res){
            System.out.println(d);
        }
    }

}
