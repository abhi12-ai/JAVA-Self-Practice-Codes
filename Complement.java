import java.util.Scanner;

public class Complement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number ");
        int num= input.nextInt();

int result=~num;
        System.out.println("rsult is="+result);
    }
}
