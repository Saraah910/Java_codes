import java.util.Scanner;

public class method {
    public void Arr() {
        System.out.print("Entre count of data: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        System.out.println("Entre the data: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        sc.close();
        System.out.println("Your data: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    public void concat() {
        System.out.println();
        System.out.println("Entre the strings to concat: ");
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        String str3 = s.nextLine();
        String line = str1.concat(" ").concat(str2).concat(" ").concat(str3);
        System.out.print("After concatinating: " + line);

    }

    public static void main(String[] args) {
        method m = new method();
        m.Arr();
        m.concat();
    }

}
