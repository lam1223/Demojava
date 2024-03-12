package person;
import java.util.Scanner;

public class Person {
    public String hoTen;
    public String Sodienthoai;
    public int NamSinh;


    public void nhapThongTin () {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ho va ten : ");
        hoTen = sc.nextLine();
        System.err.print("nhap so dien thoai : ");
        Sodienthoai = sc.nextLine();
        System.out.print("nhap nam sinh : ");
        NamSinh = sc.nextInt();
        sc.close();
    }
    public void inThongTin () {
        System.out.println("ho va ten = " + hoTen);
        System.out.println("so dien thoai = " + Sodienthoai);
        System.out.println("nam sinh = " + NamSinh);
    }

    public void inThongTin ( String name, String sdt, int age) {
        System.out.println("\nho va ten = " + name);
        System.out.println("so dien thoai = " + sdt);
        System.out.println("nam sinh = " + age);
    }
    public Person()
    {
        hoTen = "Nguyen Van AA";
        Sodienthoai = "0966764383";
        NamSinh = 1999;
    }
    public void HienThiThongTin () {
        System.out.println("ho va ten = " + hoTen);
        System.out.println("so dien thoai = " + Sodienthoai);
        System.out.println("nam sinh = " + NamSinh);
    }
}
