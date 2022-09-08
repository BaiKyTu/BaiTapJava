package BaiTapJavaCore;

import java.util.Scanner;

public class JavaBai21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1,x2,v1,v2;
        while (true){
            System.out.println("Nhập vị trí Kan 1 (0-9999): ");
             x1 = scanner.nextInt();
            if (x1 >=0 && x1<1000){
                break;
            }
        }
        while (true){
            System.out.println("Nhập vận tốc Kan 1 (>=1): ");
             v1 = scanner.nextInt();
            if (v1 >=1){
                break;
            }
        }
        while (true){
            System.out.println("Nhập vị trí Kan 2 (0 <= x1 < x2 < 10000): ");
             x2 = scanner.nextInt();
            if (x2 >=0 && x2<10000 && x2>x1){
                break;
            }
        }
        while (true){
            System.out.println("Nhập vận tốc Kan 2 (<=10000): ");
            v2 = scanner.nextInt();
            if (v2 >0 && v2<=10000){
                break;
            }
        }

        for (int i=0; i<10000; i++){
            x1 = x1 + v1;
            x2 = x2 + v2;
            if (x1 == x2){
                break;
            }
        }
        if (x1 == x2){
            System.out.println("2 Kan gặp nhau tại vị trí: "+x1);
        } else {
            System.out.println("2 Kan ko gặp nhau!");
        }

        }

    }

