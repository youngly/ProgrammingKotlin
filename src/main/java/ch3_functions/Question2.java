package ch3_functions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import static java.lang.ThreadLocal.withInitial;

public class Question2 {
    public final static ThreadLocal<DateFormat> formatter
            = withInitial(() -> new SimpleDateFormat("dd-MMM-yyyy"));

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        Runnable runnable = () -> System.out.println("");

        String s = A.<Integer, String>get(1);
        System.out.println(s);

//        ArrayList<Number> list = new ArrayList<Integer>();

        Question2 question21 = new Question2();
        Class<? extends Question2> aClass = question21.getClass();

        try {
            Class<?> he = Class.forName("he");
            Question2 question2 = (Question2) he.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class A {
    public static  <T, R> R get(T t) {
        return (R) t;
    }
}
