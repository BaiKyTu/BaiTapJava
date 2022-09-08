package BaiTapJavaCore;

import java.util.*;

public class JavaBai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0; i<a.length; i++){
            System.out.printf("Nhập phần tử thứ %d: ",i+1);
            a[i] = scanner.nextInt();
        }
        //Tính TB:
        float tong=0;
        for (int i=0; i<a.length; i++){
            tong = tong + a[i];
        }
        System.out.println("a. Giá trị trung bình: "+ (tong/n));

        //Tìm số nhỏ nhất, lớn nhất
        int tam=0;
        for (int i=0; i<a.length; i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    tam = a[i];
                    a[i]=a[j];
                    a[j] = tam;
                }
            }
        }
        System.out.println("b. Phần tử nhỏ nhất: "+a[0]);
        System.out.println("   Phần tử lớn nhất: "+a[n-1]);

        //Tìm số âm lớn nhất, nhỏ nhất
        int max=0;
        for (int i=0; i<a.length; i++){
            if (a[0]>0){
                System.out.println("c. Ko có số âm nhỏ nhất! ");
                System.out.println("   Ko có số âm lớn nhất!");
                break;
            } else {
                System.out.println("c. Số âm nhỏ nhất: "+a[0]);
                break;
            }
        }
        if (a[0]>0){
        } else {
            for (int i=0; i<a.length; i++){
                if (a[i]<0){
                    max = a[i];
                }
                if (a[i]<0 && a[i]>max){
                    max = a[i];
                }
            }
            System.out.println("   Số âm lớn nhất: "+max);
        }


        //Tìm số dương lớn nhất, nhỏ nhất
        int min=-1;
        for (int i=0; i<a.length; i++){
            if (a[n-1]<0){
                System.out.println("d. Ko có số dương lớn nhất!");
                System.out.println("   Ko có số dương nhỏ nhất!");
                break;
            } else {
                System.out.println("d. Số dương lớn nhất: "+a[n-1]);
                break;
            }
        }
        if (a[n-1]<0){
        } else {
            for (int i=0; i<a.length; i++){
                if (a[i]>0){
                    if (min == -1){
                        min = a[i];
                    } else if (a[i]<min){
                        min = a[i];
                    }
                }
            }
            System.out.println("   Số dương nhỏ nhất: "+min);
        }


        //Chẵn lẻ:
        System.out.print("e. Các phần tử chẵn: ");
        for (int i=0; i<a.length; i++){
            if (a[i]%2==0){
                System.out.print(a[i]+" ");
            } else {
                System.out.print("Ko có phần tử chẵn!");
                break;
            }
        }
        System.out.print("\n   Các phần tử lẻ: ");
        for (int i=0; i<a.length; i++){
            if (a[i]%2!=0){
                System.out.print(a[i]+" ");
            } else {
                System.out.print("Ko có phần tử lẻ!");
                break;
            }
        }


        //Thêm 1 phần tử theo index
        System.out.println("\nf. Mời nhập thêm phần tử: ");
        int x = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<a.length; i++){
            Collections.addAll(list,a[i]);
        }
        list.add(x);
        System.out.println("Các phần tử trong danh sách: "+list);

        //Xóa phần tử:
        System.out.println("Nhập tên phần tử muốn xóa: ");
        int y = scanner.nextInt();
        if (list.contains(y)){
            list.remove(Integer.valueOf(y));
            System.out.println("Đã xóa!");
        } else {
            System.out.printf("Ko có phần tử [%d] trong mảng!",y);
        }
        System.out.println("Danh sách sau khi xóa: "+list);



    }
}
