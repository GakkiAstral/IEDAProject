package Day1027;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("A");
        c.add("B");
        c.add("C");
        c.add("D");

        Iterator it = c.iterator();
        //it.hasNext()用于判断集合中是否有元素，如果有则返回true
        while (it.hasNext()) {
            //it.next()会让指针后移1位
            Object obj1 = it.next();
            System.out.println(obj1 + " ");
        }
    }
}
