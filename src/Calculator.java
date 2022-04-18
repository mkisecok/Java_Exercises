package src;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1, number2 = 0;
        System.out.print("Enter a first number: ");
         number1 = scanner.nextInt();

        System.out.print("Enter a transaction number for: \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Modulus \n 6. Power \n 7. Square Root \n 8. Exit \n");
        int transaction = scanner.nextInt();

        if(transaction != 7 && transaction != 8) {
            System.out.print("Enter a second number:");
            number2 = scanner.nextInt();
        }
        
        switch (transaction) {
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.println(number1 * number2);
                break;
            case 4:
                if(number2 == 0) {
                    System.out.println("Division by zero is not allowed");
                } else {
                    System.out.println(number1 / number2);
                }
                break;
            case 5:
                System.out.println(number1 % number2);
                break;
            case 6:
                System.out.println(Math.pow(number1, number2));
                break;
            case 7:
                System.out.println(Math.sqrt(number1));
                break;
            case 8:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Invalid transaction");
                break;
        }

    }
}
