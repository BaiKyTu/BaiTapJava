package BaiTapJavaCore;

import java.util.Collections;
import java.util.Scanner;

public class JavaBai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String a = scanner.nextLine().trim();
        StringBuffer str = new StringBuffer(a);
        System.out.println("Chuỗi sau khi đảo thứ tự: "+str.reverse().toString());
    }
}
