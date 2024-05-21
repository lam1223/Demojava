package Chuong4;
import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        // Khởi tạo danh sách liên kết để lưu trữ các số nguyên dương
        LinkedList<Integer> numbers = new LinkedList<>();

        // Nhập số lượng số nguyên dương từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong so nguyen duong: ");
        int n = scanner.nextInt();

        // Nhập các số nguyên dương và thêm vào danh sách liên kết
        System.out.println("Nhap cac so nguyen duong:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > 0) {
                numbers.add(num);
            } else {
                System.out.println("So nhap vao khong phai la so nguyen duong, vui long nhap lai.");
                i--; // Yeu cau nhap lai neu so khong phai la so nguyen duong
            }
        }

        // Tinh trung binh cong cua cac so chan trong danh sach lien ket
        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
        }

        // Hien thi ket qua trung binh cong cua cac so chan
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Trung binh cong cua cac so chan la: " + average);
        } else {
            System.out.println("Khong co so chan trong danh sach.");
        }
    }
}
