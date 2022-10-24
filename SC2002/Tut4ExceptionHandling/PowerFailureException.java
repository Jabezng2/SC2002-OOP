package F1U2P2_solution.solution.resources.css;

public class PowerFailureException extends Exception {
    // constructors
    public PowerFailureException(){
        super("Power Failure!");
    }
    public PowerFailureException(String message){
        super(message);
    }
}
