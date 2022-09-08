package BaiTapJavaCore;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaBai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat currentLocale = NumberFormat.getInstance();
        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);
        System.out.println("Nhập số tiền gửi: ");
        double tienGui = scanner.nextInt();
        String strTienGui = en.format(tienGui);
        System.out.println("Nhập số tiền muốn rút: ");
        double tienRut = scanner.nextInt();
        String strTienRut = en.format(tienRut);
        System.out.println("Nhập lãi suất: ");
        float laiSuat = scanner.nextInt();
        System.out.printf("Số tiền gửi : %s\n", strTienGui);
        System.out.printf("Lãi suất: %.1f\n", laiSuat);
        double lai1Nam = tienGui * laiSuat/100;
        String strLai1Nam = en.format(lai1Nam);
        double tienLai = tienRut - tienGui;
        String strTienLai = en.format(tienLai);
        System.out.printf("Tiền lãi 1 năm: %s\n", strLai1Nam);
        System.out.printf("Số tiền muốn rút: %s\n", strTienRut);
        System.out.println("Tiền lãi: "+strTienLai);
        double soNam = (tienLai/lai1Nam);
        if (soNam<1){
            System.out.println("Cần: "+(soNam%1)*12+" tháng");
        }
        if (soNam>=1 && soNam%1==0){
            System.out.println("Cần: "+soNam+" năm");
        }
        if (soNam>=1 && soNam%1!=0){
            System.out.println("Cần: "+(int)(soNam/1)+" năm "+(int)((soNam%1)*12)+" tháng");
        }
    }
}

