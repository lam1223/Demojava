package btchuong2;
public class slide74 {
    public static void main(String[] args) {
        // Khai bao mang
        int[] arr = {2, 3, 4, 6, 7, 8, 10};

        // Goi ham de tinh tong cac so chan
        int sum = sumOfEvenNumbers(arr);

        // In ket qua
        System.out.println("Tong cac so chan trong mang la: " + sum);
    }

    // Ham de tinh tong cac so chan trong mang
    public static int sumOfEvenNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) { // Kiem tra xem so co phai so chan khong
                sum += num; // Cong so chan vao tong
            }
        }
        return sum;
    }
}
