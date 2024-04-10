package btchuong2;
import java.util.Scanner;

public class slide40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot so tu 1 den 7 (1: Chu nhat, 2: Thu 2, ..., 7: Thu 7): ");
        int soNgay = scanner.nextInt();

        if (soNgay < 1 || soNgay > 7) {
            System.out.println("Vui long nhap so tu 1 den 7.");
        } else {
            hienThiNgayTrongTuan(soNgay);
        }

        scanner.close();
    }

    private static void hienThiNgayTrongTuan(int soNgay) {
        switch (soNgay) {
            case 1:
                System.out.println("Chu nhat");
                break;
            case 2:
                System.out.println("Thu 2");
                break;
            case 3:
                System.out.println("Thu 3");
                break;
            case 4:
                System.out.println("Thu 4");
                break;
            case 5:
                System.out.println("Thu 5");
                break;
            case 6:
                System.out.println("Thu 6");
                break;
            case 7:
                System.out.println("Thu 7");
                break;
        }
    }
}
