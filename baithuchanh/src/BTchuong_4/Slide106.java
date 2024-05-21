import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Set;

public class Slide106 {
    public static void main(String[] args) {
        // Khai báo 1 TreeMap có tên là treeMap
        // Kiểu dữ liệu của key là Integer và value là Character
        TreeMap<Integer, Character> treeMap = new TreeMap<>();

        // Thêm value vào trong treeMap với key tương ứng
        // Sử dụng phương thức put()
        // Đối số thứ nhất trong put là key có kiểu là Integer
        // và đối số thứ hai là value có kiểu là Character
        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        treeMap.put(2, 'D');
        treeMap.put(8, 'E');

        // Tạo 1 Set có tên là setTreeMap
        // Chứa toàn bộ các entry (vừa key vừa value) của treeMap
        Set<Entry<Integer, Character>> setTreeMap = treeMap.entrySet();

        // Các entry trong setTreeMap sẽ được sắp xếp tăng dần theo khóa
        System.out.println("Cac entry co trong treeMap:");
        System.out.println(setTreeMap);
    }
}
