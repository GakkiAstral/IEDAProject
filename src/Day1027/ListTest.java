package Day1027;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("JoJo");
        list.add("C");
        list.add("D");

        ListIterator lit = list.listIterator();
        //指针从前往后移的打印，指针会移动到最后
        while(lit.hasNext()) {
            System.out.println(lit.next() + " ");
        }

        System.out.println();
        System.out.println("______________________________");

        //指针从后往前移的打印。
        while (lit.hasPrevious()) {
            System.out.println(lit.previous() + " ");
        }
    }
}
