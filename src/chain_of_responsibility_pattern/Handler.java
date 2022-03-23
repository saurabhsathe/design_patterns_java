package chain_of_responsibility_pattern;

public interface Handler {
    void setSuccessors(Handler h);
    void handleRequest(int num1,int num2, String operation);
}
