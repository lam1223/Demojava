import java.util.HashSet;
import java.util.Scanner;

public class Slide56 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Them cac phan tu vao hashSet
        hashSetInteger.add(0);
        hashSetInteger.add(1);
        hashSetInteger.add(2);
        hashSetInteger.add(3);
        hashSetInteger.add(4);
        hashSetInteger.add(5);
        hashSetInteger.add(6);

        // In cac phan tu trong hashSet
        System.out.println("Cac phan tu trong hashSetInteger: ");
        System.out.println(hashSetInteger);
        
        // Yeu cau nguoi dung nhap phan tu can xoa
        System.out.println("Nhap phan tu can xoa: ");
        number = scanner.nextInt();

        // Kiem tra va xoa phan tu neu co trong hashSet
        if (hashSetInteger.contains(number)) {
            hashSetInteger.remove(number);
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Phan tu khong ton tai trong hashSet");
        }

        // In cac phan tu con lai trong hashSet
        System.out.println("Cac phan tu con lai trong hashSetInteger: ");
        System.out.println(hashSetInteger);
    }
}
