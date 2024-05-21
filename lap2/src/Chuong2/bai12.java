import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số hàng và số cột của ma trận
        System.out.print("Nhap so hang cua ma tran: ");
        int rows = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int cols = scanner.nextInt();

        // Khởi tạo ma trận với số hàng và số cột đã nhập
        int[][] matrix = new int[rows][cols];

        // Nhập các phần tử cho ma trận
        System.out.println("Nhap cac phan tu cho ma tran:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhap phan tu tai hang " + (i + 1) + ", cot " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Tìm phần tử lớn nhất trong ma trận
        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        // Hiển thị phần tử lớn nhất
        System.out.println("Phan tu co gia tri lon nhat trong ma tran la: " + max);

        scanner.close();
    }
}
