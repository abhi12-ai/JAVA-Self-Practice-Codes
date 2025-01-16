import java.util.Scanner;

public class PerimeterRect {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to the area of rectangle");
        System.out.println("Enter sides of rect");
        float side2=input.nextFloat();
        float side3=input.nextFloat();
        float side4=input.nextFloat();
        float side1=input.nextFloat();
        System.out.println("Perimeter of Rectangle= "+(side1+side2+side3+side4));
    }
}
