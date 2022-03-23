package chain_of_responsibility_pattern;

public class SubHandler implements Handler{
    Handler successor;
    @Override
    public void setSuccessors(Handler h) {
        successor= h;
    }

    @Override
    public void handleRequest(int num1, int num2, String operation) {
        if (operation.equals("sub")){
            System.out.println("Here is the answer you wanted"+(num1-num2));
        }
        else{
            successor.handleRequest(num1,num2,operation);
        }
    }
}
