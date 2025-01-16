import java.util.Scanner;

public class TempConvrt {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter temp in fahrenheit");
        float temp= input.nextFloat();
        float cel=(temp-32)*5/9;
        System.out.println("converted= "+cel);
    }
}
