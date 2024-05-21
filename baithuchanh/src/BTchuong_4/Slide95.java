import java.util.Map;
import java.util.LinkedHashMap;

public class Slide95 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        hm.put(100, "Mo");
        hm.put(101, "Dia");
        hm.put(102, "Chat");

        // Hiển thị các phần tử trong LinkedHashMap
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // Hiển thị LinkedHashMap trước khi xóa
        System.out.println("Before invoking remove method: " + hm);

        // Xóa phần tử có key là 100
        hm.remove(100);

        // Hiển thị LinkedHashMap sau khi xóa
        System.out.println("After invoking remove method: " + hm);
    }
}
