import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcomes you to the area of triangle");
        System.out.println("enter the sides");
        int num1=input.nextInt();
        int num2=input.nextInt();
        double area=0.5*num1*num2;
        System.out.println("area= " +area);
    }
}
