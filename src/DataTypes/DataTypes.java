package DataTypes;

import java.util.*; // import untuk scanner

public class DataTypes {
    public static void main(String[] args) {
        int T;
        Scanner q = new Scanner(System.in);
        System.out.println("How many times would you enter a number?");
        T = q.nextInt();
        String[] n = new String[100]; // deklarasi array n untuk menampung
        for (int i = 0; i < T; i++) {
            Scanner a = new Scanner(System.in); // menyiapkan scanner t untuk membaca input user
            System.out.println("Enter a number");
            n[i] = a.nextLine();
        }
        long N;
        for (int i = 0; i < T; i++) {
            try {
                N = Long.parseLong(n[i]);
            } catch (Exception e) {
                System.out.println(n[i] + " can't be fitted anywhere.");
                continue;
            }
                System.out.println(N + " can be fitted in");
                if (Byte.MIN_VALUE <= N && N <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (Short.MIN_VALUE <= N && N <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (Integer.MIN_VALUE <= N && N <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
        }

    }
}
