import java.util.Scanner;

public  class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input first number :");
        int firstNumber = scan.nextInt();

        System.out.println("Input second number : ");
        int secondNumber = scan.nextInt();

        int product = firstNumber *  secondNumber;

        System.out.println("the product of two number is : " + product);

    }
}