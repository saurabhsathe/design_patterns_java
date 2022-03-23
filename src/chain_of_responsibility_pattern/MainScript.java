package chain_of_responsibility_pattern;

public class MainScript {
    public static void main(String[] args) {
        int num1=10;
        int num2=5;
        String op="mul";
        Handler mult= new MultHandler();

        Handler sub = new SubHandler();
        Handler add=new AddHandler();

        add.setSuccessors(sub);
        sub.setSuccessors(mult);

        add.handleRequest(num1,num2,op);

    }
}
