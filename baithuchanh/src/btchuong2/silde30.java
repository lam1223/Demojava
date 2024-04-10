package btchuong2;
import java.util.Scanner;

public class silde30 {
    public static void main(String[] args) {
        // Tao mot đoi tuong Scanner đe nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);

        // Nhap vao mot so nguyen n tu nguoi dung
        System.out.print("Nhap vao mot so nguyen n (n > 0): ");
        int n = scanner.nextInt();

        // Kiem tra n co lon hơon 0 hay khong
        if (n <= 0) {
            System.out.println("Vui long nhap mot so nguyen dương lon hơn 0.");
        } else {
            // Tinh tong cac chu so cua so n
            int tongChuSo = tinhTongChuSo(n);

            // Hien thi ket qua
            System.out.println("Tong cac chu so cua so " + n + " la: " + tongChuSo);
        }

        // Đong đoi tuong Scanner sau khi su dung
        scanner.close();
    }

    // Phuong thuc tinh tong cac chu so cua mot so nguyen
    private static int tinhTongChuSo(int number) {
        int tong = 0;

        // Lap qua tung chu so cua so nguyen va cong vao tong
        while (number > 0) {
            tong += number % 10; // Lay chu so cuoi cung cua so
            number /= 10;        // Loai bo chu so cuoi cung cua so
        }

        return tong;
    }
}


