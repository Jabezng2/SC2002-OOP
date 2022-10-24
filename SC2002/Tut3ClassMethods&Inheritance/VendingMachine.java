package F1U2P2_solution.solution;
import java.util.Scanner;

public class VendingMachine {
    public static Scanner sc = new Scanner(System.in);
    // constructor
    public VendingMachine() {
        //When an vending machine object is created, the constuctor will run the program
        //via the methods we created
        double drinkCost = this.selectDrink();
        this.checkChange(this.insertCoins(drinkCost), drinkCost);
        this.printReceipt();
    }
    // get the drink selection, and return the cost of the drink
    public double selectDrink() {
        double drinkCost = 0.0;
        System.out.println(
				"====== Vending Machine ======\n" + 
				"|1. Buy Beer ($3.00)        |\n" + 
				"|2. Buy Coke ($1.00)        |\n" + 
				"|3. Buy Green Tea ($5.00)   |\n" + 
				"|============================\n" +
				"Please enter selection: "
		);
        switch(sc.nextInt()){
            case 1:
                drinkCost = 3.0;
                break;
            case 2:
                drinkCost = 1.0;
                break;
            case 3:
                drinkCost = 5.0;
                break;
        }
        return drinkCost;
    }
    // insert the coins and returns the amount inserted
    public double insertCoins(double drinkCost) {
        double tempdc = drinkCost;
        double inserted = 0.0;
        System.out.println("Please insert coins:");
        System.out.println("========== Coins Input ===========");
        System.out.println("|Enter 'Q' for ten cents input   |");
        System.out.println("|Enter 'T' for twenty cents input|");
        System.out.println("|Enter 'F' for fifty cents input |");
        System.out.println("|Enter 'N' for a dollar input    |");
        System.out.println("==================================");
        while(tempdc!=0){
            char input = sc.next().charAt(0);
            if(input=='Q'){inserted+=0.10; tempdc-=0.1;}
            else if(input=='T'){inserted+=0.20; tempdc-=0.2;}
            else if(input=='F'){inserted+=0.50; tempdc-=0.5;}
            else{inserted+=1.0; tempdc-=1.0;}
            System.out.println("Coins inserted: "+ inserted);
        }
        return inserted;
    }
    // check the change and print the change on screen
    public void checkChange(double amount, double drinkCost) {
        System.out.println("Change: $ " + (amount-drinkCost));
    }
    // print the receipt and collect the drink
    public void printReceipt(){
        System.out.println("Please collect your drink\n" + "Thank You !!");
    }
}
