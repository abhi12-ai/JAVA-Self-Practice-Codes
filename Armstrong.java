import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the number to check armstrong or not ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        boolean isArmstrong=isArmstrong(num);
        System.out.println("is Armstrong? = "+isArmstrong);
        if (isArmstrong) {
            System.out.println("your number is armstrong");
        }else {
            System.out.println("your number is not armstrong");
        }
    }

    public static boolean isArmstrong(int num){
        int noOfDigits=noOfDigits(num);
        int numCopy=num;int finalNumber=0;
        while(num>0){
            int lastDigit=num%10;
            num/=10;
            finalNumber+=pow(lastDigit,noOfDigits);
        }
        return finalNumber==numCopy;
    }

    public static int pow(int num1, int num2){
        int result=1;
        int i=0;
        while (i < num2) {
            result *=num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num){
        int digits=0;
        while (num > 0) {
            digits++;
            num/=10;
        }
        return digits;
    }
}
