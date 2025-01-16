import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the age of person to differentiate them according to their age groups ");
        int age= input.nextInt();

        if(age<=13 && age>=0){
            System.out.println("abhi abhi paida liya hai");
        } else if (age>=14 && age<=20) {
            System.out.println("bachha bada ho rha hai");
        } else if (age<=60 && age>=21) {
            System.out.println("kamane layak ho gya bachha, jaldi shaadi karo");
        }else{
            System.out.println("ab aap retire hone ka umar me aa chuke hain");
        }
    }
}
