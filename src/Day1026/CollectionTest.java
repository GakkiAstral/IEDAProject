package Day1026;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(true);
        c.add(new Student("张三",23,"男",3));
        c.add("abcd");
        c.remove("abcd");

        System.out.println(c);
    }
}
