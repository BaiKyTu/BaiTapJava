package BaiTapJavaCore;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class JavaBai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String s = scanner.nextLine();
        checkPalindrome(s);
        }

    public static void checkPalindrome(String s) {
        int L = s.length();
        Set<String> hs = new HashSet<>();
        String subs = null;
        for (int i = 0; i < L; ++i) {
            for (int j = 0; j < (L - i); ++j) {
                subs = s.substring(j, i + j + 1);
                if(isPalindrome(subs))
                    hs.add(subs);
            }
        }
        System.out.println("Tổng các chuổi con palindrome: "+hs.size());
//        return hs.toString();

        String[] a = new String[hs.size()];
        hs.toArray(a);
//        int max= a[0].length();
        System.out.println("Chuỗi con palindrome dài nhất là : ");
        for (int i =1; i<a.length; i++){
            if (a[0].length() < a[i].length()){
                a[0] = a[i];
            }
        }
        System.out.println(a[0]);

    }

    public static boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() ==1)
            return true;
        if(s.charAt(0) ==  s.charAt(s.length()-1))
            return isPalindrome(s.substring(1, s.length()-1));
        return false;
    }
    }
