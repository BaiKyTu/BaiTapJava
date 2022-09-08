package BaiTapJavaCore;

import java.util.Scanner;

public class JavaBai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a (10-99): ");
        int a = scanner.nextInt();
        System.out.println("Nhập số b (10-99): ");
        int b = scanner.nextInt();
        if ((a<10 || a>99)||(b<10 || b>99)){
            System.out.println("Số nhập vào ko hợp lệ, nhập lại!");
        } else {
            if ((a%10 == b/10 || a%10 == b%10)||(a/10 == b/10 || a/10 == b%10)){
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        }

    }
}
