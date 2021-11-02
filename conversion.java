import java.util.Scanner;

public class conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre kilometer: ");
        double k = sc.nextDouble();
        double miles = k * 0.621;
        System.out.println("After converting in miles: " + miles);
        System.out.println("Entre a number to check: ");
        System.out.println(sc.hasNextInt());

    }

}
