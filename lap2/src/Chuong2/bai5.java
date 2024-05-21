import java.util.Scanner;

public class bai5 {
   public bai5() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int tong = 0;

      while(true) {
         System.out.print("Nhap mot so nguyen (nhap 0 de ket thuc): ");
         int so = scanner.nextInt();
         if (so == 0) {
            break;
         }

         tong += so;
         if (tong > 100) {
            System.out.println("Tong cua cac so da nhap la: " + tong);
            break;
         }
      }

      scanner.close();
   }
}
