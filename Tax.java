import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre your income in lacs: ");
        double inc = sc.nextDouble();
        if (inc < 2.5) {
            System.out.println("No tax return");
        } else if (inc > 2.5 && inc < 5) {
            double tax = 5d * inc * 1000;
            System.out.println("ITR: " + tax);
        } else if (inc > 5 && inc < 10) {
            double tax = 20d * inc * 1000;
            System.out.println("ITR: " + tax);
        } else if (inc > 10) {
            double tax = 30d * inc * 1000;
            System.out.println("ITR: " + tax);
        }

    }
}
