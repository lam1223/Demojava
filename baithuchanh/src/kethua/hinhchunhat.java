package kethua;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc {
    public float chieuDai;
    public float chieuRong;
    public hinhchunhat(){
        ten = "Hinh Chu Nhat";
    }
    public void nhapChieuDai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu Dai = ");
        chieuDai = sc.nextFloat();
    }
    public void nhapChieuRong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu Rong = ");
        chieuRong = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuvi = (chieuDai+chieuRong)*2;
    }
    public void tinhDienTich(){
        dientich = chieuDai*chieuRong;
    }
}