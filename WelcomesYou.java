import java.util.Scanner;

public class WelcomesYou {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name ");

        String name=input.nextLine();
        System.out.println("Welcome "+name+" to KG Coding");
    }
}
