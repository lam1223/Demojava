package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    ArrayList<Person> arrList = new ArrayList<Person>();

    public void themPhanTu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong doi tuong: ");
        int n = sc.nextInt();
        sc.nextLine(); // Doc bo ky tu xuong dong con lai

        for (int i = 0; i < n; i++) {
            Person s = new Person();
            s.nhapThongTin(); 
            this.arrList.add(s);     
        }   
    }

    public void hienThiThongTin() {
        for (Person person : arrList) {
            person.inThongTin();
        }
    }

    public void suaThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon sua tai vi tri nao: ");
        int index = sc.nextInt();
        sc.nextLine(); // Doc bo ky tu xuong dong con lai

        if (index >= 0 && index < arrList.size()) {
            Person p = new Person();
            p.nhapThongTin();
            this.arrList.set(index, p);
        } else {
            System.out.println("Vi tri khong hop le.");
        }
    }

    public void xoaThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Xoa het");
        System.out.println("2. Xoa phan tu chi dinh");
        int luachon = sc.nextInt();

        if (luachon == 1) {
            this.arrList.clear();
        } else if (luachon == 2) {
            System.out.println("Nhap phan tu chi dinh: ");
            int index = sc.nextInt();
            if (index >= 0 && index < arrList.size()) {
                this.arrList.remove(index);
            } else {
                System.out.println("Vi tri khong hop le.");
            }
        } else {
            System.out.println("Lua chon khong hop le.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        ArrayListDemo a = new ArrayListDemo();
        int luachon;
        
        do {
            System.out.println("------Menu-----");
            System.out.println("1. Them thong tin");  
            System.out.println("2. In thong tin");  
            System.out.println("3. Sua thong tin");  
            System.out.println("4. Xoa thong tin");  
            System.out.println("5. Thoat");
            luachon = sc.nextInt();

            switch (luachon) {
                case 1:
                    a.themPhanTu();
                    break;
                case 2:
                    a.hienThiThongTin();
                    break;
                case 3:
                    a.suaThongTin();
                    break;
                case 4:
                    a.xoaThongTin();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (luachon != 5);
    }
}
