package ch3_functions;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.List;

public class Test1 {
    public static void swap(List<?> list, int i, int j) {
        Object o = list.get(i);
//        list.set(i, list.get(j));
    }

    public static <T> void swapInternal(List<T> list, int i, int j) {
        T t = list.get(i);
        list.set(i, list.get(j));
        list.set(j, t);
    }
}
