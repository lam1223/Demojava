package Chuong4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        // Khai báo 1 HashSet có kiểu dữ liệu là String
        HashSet<String> fruitSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Thêm vào HashSet tên của các loại trái cây được nhập bất kỳ từ bàn phím
        System.out.println("Nhap ten cac loai trai cay (nhap rong de ket thuc):");
        while (true) {
            String fruit = scanner.nextLine();
            if (fruit.isEmpty()) {
                break;
            }
            fruitSet.add(fruit);
        }

        // Hiển thị số phần tử có trong HashSet
        System.out.println("So phan tu co trong HashSet: " + fruitSet.size());

        // Nhập vào tên 1 loại trái cây và kiểm tra loại trái cây đó có tồn tại trong HashSet này hay không
        System.out.print("Nhap ten loai trai cay can kiem tra: ");
        String checkFruit = scanner.nextLine();
        if (fruitSet.contains(checkFruit)) {
            System.out.println("Co tim thay loai trai cay " + checkFruit);
        } else {
            System.out.println("Khong tim thay loai trai cay " + checkFruit);
        }

        // Xóa 1 loại trái cây bất kỳ trong HashSet và hiển thị các phần tử còn lại
        if (!fruitSet.isEmpty()) {
            Iterator<String> iterator = fruitSet.iterator();
            if (iterator.hasNext()) {
                String fruitToRemove = iterator.next();
                fruitSet.remove(fruitToRemove);
                System.out.println("Da xoa loai trai cay: " + fruitToRemove);
            }
        }
        System.out.println("Cac phan tu con lai trong HashSet: " + fruitSet);

        // Tạo 1 List mới có cùng kiểu dữ liệu với HashSet và thêm các phần tử của List này
        List<String> fruitList = new LinkedList<>();
        System.out.println("Nhap ten cac loai trai cay de them vao List (nhap trong de ket thuc):");
        while (true) {
            String fruit = scanner.nextLine();
            if (fruit.isEmpty()) {
                break;
            }
            fruitList.add(fruit);
        }

        // Thêm các phần tử của List này vào trong HashSet ban đầu
        fruitSet.addAll(fruitList);
        System.out.println("HashSet sau khi them cac phan tu cua List:");
        Iterator<String> it = fruitSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Xóa các phần tử của List có trong HashSet và hiển thị lại HashSet
        fruitSet.removeAll(fruitList);
        System.out.println("HashSet sau khi xoa cac phan tu cua List:");
        it = fruitSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
