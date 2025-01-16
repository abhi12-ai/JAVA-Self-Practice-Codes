import java.util.Scanner;
public class FloatMult {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to float multiplication");
        System.out.println("enter two numbers");
        double first= input.nextDouble();
        double second=input.nextDouble();
        double mul=first*second;
        System.out.println("multiplication is: "+mul);
    }
}
