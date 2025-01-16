import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter four numbers ");
        int first= input.nextInt();
        int second= input.nextInt();
        int third= input.nextInt();
        int fourth= input.nextInt();
        int gcd=gcd(first,second,third,fourth);
        System.out.println("GCD of given numbers= "+gcd);
    }

    public static int gcd(int num1,int num2, int num3, int num4){
        int gcd=1;
        int i=2;
        int least=least(num1,num2,num3,num4);
        while (i <= least) {
            if(num1 %i==0 && num2 %i==0 && num3 %i==0 && num4 %i==0){
              gcd=i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int first,int second,int third,int fourth){
      if(first<second){
          return first;
      }else {
          return second;
      }
    }
}
