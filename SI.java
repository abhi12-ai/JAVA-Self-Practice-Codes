import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcomes you to the simple interest program");
        System.out.println("enter the principle amount");
        float principle= input.nextFloat();
        System.out.println("enter the rate of interest");
        float rate= input.nextFloat();
        System.out.println("enter the time in years");
        float time= input.nextFloat();
        float simpleInterest=(principle*rate*time)/100;
        System.out.println(simpleInterest);
    }
}
