import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số từ bàn phím
        System.out.print("Nhap so thu nhat: ");
        double num1 = scanner.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double num2 = scanner.nextDouble();

        // Tinh toan va hien thi ket qua
        System.out.println("Tong: " + (num1 + num2));
        System.out.println("Hieu: " + (num1 - num2));
        System.out.println("Tich: " + (num1 * num2));

        // Xu ly truong hop chia cho 0
        if (num2 != 0) {
            System.out.println("Thuong: " + (num1 / num2));
            System.out.println("Chia lay du: " + (num1 % num2));
        } else {
            System.out.println("Khong the thuc hien phep chia vi so thu hai bang 0.");
        }

        // So sanh cac so
        System.out.println("So thu nhat lon hon so thu hai: " + (num1 > num2));
        System.out.println("So thu nhat nho hon so thu hai: " + (num1 < num2));
        System.out.println("So thu nhat bang so thu hai: " + (num1 == num2));
        System.out.println("So thu nhat khac so thu hai: " + (num1 != num2));

        scanner.close();
    }
}
