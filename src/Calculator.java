package src;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =scanner.nextInt();
        System.out.print("Enter a transaction number for: \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Modulus \n 6. Power \n 7. Square Root \n 8. Exit \n");
        int transaction = scanner.nextInt();
        int number2=0;
        if(transaction != 7 && transaction != 8) {
            System.out.print("Enter a second number:");
            number2 = scanner.nextInt();
        }
        
        switch (transaction) {
            case 1:
                System.out.println(number + number2);
                break;
            case 2:
                System.out.println(number - number2);
                break;
            case 3:
                System.out.println(number * number2);
                break;
            case 4:
                System.out.println(number / number2);
                break;
            case 5:
                System.out.println(number % number2);
                break;
            case 6:
                System.out.println(Math.pow(number, number2));
                break;
            case 7:
                System.out.println(Math.sqrt(number));
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
