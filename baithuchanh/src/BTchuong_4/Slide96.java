import java.util.LinkedHashMap;
import java.util.Map;

public class Slide96 {
    public static void main(String args[]) {
        // Khởi tạo LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Thêm các phần tử vào linkedHashMap
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(3, "C++");
        linkedHashMap.put(2, "PHP");
        linkedHashMap.put(4, "Python");

        // Hiển thị linkedHashMap trước khi xóa
        System.out.println("Truoc khi xoa:");
        show(linkedHashMap);

        // Xóa phần tử
        linkedHashMap.remove(3);

        // Hiển thị linkedHashMap sau khi xóa
        System.out.println("Sau khi xoa:");
        show(linkedHashMap);
    }

    // Hiển thị LinkedHashMap
    public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
