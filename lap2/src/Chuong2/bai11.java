import java.util.Arrays;
import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng A có n phần tử
        int[] A = new int[n];

        // Nhập phần tử cho mảng A
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Sao chép mảng A để sắp xếp
        int[] sortedA = Arrays.copyOf(A, n);
        Arrays.sort(sortedA);

        // In ra mảng số ban đầu
        System.out.println("Mang so ban dau:");
        printArray(A);

        // In ra mảng đã sắp xếp
        System.out.println("Mang da sap xep tang dan:");
        printArray(sortedA);

        scanner.close();
    }

    // Phương thức để in ra mảng
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
