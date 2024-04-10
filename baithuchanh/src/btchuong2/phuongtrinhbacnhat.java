package btchuong2;
import java.util.Scanner;

public class phuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a và b 
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();

        // Gọi phương thức giaiPhuongTrinhBacNhat để giải phương trình
        phuongtrinhbacnhat(a, b);

        scanner.close();
    }

    // Phương thức giải phương trình bậc nhất
    public static void phuongtrinhbacnhat(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh là: " + x);
        }
    }
}
