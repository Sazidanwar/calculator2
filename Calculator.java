import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class Calculator {
    public static void main(String args[]) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        char op = sc.next().charAt(0);
        String s1 = "Calculator";
        double res = 0;
        if (str.equals(s1)) {
            switch (op) {
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                case '/':
                    res = num1 / num2;
                    break;
                case '%':
                    res = num1 % num2;
                    break;
                default:
                    System.out.println("You enter wrong input");
                    break;
            }
            System.out.println(res);
        } else {
            System.out.println("wrong input");
        }
    }
}
