import java.util.Scanner;

public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Wlcm to Array occurrences ");
        int[] numArr=ArrayUtility.inputArray();
        System.out.println("Enter the number you want to find ");
        int num= input.nextInt();
        int occurrences=noOfOccurrences(numArr,num);
        System.out.println("your element was found "+occurrences+" times in an array ");
    }
    public static int noOfOccurrences(int[] numArr, int num){
        int occ=0;
        int i=0;
        while(i<numArr.length){
            if (numArr[i] == num) {
                occ++;
            }
            i++;
        }
        return  occ;
    }
}
