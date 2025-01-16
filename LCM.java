import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter four numbers ");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        int num4= input.nextInt();
        int lcm=lcmOfFour(num1,num2,num3,num4);
        System.out.println("lcm of "+num1+"," +num2+"," +num3+ "," +num4+" is"+lcm);
    }
    public static int lcmOfFour(int num1, int num2,int num3, int num4){
        int i=1;
        while(true){
            int factor=num1*i;
            if (factor % num2 == 0 && factor % num3==0 && factor % num4 == 0) {
                return factor;
            }
            i++;
        }
    }
}
