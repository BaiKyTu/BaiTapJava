import java.util.Scanner;

public class TienKaraoke{
    public static void main(String[] args) {
        int tienGio = 30000;
        int tienGioSau3h = 27000;
        double discount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giờ khách vào(9h-24h): ");
        int gioVao = scanner.nextInt();
        if (gioVao<9){
            System.out.println("Giờ vào ko hợp lệ! Nhập lại!");
        }else {
            System.out.println("Nhập giờ ra: ");
            int gioRa = scanner.nextInt();
            System.out.println("Số chai nước khách dùng: ");
            int chaiNuoc = scanner.nextInt();
            int gioHat = gioRa - gioVao;
            if (gioVao>=9 && gioVao<=17){
                discount= 0.2;
            }else {
                discount=1;
            }
            int tienNuoc = chaiNuoc*10000;
            int tienHat;
            if (gioHat<=3){
                tienHat = gioHat*tienGio;
            }else {
                tienHat = 90000+(gioHat-3)*tienGioSau3h;
            }
            double tongBill =(tienHat + tienNuoc) - (tienHat + tienNuoc)* discount;
            System.out.println("\nGiờ Hát: "+gioHat);
            System.out.println("Tiền Hát: "+tienHat);
            System.out.println("Tiền Nước: "+tienNuoc);
            System.out.println("####################");
            System.out.println("Tổng bill: "+tongBill);
        }
    }
}
