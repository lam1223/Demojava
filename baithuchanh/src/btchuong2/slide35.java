package btchuong2;
import java.util.Scanner;

public class slide35 {
    public static void main(String[] args) {
        // Tao mot doi tuong Scanner de nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);

        // Nhap vao hai so tu nguoi dung
        System.out.print("Nhap vao so thu nhat: ");
        double soThuNhat = scanner.nextDouble();

        System.out.print("Nhap vao so thu hai: ");
        double soThuHai = scanner.nextDouble();

        // Tim va in ra so nho nhat
        double soNhoNhat = timSoNhoNhat(soThuNhat, soThuHai);
        System.out.println("So nho nhat trong hai so la: " + soNhoNhat);

        // Dong doi tuong Scanner sau khi su dung
        scanner.close();
    }

    // Phuong thuc tim so nho nhat trong hai so 
    private static double timSoNhoNhat(double a, double b) {
        return Math.min(a, b);
    }
}