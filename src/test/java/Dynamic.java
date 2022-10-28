import javafx.util.Pair;

public class Dynamic {
    public static <U, V> Pair<U, V> makePair(U first, V second) {
        return new Pair<>(first, second);
    }

    public static void main(String[] args) {
        Pair<Dynamic, String> dynamicStringPair = makePair(new Dynamic(), "");
    }
}
