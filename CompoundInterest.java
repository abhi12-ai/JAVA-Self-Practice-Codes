import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcomes you to the coumpound interest program");
        System.out.println("enter the principle amount");
        float principle = input.nextFloat();
        System.out.println("enter the rate of interest");
        float rate = input.nextFloat();
        System.out.println("enter the time in years");
        float time = input.nextFloat();
        double compInt = principle * Math.pow((1 + rate / 100), time);
        System.out.println(compInt);
    }
}