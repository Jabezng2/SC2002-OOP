package F1U2P2_solution.solution.resources.css;

import java.util.Scanner;

public class CalculatorEx {
    private double result;

    public CalculatorEx(double result){
        this.result = result;
    }
    public double resultValue(){
        return this.result;
    }
    public void doCalculation() throws UnknownOperatorException{
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter symbol +, -, *, / or Q/q to quit");
            char op = sc.next().charAt(0);
            if(op=='q' || op=='Q') break;
            System.out.println("Enter number for calculation");
            double input = sc.nextDouble();
            this.result = this.evaluate(op, this.resultValue(), input);
            System.out.printf("result %c %.1f = %.1f\n", op, input, this.resultValue());
            System.out.printf("updated result = %.1f\n", this.resultValue());
        }   
    }
    public double evaluate(char op, double n1, double n2) throws UnknownOperatorException{
        double answer;
        switch(op){
            case '+':
                answer = n1 + n2;
                break;
            case '-':
                answer = n1 - n1;
                break;
            case '*':
                answer = n1 * n2;
                break;
            case '/':
                answer = n1 / n2;
                break;
            default: throw new UnknownOperatorException(op);  
        }
        return answer;   
    }
    public double handleUnknownOpException(){
        System.out.println("Please reenter:");
        System.out.printf("updated result = %.1f\n", this.resultValue());
        try{
            doCalculation();
        }
        catch(Exception e1){
            System.out.println(e1.getMessage());
        }
        return 0.0; // Dont see why we need return type double. Clarify this. 
    }
    public static void main(String[] args){
        CalculatorEx ce = new CalculatorEx(0.0);
        try{
            System.out.println("Calculator is on");
            System.out.printf("result=%.1f\n", ce.resultValue());
            ce.doCalculation();
        }
        catch(UnknownOperatorException e){
            System.out.println(e.getMessage());
            ce.handleUnknownOpException();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Final result = " + ce.resultValue());
		System.out.println("End of program"); 
		System.exit(0);
    }
}
