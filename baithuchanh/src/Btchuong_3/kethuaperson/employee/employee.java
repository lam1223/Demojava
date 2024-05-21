package kethuaperson.employee;

import java.util.Scanner;

import kethuaperson.person;

public class employee extends person {
    public String Tencv;
    public String manv;
    public String PhongBan;
    public String ChucVu;
    public float Luong;
    public void xuatTen(){
         System.out.println(" ==== " + Tencv + " ===== " );
    }
    public void nhapThongTinnv(){
         Scanner sc = new Scanner(System.in);
         System.out.print("nhap ma nhan vien : ");
         manv = sc.nextLine();
         System.out.print("nhap phong ban : ");
         PhongBan = sc.nextLine();
         System.out.print("nhap chuc vu : ");
         ChucVu = sc.nextLine();
    }
     public void nhapLuong(){}
     public void inThongTinnv(){
         Scanner sc = new Scanner(System.in);
         System.out.println("ma nhan vien : " + manv);
         System.out.println("phong ban : " + PhongBan);
         System.out.println("chuc vu : " + ChucVu);
         sc.close();
    }
     public void inLuong1Thang(){
         System.out.println("Luong thang : "+Luong);
    }


    public static void main(String[] args) {
        //luong Fulltime
        fulltime ft = new fulltime();
        ft.xuatTen();
        ft.nhapThongTinnv();
        ft.nhapLuong();
        ft.inThongTinnv();
        ft.TinhLuong();
        ft.inLuong1Thang();
        //luong Parttime
        parttime pt = new parttime();
        pt.xuatTen();
        pt.nhapThongTinnv();
        pt.nhapSoNgayLamViec();
        pt.inThongTinnv();
        pt.TinhLuong();
        pt.inLuong1Thang();
    }
}