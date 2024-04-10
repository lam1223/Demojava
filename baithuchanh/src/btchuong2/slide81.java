package btchuong2;
import java.util.Scanner;

public class slide81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap kich thuoc cua ma tran
        System.out.print("Nhap so hang cua ma tran: ");
        int rows = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int cols = scanner.nextInt();

        // Khai bao ma tran voi kich thuoc da nhap
        int[][] matrix = new int[rows][cols];

        // Nhap cac phan tu cho ma tran
        System.out.println("Nhap cac phan tu cho ma tran:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhap phan tu tai hang " + (i + 1) + ", cot " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Tim gia tri lon nhat trong ma tran
        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        // Hien thi gia tri lon nhat
        System.out.println("Phan tu co gia tri lon nhat trong ma tran la: " + max);

        scanner.close();
    }
}
