package BaiTapJavaCore;

import java.util.Scanner;

public class JavaBai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tự nhiên n (1-9): ");
        int n = scanner.nextInt();
        for (int i=1; i<=n;i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

//n=4
//1
//12
//123
//1234
