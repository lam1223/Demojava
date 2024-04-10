package kethua;

import java.util.Scanner;

public class hinhtron extends hinhhoc {
    public float banKinh;
    public hinhtron(){
        ten = "Hinh Tron";
    }
    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban kinh = ");
        banKinh = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuvi = 2*PI*banKinh;
    }
    public void tinhDienTich(){
        dientich = PI*banKinh*banKinh;
    }
}