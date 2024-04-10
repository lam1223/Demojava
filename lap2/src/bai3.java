import java.time.LocalDate;
import java.util.Scanner;

public class bai3 {
   public bai3() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Nhap vao ten cua ban: ");
      String ten = scanner.nextLine();
      System.out.print("Nhap vao nam sinh cua ban: ");
      int namSinh = scanner.nextInt();
      int namHienTai = LocalDate.now().getYear();
      int tuoi = namHienTai - namSinh;
      if (tuoi < 16) {
         System.out.println("Ban " + ten + " o do tuoi vi thanh nien.");
      } else if (tuoi >= 16 && tuoi < 50) {
         System.out.println("Ban " + ten + " o do tuoi truong thanh.");
      } else {
         System.out.println("Ban " + ten + " \u0111a gia.");
      }

      scanner.close();
   }
}
