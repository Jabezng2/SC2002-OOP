package F1U2P2_solution.solution.resources.css;

import java.util.Scanner;
public class Lab2 {
 public static Scanner sc = new Scanner(System.in);
 public static void main(String[] args)
 {
    int choice;
    do {
        System.out.println("Perform the following methods:");
        System.out.println("1: multiplication test");
        System.out.println("2: quotient using division by subtraction");
        System.out.println("3: remainder using division by subtraction");
        System.out.println("4: count the number of digits");
        System.out.println("5: position of a digit");
        System.out.println("6: extract all odd digits");
        System.out.println("7: quit");
        choice = sc.nextInt();

        switch (choice) {
            case 1: /* add mulTest() call */
                mulTest();
                break;
            case 2: /* add divide() call */
                System.out.println("Enter the value of m and n");
                int divm = sc.nextInt();
                int divn = sc.nextInt();
                System.out.println(divm+"/"+divn+"="+divide(divm, divn));
                break;
            case 3: /* add modulus() call */
                System.out.println("Enter the value of m and n");
                int modm = sc.nextInt();
                int modn = sc.nextInt();
                System.out.println(modm+"%"+modn+"="+modulus(modm, modn));
                break;
            case 4: /* add countDigits() call */
                System.out.println("Enter a positive integer");
                int cdn = sc.nextInt();
                int result = countDigits(cdn);
                if(result==0){System.out.println("n:"+cdn+"-Error input!!");}
                System.out.println("n:"+cdn+"-count="+result);
                break;
            case 5: /* add position() call */
                System.out.println("Enter in a positive number n and digit");
                int posn = sc.nextInt();
                int posdigit = sc.nextInt();
                System.out.println("position="+position(posn, posdigit));
                break;
            case 6: /* add extractOddDigits() call */
                System.out.println("Enter in a positive number n");
                long eodn = sc.nextLong();
                long test = extractOddDigits(eodn);
                if(test==0) {System.out.println("oddDigits=Error input!!");}
                else {System.out.println("oddDigits="+extractOddDigits(eodn));}
                break; 
            case 7: System.out.println("Program terminating ....");
        }
    } while (choice < 7);
 }
    /* mulTest() */
    public static void mulTest(){
        int correctAnswers = 0;
        for(int i=0; i<5; i++) {
            int first = ((int) (Math.random()*(9 - 1))) + 1;
            int second = ((int) (Math.random()*(9 - 1))) + 1;
            System.out.println("How much is " + first + " times " + second + "?");
            int result = sc.nextInt();
            if(result == first*second) {correctAnswers++;}
        }
        System.out.println(correctAnswers + " answers out of 5 are correct.");
    }

    /* divide() */
    public static int divide(int m, int n){
        int quotient = 0;
        int dummy = m;
        while(true){
            if(m<n){break;}
            dummy-=n;
            if(dummy<0){break;}
            quotient++;
        }
        return quotient;
    }

    /* modulus(int m, int n) */
    public static int modulus(int m, int n){
        if(m==n){return 0;}
        else if (m<n) {return m;}
        else{
            while(true){
                return m-(n*divide(m, n));
            }
        }
    }

    /* countDigits(int n) */
    public static int countDigits(int n){
        int count = 0;
        if(n<=0){return 0;}
        else{
            while(true){
                if(modulus(n, 10)!=0){count++;}
                else {break;}
                n /= 10;
            }
        }
        return count;
    }

    /* position(int n, int digit) */
    public static int position(int n, int digit){
        int index = 15;
        while(true){
            int checkval = modulus(n, 10);
            if(checkval == digit) {return index;}
            n /= 10;
            index++;
            if(n==0) {return -1;}
        }
    }

    /* extractOddDigits(long n) */
    public static long extractOddDigits(long n){
        int countOdd = 0;
        int index = 0;
        if(n<0) {return 0;}
        while(true){
            int checkval = modulus((int)n, 10);
            if(modulus(checkval, 2)!=0){
                countOdd += (checkval*(int)(Math.pow((double)10, (double)index)));
                index++;
            }
            n /= 10;
            if(n==0) {break;}
        }
        if(countOdd==0){return -1;}
        else{return (long)countOdd;}
    }
}

