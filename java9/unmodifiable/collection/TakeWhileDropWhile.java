package java9.unmodifiable.collection;

import java.util.Arrays;
import java.util.List;

public class TakeWhileDropWhile
{
    public static void main(String[] args)
    {
        List<Integer> list1 = Arrays.asList(10, 3, 14, 81, 29, 9);

//        list1.stream()
//                .takeWhile(num -> num < 80)
//                .forEach(e -> System.out.print(e+" "));

        List<Integer> list2 = Arrays.asList(1, 2, 3, 5, 10, 19, 20);

//        list2.stream()
//                .filter(e -> e < 10)
//                .forEach(e -> System.out.print(e+" sout"));

//        list2.stream()
//                .takeWhile(e -> e < 10)
//                .forEach(e -> System.out.print(e+" "));

//        list1.stream()
//                .dropWhile(e -> e < 13)
//                .forEach(e -> System.out.print(e+" "));

        list2.stream()
                .dropWhile(e -> e < 5)
                .forEach(e -> System.out.print(e+" "));
















    }
}
