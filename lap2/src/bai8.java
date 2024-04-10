import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng số trong dãy
        System.out.print("Nhap so luong so trong day: ");
        int n = scanner.nextInt();

        // Khởi tạo biến tổng và nhập dãy số
        int sum = 0;
        System.out.println("Nhap day so:");
        for (int i = 0; i < n; ++i) {
            int num = scanner.nextInt();
            sum += num;
        }

        // Tính và in ra trung bình của dãy số
        double average = (double) sum / n;
        System.out.println("Trung binh cua day so la: " + average);

        scanner.close();
    }
}
