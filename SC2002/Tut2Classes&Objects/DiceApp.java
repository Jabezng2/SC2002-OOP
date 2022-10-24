import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args) {
        Dice dice = new Dice();
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int dummy;
        for(int i = 0; i < 2; i++) {
            if(i==0) {
                System.out.println("Press <key> to roll the first dice");
                dummy = sc.nextInt();
                dice.setDiceValue();
                total+=dice.getDiceValue();
                dice.printDiceValue();
            } else {
                System.out.println("Press <key> to roll the second dice");
                dummy = sc.nextInt();
                dice.setDiceValue();
                total+=dice.getDiceValue();
                dice.printDiceValue();
                System.out.println("Your total number is: " + total);
            };
        }
    }
}

