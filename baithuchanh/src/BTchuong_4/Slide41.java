import java.util.LinkedList;
import java.util.Scanner;

public class Slide41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo LinkedList với các tháng
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Thang 1");
        linkedList.add("Thang 2");
        linkedList.add("Thang 3");
        linkedList.add("Thang 4");
        linkedList.add("Thang 5");
        linkedList.add("Thang 6");
        linkedList.add("Thang 7");
        linkedList.add("Thang 8");
        linkedList.add("Thang 9");
        linkedList.add("Thang 10");
        linkedList.add("Thang 11");
        linkedList.add("Thang 12");

        // Hiển thị các phần tử của LinkedList
        System.out.println("Cac phan tu trong LinkedList:");
        showList(linkedList);

        // Lấy phần tử theo chỉ số
        System.out.println("Nhap vao chi so cua phan tu can lay: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < linkedList.size()) {
            String element = linkedList.get(index);
            System.out.println("Phan tu o chi so " + index + " la: " + element);
        } else {
            System.out.println("Chi so khong hop le.");
        }

        // Thay đổi phần tử tại một chỉ số nhất định
        System.out.println("Nhap vao chi so cua phan tu can thay doi: ");
        index = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới
        if (index >= 0 && index < linkedList.size()) {
            System.out.println("Nhap gia tri moi: ");
            String newValue = scanner.nextLine();
            linkedList.set(index, newValue);
            System.out.println("LinkedList sau khi thay doi:");
            showList(linkedList);
        } else {
            System.out.println("Chi so khong hop le.");
        }

        // Xóa phần tử theo chỉ số
        System.out.println("Nhap vao chi so cua phan tu can xoa: ");
        index = scanner.nextInt();
        if (index >= 0 && index < linkedList.size()) {
            linkedList.remove(index);
            System.out.println("LinkedList sau khi xoa:");
            showList(linkedList);
        } else {
            System.out.println("Chi so khong hop le.");
        }

        // Kiểm tra xem LinkedList có chứa một phần tử cụ thể không
        scanner.nextLine(); // Đọc bỏ dòng mới
        System.out.println("Nhap gia tri can kiem tra: ");
        String value = scanner.nextLine();
        if (linkedList.contains(value)) {
            System.out.println("LinkedList co chua gia tri: " + value);
        } else {
            System.out.println("LinkedList khong chua gia tri: " + value);
        }

        // Hiển thị kích thước của LinkedList
        System.out.println("Kich thuoc cua LinkedList: " + linkedList.size());
    }

    public static void showList(LinkedList<String> list) {
        for (String obj : list) {
            System.out.print(obj + ", ");
        }
        System.out.println();
    }
}
