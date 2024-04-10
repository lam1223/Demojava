package hinhhoc;
import java.util.Scanner;

public class HinhTron {

    public static void main(String[] args) {
        
    }

    // thuoc tinh
   
        // thuoc tinh
        public float r;
        final float PI = 3.14f;
        float cv;
        float dt;

        // phuongthuc
        void nhapbankinh() {
            System.out.print("R=");
            Scanner scanner = new Scanner(System.in);
            r = scanner.nextFloat();
            scanner.close();
        }

        void tinhChuvi() {
            cv = 2 * PI * r;
        }

        void tinhDientich() {
            dt = PI * r * r;
        }

        void inChuvi() {
            System.out.println("Chu vi Hinh Tron: " + cv);
        }

        void inDientich() {
            System.out.println("Dien tich Hinh Tron: " + dt);
        }
    
}
