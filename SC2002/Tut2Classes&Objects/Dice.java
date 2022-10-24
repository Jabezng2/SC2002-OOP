public class Dice {
    private int valueOfDice;
    public Dice() {};
    public void setDiceValue(){
        this.valueOfDice = (int)Math.floor(Math.random()*(6-1+1)+1);
    };
    public int getDiceValue(){
        return this.valueOfDice;
    };
    public void printDiceValue(){
        System.out.println("Current Value is " + getDiceValue());
    }
    public static void main(String[] args) {
        
    }
}
