import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide88 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg", "Quang Ngai");
        hashMapCity.put("QN", "Quang Nam");
        hashMapCity.put("QN", "Quang Ninh"); // Giá trị của key "QN" được ghi đè bằng "Quảng Ninh"
        hashMapCity.put("HCM", "Thanh pho Ho Chi Minh");

        System.out.println("Danh sach cac thanh pho trong hashMapCity: ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);

        // Lấy thành phố có mã là "QNg" và hiển thị tên thành phố
        System.out.println("QNg: " + hashMapCity.get("QNg"));

        // Lấy thành phố có mã là "NT"
        // Vì trong hashMapCity không có thành phố nào có mã là "NT"
        // Nên sẽ hiển thị giá trị null
        System.out.println("NT: " + hashMapCity.get("NT"));

        // Để kiểm tra xem một value có trong HashMap hay không
        // Chúng ta sẽ dùng phương thức containsValue()
        if (hashMapCity.containsValue("Thanh pho Ho Chi Minh")) {
            System.out.println("Co Thanh pho Ho Chi Minh trong hashMapCity");
        } else {
            System.out.println("Khong co Thanh pho Ho Chi Minh trong hashMapCity");
        }
    }
}
