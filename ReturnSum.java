import java.util.Scanner;

public class ReturnSum {
    public static void main(String[] args) {
        int first=readNUmber();
        int second=readNUmber();

        int sum=first+second;
        System.out.println("Sum of NUmber= "+sum);
    }
    public static int readNUmber(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number=input.nextInt();
        return number;
    }
}
