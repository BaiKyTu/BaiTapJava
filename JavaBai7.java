package BaiTapJavaCore;

import java.util.Scanner;

public class JavaBai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n: ");
        int n = scanner.nextInt();
        int uoc = 0;
        System.out.printf("Ước của số tự nhiên %d là: \n",n);
        for (int i = 1; i<=n; i++){
            if (n%i==0){
                uoc = i;
                System.out.println(uoc);
            }
        }
    }
}
