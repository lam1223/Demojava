import java.util.ArrayList;

public class Slide21 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(3);
        
        // Thêm các phần tử vào ArrayList
        colors.add("Red");
        colors.add("Blue");
        
        // Chú ý rằng các lệnh thêm vào ArrayList phải nằm trong khối main
        colors.add("Green");
        colors.add("Orange");
        
        // Xoá phần tử "Green"
        colors.remove("Green");
        // Thêm các phần tử khác vào ArrayList
        colors.add("Pink");
        colors.add("Yellow");
                
        // Sử dụng một số phương thức của ArrayList
        // In ra phần tử ở vị trí thứ 1 (lưu ý vị trí bắt đầu từ 0)
        System.out.println(colors.get(1));  // Kết quả là "Blue"
                
        // Kiểm tra xem ArrayList có chứa "Orange" hay không
        System.out.println(colors.contains("Orange"));  // Kết quả là true
                
        // In ra kích thước của ArrayList
        System.out.println(colors.size());  // Kết quả là 5
                
        // In ra toàn bộ các phần tử của ArrayList
        System.out.println(colors);  // Kết quả là [Red, Blue
    }

}
        
