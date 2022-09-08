package BaiTapJavaCore;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class JavaBai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0; i<a.length; i++){
            System.out.printf("Nhập phần tử thứ %d: ",i+1);
            a[i] = scanner.nextInt();
        }
        System.out.print("\nCác phần tử hiện có: ");
        System.out.println(Arrays.toString(a));
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i=0; i<a.length; i++){
            Collections.addAll(set, a[i]);
        }
        System.out.println("\nDanh sách sau khi chỉnh sửa: "+set);
    }
}