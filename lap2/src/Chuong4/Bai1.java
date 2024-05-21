package Chuong4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Khởi tạo ArrayList để lưu dãy số nguyên
        ArrayList<Integer> numbers = new ArrayList<>();

        // Nhập dãy số từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Tìm số nguyên lớn nhất
        int max = Collections.max(numbers);
        System.out.println("So nguyen lon nhat trong day la: " + max);

        // Nhập số nguyên để xoá
        System.out.print("Nhap so nguyen can xoa: ");
        int deleteNum = scanner.nextInt();

        // Xoá các phần tử có giá trị bằng giá trị vừa nhập
        while (numbers.contains(deleteNum)) {
            numbers.remove(Integer.valueOf(deleteNum));
        }

        // Sắp xếp dãy số
        Collections.sort(numbers);

        // In dãy số sau khi sắp xếp ra màn hình
        System.out.println("Day so sau khi sap xep:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
