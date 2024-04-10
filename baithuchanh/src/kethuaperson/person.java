package kethuaperson;

import java.util.Scanner;

public class person {
    public String HoTen;
    public String GioiTinh;
    public String maCCCD;
    public int NamSinh;
    public int Tuoi;
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ho va ten : ");
        HoTen = sc.nextLine();
        System.out.print("nhap gioi tinh : ");
        GioiTinh = sc.nextLine();
        System.out.print("nhap ma CCCD : ");
        maCCCD = sc.nextLine();
        System.out.print("nhap nam sinh : ");
        NamSinh = sc.nextInt();
    }
    public int TinhTuoi(){
      Tuoi = 2024 - NamSinh;
      return Tuoi ;
    }
    public void inThongTin(){
        System.out.println("Thong tin :");
        System.out.println("Ten: "+HoTen);
        System.out.println("Nam Sinh : "+NamSinh);
        System.out.println("Tuoi :"+Tuoi);
        System.out.println("GioiTinh: " +GioiTinh);
        System.out.println("Ma so CCCD: "+maCCCD);
    
    }
}