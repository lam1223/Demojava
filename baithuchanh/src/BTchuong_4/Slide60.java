import java.util.Iterator;
import java.util.LinkedHashSet;

public class Slide60 {
    public static void main(String[] args) {
        // Tạo một LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Thêm các phần tử vào LinkedHashSet
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("C++");
        linkedHashSet.add("JavaScript");

        // In LinkedHashSet trước khi xóa
        System.out.println("LinkedHashSet ban dau: " + linkedHashSet);

        // Sử dụng Iterator để xóa một phần tử bất kỳ (phần tử đầu tiên)
        Iterator<String> iterator = linkedHashSet.iterator();
        if (iterator.hasNext()) {
            String firstElement = iterator.next();
            iterator.remove();
            System.out.println("Da xoa phan tu: " + firstElement);
        }

        // In LinkedHashSet sau khi xóa
        System.out.println("LinkedHashSet sau khi xoa phan tu: " + linkedHashSet);
    }
}
