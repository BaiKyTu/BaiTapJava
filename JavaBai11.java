package BaiTapJavaCore;

import java.util.Scanner;

public class JavaBai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sộ tự nhiên n: ");
        int n = scanner.nextInt();
        double x = Math.log(n)/Math.log(2);
        if (n<=1){
            System.out.println("Dữ liệu ko hợp lệ! Nhập lại!");
        }  else {
            if (x%1==0){
                System.out.println("Số cần tìm là: "+(int)(x-1));
            } else {
                System.out.println("Số cần tìm là: "+(int)(x/1));
            }
        }
    }
}
//    x = log2 n
//<=> 2^x = n
//==> 2^5 = 32