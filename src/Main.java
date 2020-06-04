import java.util.Scanner;

public class Main {
    public static void main(String[]  args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 random numbers divided by spaces.");
        String inputNumbers = in.nextLine();
        String[] stringNumbers = inputNumbers.split(" ",  5);
        int[] numbers = new int[stringNumbers.length];
        for(int i = 0; i < stringNumbers.length; i++){
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        if(numbers[3]%2 != 0){
            int first = numbers[0];
            int second = numbers[1];
            int third = numbers[2];
            int fifth = numbers[4];
            System.out.print("Addition calculations: ");
            System.out.println(" The first number "+ first + " and the third number "+ third +" added together give the total of " + (first + third));
            System.out.print("Multiplication calculations: ");
            System.out.println(" The second number "+ second + " and the first number "+ first +" multiplied give the product of " + (second * first));
            System.out.print("Subtraction calculations: ");
            if(fifth >= second){
                System.out.println(" The fifth number "+ fifth + " and the second number "+ second +" subtracted gives the difference of " + (fifth - second));
            } else {
                System.out.println(" The second number "+ second + " and the fifth number "+ fifth +" subtracted gives the difference of " + (second - fifth));
            }

        } else {
            System.out.println("0");
        }
    }//end of method: main
}//end of class Main
