import java.util.TreeSet;
import java.util.Scanner;

public class Slide70 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        // thêm các phần tử vào treeSetInteger
        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);

        // hiển thị các phần tử trong treeSetInteger
        System.out.println("Cac phan tu trong treeSetInteger: ");
        System.out.println(treeSetInteger);

        System.out.println("Nhap phan tu can them: ");
        number = scanner.nextInt();

        // thêm một phần tử mới vào treeSetInteger từ bàn phím
        // nếu phần tử đó đã tồn tại thì thông báo đã tồn tại ngược lại thì thêm vào
        if (!treeSetInteger.contains(number)) {
            treeSetInteger.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong treeSetInteger sau khi them: ");
            System.out.println(treeSetInteger);
        } else {
            System.out.println("Phan tu " + number + " đa ton tai!");
        }

        scanner.close();
    }
}
