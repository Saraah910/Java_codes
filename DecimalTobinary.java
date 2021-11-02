import java.util.Scanner;

public class DecimalTobinary {
    int rem, que;

    public void deci(int n) {
        while (n > 0) {
            rem = n % 2;
            n = n / 2;
            que = rem;
        }
        System.out.println(que);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre decimal number: ");
        int a = sc.nextInt();
        DecimalTobinary dec = new DecimalTobinary();
        dec.deci(a);

    }
}
