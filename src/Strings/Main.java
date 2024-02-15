package Strings;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Masukkan string A dan B");
        Scanner a = new Scanner(System.in);
        String A = a.nextLine();
        Scanner b = new Scanner(System.in);
        String B = b.nextLine();
        System.out.println(A.length()+B.length());
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String output = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(output);
    }
}
