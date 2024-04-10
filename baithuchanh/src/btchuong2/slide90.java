package btchuong2;
import java.util.Scanner;

public class slide90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();

        // Hien thi cac ky tu cua chuoi tren moi dong
        System.out.println("Cac ky tu trong chuoi la:");
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

        scanner.close();
    }
}
