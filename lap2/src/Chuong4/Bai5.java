package Chuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SinhVien {
    private String maSinhVien;
    private String hoVaTen;
    private String lop;

    public SinhVien(String maSinhVien, String hoVaTen, String lop) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.lop = lop;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return "MaSV: " + maSinhVien + ", HoTen: " + hoVaTen + ", Lop: " + lop;
    }
}

public class Bai5 {
    public static void main(String[] args) {
        // Khai báo Map để lưu trữ danh sách sinh viên
        Map<String, SinhVien> sinhVienMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập danh sách n sinh viên
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự new line từ phím Enter

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ma sinh vien: ");
            String maSinhVien = scanner.nextLine();
            System.out.print("Ho va ten: ");
            String hoVaTen = scanner.nextLine();
            System.out.print("Lop: ");
            String lop = scanner.nextLine();

            SinhVien sinhVien = new SinhVien(maSinhVien, hoVaTen, lop);
            sinhVienMap.put(maSinhVien, sinhVien);
        }

        // Nhập tên Lớp từ bàn phím và hiển thị những sinh viên thuộc Lớp vừa nhập
        System.out.print("Nhap ten lop can hien thi: ");
        String lopCanTim = scanner.nextLine();
        System.out.println("Danh sach sinh vien thuoc lop " + lopCanTim + ":");
        for (SinhVien sv : sinhVienMap.values()) {
            if (sv.getLop().equalsIgnoreCase(lopCanTim)) {
                System.out.println(sv);
            }
        }

        // Nhập Mã sinh viên từ bàn phím và hiển thị họ tên và Lớp tương ứng
        System.out.print("Nhap ma sinh vien can tim: ");
        String maSinhVienCanTim = scanner.nextLine();
        SinhVien sinhVien = sinhVienMap.get(maSinhVienCanTim);
        if (sinhVien != null) {
            System.out.println("Thong tin sinh vien co ma " + maSinhVienCanTim + ":");
            System.out.println("Ho va ten: " + sinhVien.getHoVaTen());
            System.out.println("Lop: " + sinhVien.getLop());
        } else {
            System.out.println("Khong tim thay sinh vien co ma " + maSinhVienCanTim);
        }
    }
}
