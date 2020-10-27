package Day1027;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("a");
        c.add("a");
        c.add("b");
        c.add("a");
        c.add("d");

        System.out.println(c);
        //toArray()可以将集合转化为数组。
        Object[] arr = c.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Collection c1 = new ArrayList();
        c1.add(true);
        c1.add(false);
        c1.add(100);

        c.addAll(c1);
        System.out.println(c);
        //输出结果是：[a, a, b, a, d, true, false, 100]
    }
}
