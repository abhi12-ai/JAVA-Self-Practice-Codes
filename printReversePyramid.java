import java.util.Scanner;

public class printReversePyramid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=input.nextInt();
        printReversePyramid1(rows);
    }

    public static void printReversePyramid1(int maxRows){
        System.out.println("\nhere is your reverse half pyramid");
        int rows=maxRows;
        while (rows > 0) {
            int i=0;
            while (i < rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
