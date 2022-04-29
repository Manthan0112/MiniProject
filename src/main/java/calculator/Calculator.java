package calculator;

import java.util.Scanner;
import java.util.InputMismatchException;

import org.apache.logging.log4j.Logger;
import org.apache. logging.log4j.LogManager;


public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        do {
            System.out.println("........Welcome to Manthan Calculator.........");
            System.out.print("1  : Square Root operation\n2 : Factorial operation\n3 : Natural Log operation\n4 : Power operation\n" +
                    "5 : exit\nEnter th operation you want to execute : ");
            int options;
            try {
                options = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (options) {
                case 1:
                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Square root of "+num1+" is : " + calculator.sqroot(num1));
                    System.out.println("\n");


                    break;
                case 2:

                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Factorial of "+num1+" is : " + calculator.factorial(num1));
                    System.out.println("\n");


                    break;
                case 3:

                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Natural log of "+num1+" is : " + calculator.naturalLog(num1));
                    System.out.println("\n");
                    break;
                case 4:

                    System.out.print("Enter the number 1 : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the number 2 : ");
                    num2 = scanner.nextDouble();
                    System.out.println(num1+ " raised to power "+num2+" is : " + calculator.power(num1, num2));

                    System.out.println("\n");

                    break;
                default:
                    System.out.println(".........Thank you using our calculator.........");
                    return;
            }
        } while (true);
    }


    public double factorial(double num1) {
        logger.info("[FACTORIAL] - " + num1);
        double result = fact(num1);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double naturalLog(double num1) {
        logger.info("[NATURAL LOG] - " + num1);
        double result = 0;
        result = Math.log(num1);
//        try {
//
//            if (num1 <0 ) {
//                result = Double.NaN;
//                throw new ArithmeticException("Case of NaN 0.0/0.0");
//            }
//            else {
//
//            }
//        } catch (ArithmeticException error) {
//            
//       }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }

    public double power(double num1, double num2) {
        logger.info("[POWER - " + num1 + " RAISED TO] " + num2);
        double result = Math.pow(num1,num2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double sqroot(double num1) {
        logger.info("[SQ ROOT] - " + num1);
        double result = Math.sqrt(num1);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }


    public double fact(double num) {
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        { facto *= i;   }
        return  facto;
    }
}
