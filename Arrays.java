import java.text.BreakIterator;
import java.util.Scanner;

public class Arrays {

    static void fact(int num) {
        if (num < 0) {
            System.out.println("Entre an integer");
            break;
        }
        if (num > 0) {
            int prod = 1;
            for (int i = num; i > 0; i--) {
                prod *= i;
            }
            System.out.println("The factorial of " + num + " is " + prod);
        }
    }

    public static void main(String[] args) {
         float[] marks = { 21.3f, 85.2f, 321.4f, 74, 95.2f };
         float sum = 0;
         for (float elements : marks) {
         sum = sum + elements;
         }
         System.out.println("The sum of array elements is: " + sum);
         int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
         int[][] mat2 = { { 8, 7, 5 }, { 4, 2, 10 } };
         int[][] Index = { { 0, 0, 0 }, { 0, 0, 0 } };
         for (int i = 0; i < mat1.length; i++) {
         for (int j = 0; j < mat1[i].length; j++) {
         System.out.println("Setting values: " + i + j);
         Index[i][j] = mat1[i][j] + mat2[i][j];
         }

         }
         for (int i = 0; i < mat1.length; i++) {
         for (int j = 0; j < mat1[i].length; j++) {
         System.out.println(Index[i][j]);
         Index[i][j] = mat1[i][j] + mat2[i][j];
         }

         }
         int[] arr = { 1, 3, 50, 74, 12, 46 };
         int [] rev = {0,0,0,0,0,0};
         for (int i = arr.length - 1; i >= 0; i--) {
         System.out.println(arr[i]);
         }
         system.out.print("Entre the number: ");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         Arrays a1 = new Arrays();
         a1.fact(n);
    }
}
