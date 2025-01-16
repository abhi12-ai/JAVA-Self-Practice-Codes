import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number upto which you want series to be printed ");
        int num= input.nextInt();
        int printFibonacci=printFibonacci(num);
        System.out.println("Fibonacci series= "+printFibonacci);
    }

    public static int printFibonacci(int num){
        if (num<0)
            return num;
        System.out.println("0");
        if (num==0)
            return num;
        System.out.println("1");

        int first=0,second=1;
        while (first + second <= num) {
            int third=first+second;
            System.out.println(third+" ");
            first=second;
            second=third;
        }
        return first;
    }
}
