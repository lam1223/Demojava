package kethua;

import java.util.Scanner;

public class hinhtru extends hinhtron {
    public float chieuCao;
    public hinhtru(){
        ten = "Hinh Tru";
    }
    public void nhapChieuCao(){
        nhapBanKinh();
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu Cao = ");
        chieuCao = sc.nextFloat();
        
    }
    public void tinhTheTinh(){
        thetich = PI*banKinh*banKinh*chieuCao;
    }
}