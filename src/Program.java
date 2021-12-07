import java.util.Scanner;
public class Program {
    public static void main(String args[]) {
        int one, two;
        System.out.println("Enter number of strings : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String a [] = new String[n];
        System.out.println("Enter" + " " + n + " " + "Strings: ");
        for (one = 0; one < n; one++) {
            a[one] = s.next();
        }
        for (one = 0; one < n; one++) {
            for (two = one + 1; two < n; two++) {
                if (a[one].compareTo(a[two]) > 0) {
                    String temp = a[one];
                    a[one] = a[two];
                    a[two] = temp;
                }
            }
        }
        System.out.println("Names after sorting  : ");
        for (two = 0; two < n; two++)
            System.out.println(a[two]);
    }

}


