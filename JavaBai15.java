package BaiTapJavaCore;

import java.util.Scanner;

public class JavaBai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String a = scanner.nextLine().trim();
        System.out.print("a. Độ dài của chuỗi vừa nhập: "+a.length());
        System.out.println("\nb. Mời nhập vị trí cần in ký tự: ");
        int n = scanner.nextInt();
        System.out.printf("Ký tự ở vị trí %d là \"%s\"",n,a.charAt(n-1));
        System.out.println();
        String str = "abcdef";
        if (a.contains(str)){
            System.out.printf("c. Có chuỗi phụ \"%s\" trong chuỗi vừa nhập!\n", str);
        } else {
            System.out.printf("c. Ko có chuỗi phụ \"%s\" trong chuỗi vừa nhập!", str);
        }
    }
}
