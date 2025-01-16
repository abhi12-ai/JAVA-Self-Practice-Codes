import java.util.Scanner;

public class PrintLeftHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        printLeftHalf(num);
    }

    public static void printLeftHalf(int maxRows){
        System.out.println("here is your left half pyramid");
        int rows=maxRows;
        while (rows > 0) {
            int j=0;
            while (j < rows - 1) {
                System.out.print(" ");
                j++;
            }
            int i=0;
            while (i<=(maxRows-rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
