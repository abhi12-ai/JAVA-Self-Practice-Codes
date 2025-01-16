public class StarPattern {
    public static void main(String[] args) {
        printFirstPattern();
    }

    public static void printFirstPattern() {
        int rows=5;
//        while (rows < 5) {
//            System.out.println("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
//            rows++;
        }
    }
