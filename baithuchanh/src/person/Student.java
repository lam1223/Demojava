package person;
import java.util.Scanner;

public class Student {
    public String masv;
    public String fullname;
    public String diachi;
    public String gioitinh;
    public int tuoi;
    public int namsinh;
    public float diem;
    public float A,B,C;
    public final float diemA = 0.6f;
    public final float diemB = 0.3f;
    public final float diemC = 0.1f;    

    public void nhapgiatri () {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sinh vien : ");
        masv = sc.nextLine();
        System.out.print("nhap ho va ten sinh vien : ");
        fullname = sc.nextLine();
        System.out.print("nhap dia chi : ");
        diachi = sc.nextLine();
        System.out.print("nhap gioi tinh sinh vien : ");
        gioitinh = sc.nextLine();
        System.out.print("nhap nam sinh  : ");
        namsinh = sc.nextInt();
        System.out.print("nhap diem A : ");
        A = sc.nextFloat();
        System.out.print("nhap diem B : ");
        B = sc.nextFloat();
        System.out.print("nhap diem C : ");
        C = sc.nextFloat();
}

public int Tinhtuoi () {
    tuoi = 2024 - namsinh;
    return tuoi;
}
public float Tinhdiem() {
    diem = A * diemA + B * diemB + C * diemC;
    return diem;
}
public void ingiatri() {
    System.out.print("ma sinh vien : " + masv);
}

public void doiDiem () {
    if(diem >= 0 && diem<= 4) {
        System.out.print("Diem cua ban la diem f" );
    }
    if(diem >= 4 && diem<= 5.4) {
        System.out.print("Diem cua ban la diem D" );
    }
    if(diem >= 5.5 && diem<= 7) {
        System.out.print("Diem cua ban la diem C" );
    }
    if(diem >= 7 && diem<= 8.4) {
        System.out.print("Diem cua ban la diem B" );
    }
    if(diem >= 8.5 && diem<= 10) {
        System.out.print("Diem cua ban la diem A" );
    }
}
public void inGiatri() {
    System.out.print(" ma sinh vien : " + masv );
    System.out.print(" \nten sinh vien : " +  fullname );
    System.out.print(" \ngioi tinh : " + gioitinh );
    System.out.print(" \nnam sinh : " + namsinh );
    System.out.print(" \ndia chi : " + diachi );
}
}