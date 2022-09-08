package BaiTapJavaCore;

import java.util.Scanner;

public class JavaBai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n: ");
        int n = scanner.nextInt();
        int a,kq=0;
        if (n<=0){
            System.out.println("Lỗi! n>0 Nhập lại!");
        }else {
            while (n>0){
                a=n%10;
                n=n/10;
                kq=kq+a;
            }
            System.out.println("Tổng các chữ số: "+kq);
        }
    }
}
