import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương từ bàn phím
        System.out.print("Nhap so nguyen duong: ");
        int n = scanner.nextInt();

        // Kiểm tra nếu số nhập vào là số âm
        if (n < 0) {
            System.out.println("Nhap so nguyen duong.");
        } else {
            // Tính giai thừa
            long factorial = 1;
            for (int i = 1; i <= n; ++i) {
                factorial *= i;
            }
            // In ra kết quả giai thừa
            System.out.println("Giai thua cua " + n + " la: " + factorial);
        }

        scanner.close();
    }
}
