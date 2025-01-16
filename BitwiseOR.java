import java.util.Scanner;

public class BitwiseOR {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter two numbers ");
        int first= input.nextInt();
        int second= input.nextInt();

        int result=first | second;
        System.out.println("result is="+result);
    }
}
