package kethua;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat {
    public hinhvuong(){
        ten = "Hinh Vuong";
    }
    public void nhapCanh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Canh = ");
        chieuDai = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuvi = chieuDai*4;
    }
    public void tinhDienTich(){
        dientich = chieuDai*chieuDai;
    }
}