package Chuong4;
import java.util.LinkedList;
import java.util.Scanner;

class Student {
    String name;
    double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Score: " + score;
    }
}

public class Bai3 {
    public static void main(String[] args) {
        // Khởi tạo danh sách liên kết để lưu trữ thông tin sinh viên
        LinkedList<Student> students = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        // Thêm sinh viên vào danh sách
        System.out.println("Nhap thong tin sinh vien:");
        while (true) {
            System.out.print("Nhap ten sinh vien (nhap rong de ket thuc): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Nhap diem sinh vien: ");
            double score = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ ký tự new line từ phím Enter

            // Thêm sinh viên vào danh sách
            students.add(new Student(name, score));
        }

        // Đếm số sinh viên phải thi lại và hiển thị thông tin của những sinh viên đó
        int countRetake = 0;
        System.out.println("\nSinh vien phai thi lai:");
        for (Student student : students) {
            if (student.score <= 5) {
                System.out.println(student);
                countRetake++;
            }
        }
        if (countRetake == 0) {
            System.out.println("Khong co sinh vien phai thi lai.");
        }

        // Hiển thị các sinh viên có điểm cao nhất
        double maxScore = Double.MIN_VALUE;
        System.out.println("\nSinh vien co diem cao nhat:");
        for (Student student : students) {
            if (student.score > maxScore) {
                maxScore = student.score;
            }
        }
        for (Student student : students) {
            if (student.score == maxScore) {
                System.out.println(student);
            }
        }

        // Tìm kiếm sinh viên theo tên
        System.out.print("\nNhap ten sinh vien can tim kiem: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        System.out.println("Thong tin sinh vien can tim kiem:");
        for (Student student : students) {
            if (student.name.equalsIgnoreCase(searchName)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien co ten " + searchName);
        }
    }
}
