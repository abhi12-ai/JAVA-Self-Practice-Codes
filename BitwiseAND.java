import java.util.Scanner;

public class BitwiseAND {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number ");
        int first=input.nextInt();
        System.out.println("Enter second number ");
        int second= input.nextInt();

        int result=first  & second;
        System.out.println("result is="+result);
    }
}
