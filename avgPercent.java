import java.util.Scanner;

public class avgPercent {
    Scanner sc = new Scanner(System.in);

    public void setData() {
        System.out.print("Entre the marks of sub 1: ");
        Float str = sc.nextFloat();
        System.out.print("Entre the marks of sub 2: ");
        Float str1 = sc.nextFloat();
        System.out.print("Entre the marks of sub 3: ");
        Float str2 = sc.nextFloat();
        Avg(str, str1, str2);
        double percent = 0.33334 * (str + str1 + str2);
        System.out.print("The percentage of the student is: " + percent);
        System.out.println();

    }

    static void Avg(float a, float b, float c) {
        float Average = (a + b + c) / 3;
        System.out.println("The Average is: " + Average);
        if (Average >= 80) {
            System.out.println("Grade recieved: A");
            // System.out.println();
        } else if (Average >= 60) {
            System.out.println("Grade recieved: B");
            // System.out.println();
        } else if (Average < 60 && Average >= 40) {
            System.out.println("Grade recieved: C");
            // System.out.println();
        } else {
            System.out.println("Grade recieved: D");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre the number of students: ");
        int n = sc.nextInt();
        avgPercent[] arr = new avgPercent[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Student no: " + (i + 1));
            avgPercent marks = new avgPercent();
            marks.setData();
        }
    }
}
