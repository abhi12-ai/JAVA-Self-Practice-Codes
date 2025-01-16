import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to determine whether it is positive, negative or zero: ");
        int num=input.nextInt();

        if(num>0){
            System.out.println("number is positive");
        }
        if(num==0){
            System.out.println("number is zero");
        }else{
            System.out.println("number is negative");
        }
    }
}
