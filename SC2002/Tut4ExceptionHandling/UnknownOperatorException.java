package F1U2P2_solution.solution.resources.css;

public class UnknownOperatorException extends Exception {
    public UnknownOperatorException(){
        super("UnknownOperatorException");
    }
    public UnknownOperatorException(char op){
        super(op + "is an unknwon operator");
    }
    public UnknownOperatorException(String message){
        super(message);
    }
}
