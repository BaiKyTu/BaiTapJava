package BaiTapJavaCore;

import java.util.*;
import java.lang.Math;



public class JavaBai2 {
    public static void main(String[] args) {
        //Thập phân -> nhị phân
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thập phân n: ");
        int n = scanner.nextInt();
        int kq;

        List<Integer> myList = new ArrayList<Integer>();
        while (n>0){
            kq = n%2;
            n = n/2;
            myList.add(kq);
        }

        System.out.print("Chuyển thành số nhị phân: ");
        for (int i= myList.size()-1;i>=0;i--){
            System.out.print(myList.get(i));
        }

        //Nhị phân -> thập phân
        System.out.print("\nNhập số nhị phân: ");
        int m = scanner.nextInt();
        int kq1;
        double i=0, dec, kq2=0;
        while (m>0){
            kq1=m%10;
            dec=kq1*(Math.pow(2,i));
            i++;
            kq2=kq2+dec;
            m=m/10;
        }
        System.out.println("Chuyển thành số thập phân: "+kq2);
    }
}