package chuong4;
import java.util.ArrayList;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListIntegers = new ArrayList<>();
        arrayListIntegers.add(0);
        
        Scanner scanner = new Scanner (System.in);
        int number;

        System.out.println("Nhap so phan tu cua Array: ");
        int n = scanner.nextInt();

    for (int i = 0; i < 100; i++ ) {
        System.out.print("Nhap Phan Tu " + i + ": ");
        number = scanner.nextInt();
        arrayListIntegers.add(number);       
    }
    }
}








