package DataTypes;

import java.util.*; // import untuk scanner

public class DataTypes {
    public static void main(String[] args) {
        int T;
        Scanner q = new Scanner(System.in);
        System.out.println("How many times would you enter a number?");
        T = q.nextInt();
        long n; // deklarasi variabel n untuk menampung
        for (int i = 0; i < T; i++) {
            Scanner a = new Scanner(System.in); // menyiapkan scanner t untuk membaca input user
            System.out.println("Enter a number");
            if (a.hasNextLong()) { // mengecek
                n = a.nextLong();
                System.out.println(n + " can be fitted in");
                if (Byte.MIN_VALUE <= n && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (Short.MIN_VALUE <= n && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (Integer.MIN_VALUE <= n && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } else {
                String nerror = a.nextLine();
                System.out.println(nerror + " can't be fitted anywhere.");
            }
        }
    }
}
