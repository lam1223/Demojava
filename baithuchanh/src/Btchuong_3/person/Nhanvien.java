package person;
import java.util.Scanner;

public class Nhanvien {
    String maNV;
    String tenNV;
    String quequanNV;
    int namsinhNV;
    int songaydilam;
    float luong;
    final float tienluong1ngay = 350000f;
    final float tienbaohiem1thang = 300000f;
    final float tienthuong = 500000f; 

    public void nhapGiaTri () {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma nhan vien : ");
        maNV = sc.nextLine();
        System.out.print("nhap ten nhan vien : ");
        tenNV = sc.nextLine();
        System.out.print("nhap que quan nhan vien : ");
        quequanNV = sc.nextLine();
        System.out.print(" nhap nam sinh nhan vien : ");
        namsinhNV = sc.nextInt();
        System.out.print("nhap so ngay di lam trong 1 thang cua nhan vien : ");
        songaydilam = sc.nextInt();

    }
    public int tinhtuoinhanvien() {
        int tuoi = 2024 - namsinhNV;
        return tuoi;
    }
    

public float tinhluongnhanvien () {
    if(songaydilam > 25) {
        luong = tienluong1ngay * songaydilam - tienbaohiem1thang + tienthuong;
    }else {
        luong = tienluong1ngay * songaydilam - tienbaohiem1thang;
    }
    return luong;
}
public void inGiaTri() {
    System.out.print("ma nhan vien: " + maNV );
    System.out.print("\nho va ten :" + tenNV );
    System.out.print("\nque quan :" + quequanNV );
    System.out.print("\nnamsinh : " + namsinhNV);
}
}
