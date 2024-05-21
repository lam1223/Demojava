import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide86 {
    public static void main(String[] args) {
        // Khai báo 1 HashMap có tên là hashMap
        // Kiểu dữ liệu của key và value là String
        HashMap<String, String> hashMap = new HashMap<>();

        // Thêm value vào trong hashMap với key tương ứng
        // Sử dụng phương thức put()
        // Đối số thứ nhất trong put là key có kiểu là String
        // và đối số thứ hai là value có kiểu là String
        hashMap.put("CSLT", "Co so lap trinh");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C Sharp");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java", "Java");

        // Tạo 1 Set có tên là setHashMap
        // Chứa toàn bộ các entry (vừa key vừa value) của hashMap
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

        System.out.println("Cac entry co trong hashMap:");
        // Duyệt qua từng entry trong setHashMap và hiển thị
        for (Map.Entry<String, String> entry : setHashMap) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
