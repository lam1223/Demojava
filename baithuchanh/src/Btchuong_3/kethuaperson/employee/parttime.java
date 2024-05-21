package kethuaperson.employee;

import java.util.Scanner;

public class parttime extends employee {
    public float sogio = 3f;
    public float songay;
    public float cong1gio = 25000f;
    public parttime(){
        Tencv = "Part time";
    }
    public void nhapSoNgayLamViec(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so ngay lam viec trong mot thang : ");
        songay = sc.nextFloat();
    }
    public void TinhLuong(){
        Luong = cong1gio*sogio*songay;

    }
    
}