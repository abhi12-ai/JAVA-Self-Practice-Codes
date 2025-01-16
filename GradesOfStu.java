import java.util.Scanner;

public class GradesOfStu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("the following are the grade of student, evaluate them on the basis of their grades: ");
        System.out.println("Enter the grades of student");
        int num = input.nextInt();

        if (num >= 90) {
            System.out.println("grade A");
        } else if (num >= 75 && num <= 90) {
            System.out.println("Grade B");
        } else if (num >= 60 && num <= 75) {
            System.out.println("Grade C");
        } else if (num >= 30 && num <= 60) {
            System.out.println("Grade D");
        }
    }
}
