import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím không quá 80 ký tự
        System.out.print("Nhap chuoi khong qua 80 ky tu: ");
        String input = scanner.nextLine();

        // Kiểm tra độ dài của chuỗi
        if (input.length() > 80) {
            System.out.println("Chuoi qua dai. Vui long nhap lai.");
            return;
        }

        // Nhập ký tự từ bàn phím
        System.out.print("Nhap ky tu: ");
        char targetChar = scanner.next().charAt(0);

        // Đếm số lần xuất hiện của ký tự trong chuỗi
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                count++;
            }
        }

        // In ra số lần xuất hiện của ký tự
        System.out.println("So lan xuat hien cua ky tu '" + targetChar + "' trong chuoi: " + count);

        scanner.close();
    }
}
