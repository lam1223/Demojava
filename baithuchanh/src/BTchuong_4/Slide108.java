import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Slide108 {
    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        treeMap.put(1, 9d);
        treeMap.put(4, 10.1d);
        treeMap.put(2, 7.2d);
        treeMap.put(8, 20.28d);

        System.out.println("Cac phan tu co trong treeMap: ");
        Set<Map.Entry<Integer, Double>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);

        // Thay thế value của entry có khóa là 4 thành 20.11d
        treeMap.replace(4, 20.11d);

        // Thay thế value của entry có khóa là 2 thành 7.7d
        // Lưu ý: câu lệnh này chỉ hoạt động nếu entry có key là 2 và value là 7.2d
        // Nếu không tìm thấy entry thì không có gì thay đổi
        treeMap.replace(2, 7.2d, 7.7d);

        System.out.println("Cac phan tu co trong treeMap sau khi thay the: ");
        setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);
    }
}
