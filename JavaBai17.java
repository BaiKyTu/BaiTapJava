package BaiTapJavaCore;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class JavaBai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 100);
        while (true) {
            System.out.println("Mời nhập số: ");
            int input = scanner.nextInt();
            if (input == randomNum) {
                    System.out.println("BẠN ĐÃ ĐOÁN CHÍNH XÁC!");
                    break;
            } else if (input < randomNum) {
                    System.out.println("Số nhập vào NHỎ hơn số bí mật!");
            } else if (input > randomNum) {
                    System.out.println("Số nhập vào LỚN hơn số bí mật!");
            }
            }
        }

    }

