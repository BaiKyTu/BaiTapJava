package BaiTapJavaCore;

import java.util.Scanner;

public class JavaBai5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tọa độ điểm A: x= ");
        int x1 = scanner.nextInt();
        System.out.print("y= ");
        int y1 = scanner.nextInt();
        System.out.print("Nhập tọa độ điểm B: x= ");
        int x2 = scanner.nextInt();
        System.out.print("y= ");
        int y2 = scanner.nextInt();
        double d= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Độ dài đoạn thẳng AB: "+d);
    }
}
