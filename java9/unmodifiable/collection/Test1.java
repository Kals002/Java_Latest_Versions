
package java9.unmodifiable.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1
{
    public static void main(String[] args)
    {
        /*
                - unmodifiable list - If original collection changes then unmodifiable collection also changes.
                - List.of() - Immutable collection.
                - List.copyOf() - Creates new immutable list. If original list changes then no effect on copied list.
         */

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(13);
        list1.add(99);

        List<Integer> list2 = Collections.unmodifiableList(list1);

        list1.add(81);
        //System.out.println(list1);
       // list2.add(109);
        //System.out.println(list2);

        List<Integer> list3 = List.of(10, 11, 2, 4);
        //list3.add(1);

        List<Integer> list4 = List.copyOf(list1);

        list1.add(188);

        System.out.println(list1);
        System.out.println(list4);


    }
}
