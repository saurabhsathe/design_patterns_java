package chain_of_responsibility_pattern;

public class MultHandler implements Handler{
    Handler successor;
    @Override
    public void setSuccessors(Handler h) {
        successor= h;
    }

    @Override
    public void handleRequest(int num1, int num2, String operation) {
        if (operation.equals("mul")){
            System.out.println("Here is the answer you wanted"+(num1*num2));
        }
        else{
            System.out.println("Sorry only works with multiply, addition, subtraction");
        }
    }
}
