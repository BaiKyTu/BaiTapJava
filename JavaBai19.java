package BaiTapJavaCore;

import java.util.Scanner;


public class JavaBai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = "";

        while (true) {
            System.out.println("\n MENU");
            System.out.println("1. Giải PT bậc 1");
            System.out.println("2. Giải PT bậc 2");
            System.out.println("3. Exit");
            System.out.println("Please choose the option(1-3): ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    System.out.println("Nhập các tham số của phương trình ax + b = 0");
                    System.out.print("a = ");
                    double a = sc.nextDouble();
                    System.out.print("b = ");
                    double b = sc.nextDouble();
                    if (a==0 && b==0){
                        System.out.println("Phương trình có vô số nghiệm!");
                    }
                    if (a==0 && b!=0){
                        System.out.println("Phương trình vô nghiệm!");
                    }
                    if (a!=0){
                        System.out.println("Phương trình có 1 nghiệm duy nhất: x = "+((-b)/a));
                    }
                    break;
                case "2":
                    System.out.println("Nhập các tham số của phương trình ax^2 + bx + c = 0");
                    System.out.print("a = ");
                    double a1 = sc.nextDouble();
                    System.out.print("b = ");
                    double b1 = sc.nextDouble();
                    System.out.print("c = ");
                    double c1 = sc.nextDouble();
                    double delta = (Math.pow(b1,2))-4*a1*c1;
                    if (delta<0){
                        System.out.println("Phương trình vô nghiệm!");
                    }
                    if (delta==0){
                        System.out.println("Phương trình có nghiệm kép: x1 =x2 = "+((-1*b1)/(2*a1)));
                    }
                    if (delta>0){
                        System.out.println("Phương trình có 2 nghiệm:");
                        System.out.println("x1 = "+(((-1*b1)+(Math.sqrt(delta)))/(2*a1)));
                        System.out.println("x2 = "+(((-1*b1)-(Math.sqrt(delta)))/(2*a1)));
                    }
                    break;
                case "3":
                    System.exit(0);

            }
        }
    }
}
