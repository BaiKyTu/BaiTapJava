package BaiTapJavaCore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaBai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự: ");
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        boolean foundSpace = true;
        for (int i =0; i< chars.length; i++){
            if (Character.isLetter(chars[i])){
                if (foundSpace){
                    chars[i] = Character.toUpperCase(chars[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        str = String.valueOf(chars);
        System.out.println("Chuỗi sau khi thay đổi: "+str);
    }
}
