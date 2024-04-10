import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();

        // Khởi tạo biến đếm
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int digitCount = 0;

        // Đếm số ký tự thường, ký tự hoa và số trong chuỗi
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // In ra số ký tự thường, ký tự hoa và số có trong chuỗi
        System.out.println("So ky tu thuong: " + lowercaseCount);
        System.out.println("So ky tu hoa: " + uppercaseCount);
        System.out.println("So chu so: " + digitCount);

        scanner.close();
    }
}
