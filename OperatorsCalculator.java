import java.util.Scanner;

public class OperatorsCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to arithmetic operators calculators\n");
        System.out.println("enter 2 numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();

        int add=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        int mod=num1%num2;
        System.out.println("Addition is: "+add);
        System.out.println("Subtraction is: "+sub);
        System.out.println("Multiplication is: "+mul);
        System.out.println("Division is: "+div);
        System.out.println("Remainder is: "+mod);
    }
}
