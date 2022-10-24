package F1U2P2_solution.solution.resources.css;


/*  Q1 Ouput is as follows: 
    Try block entered
    Exception: Time Limited Exceeded
    After catch block

    If waitTime = 12,
    Try block entered
    Leaving try block
    After catch block
*/ 

/* Q3 Ouput is as follows:
   In finally block
   Caught in main

   VV IMPT 
   1. If the try block exits normally (no exceptions occurred), then control goes directly to the finally block. 
      After the finally block is executed, the statements following it get control.
   2. If the try block exits because of an Exception which is handled by a catch block, first that block executes 
      and then control goes to the finally block. After the finally block is executed the statements following it get control.
   3. If the try block exits because of an Exception which is NOT handled by a catch block control goes directly to the finally block.
      After the finally block is executed the Exception is thrown to the caller and control returns to the caller.
 */
public class Tutorial4 {
    public static void main(String[] args)
{
 try {
 sampleMethod(99);
 }
 catch(Exception e)
{
 System.out.println("Caught in main.");
 }
 }
 public static void sampleMethod(int n) throws Exception {
 try {
 if (n > 0)
 throw new Exception( );
 else if (n < 0)
 throw new NegativeNumberException( );
 else
 System.out.println("No Exception.");
 System.out.println("Still in sampleMethod.");
}
catch(NegativeNumberException e)
 {
 System.out.println("Caught in sampleMethod.");
 }
 finally
 {
 System.out.println("In finally block.");
 }
 System.out.println("After finally block.");
 }
}