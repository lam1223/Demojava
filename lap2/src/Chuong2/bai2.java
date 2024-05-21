import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số từ bàn phím
        System.out.print("Nhap so: ");
        int number = scanner.nextInt();

        // Kiểm tra số chẵn hay lẻ
        if (number % 2 == 0) {
            System.out.println("So vua nhap la so chan.");
        } else {
            System.out.println("So vua nhap la so le.");
        }

        scanner.close();
    }
}
