import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three numbers to check the greatest of them ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3= input.nextInt();

        if (num1>=num2 && num1>=num3){
            System.out.println(num1+" is greatest");
        }else if (num2>=num3){
            System.out.println(num2+" is greatest");
        }else{
            System.out.println(num3+" is greatest");
        }
    }
}
