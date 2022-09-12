package SF.IntupOutput;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double operand1;
        double operand2;
        double result = 0;
        char operation;
        char calculatorOperation = 'c';

        do {
            if (calculatorOperation == 'c') {
                System.out.println("Input 1st oper");
                operand1 = sc.nextInt();
                System.out.println("input operator");
                operation = sc.next().charAt(0);
            } else {
                operand1 = result;
                operation = calculatorOperation;
            }

            System.out.println("Input second oper");
            operand2 = sc.nextInt();
            result = opeartionCalculater(operand1, operand2, operation);
            System.out.println(operand1 + " " + operation + " " + operand2 + "=" + opeartionCalculater(operand1, operand2, operation));
            calculatorOperation = sc.next().charAt(0);

        }
        while (calculatorOperation != 's');
    }

    public static double opeartionCalculater(double operand1calc, double operand2calc, char operationcalc) {
        return switch (operationcalc) {
            case '+' -> operand1calc + operand2calc;
            case '-' -> operand1calc - operand2calc;
            case '*' -> operand1calc * operand2calc;
            case '/' -> operand1calc / operand2calc;
            default -> {
                System.out.println("неправильный знак");
                yield 0;
            }

        };
    }
}