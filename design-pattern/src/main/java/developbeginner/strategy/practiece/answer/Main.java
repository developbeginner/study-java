package developbeginner.strategy.practiece.answer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings1 = Arrays.asList("D", "B", "C", "E", "A");
        List<String> strings2 = Arrays.asList("D", "B", "C", "E", "A");

        strings1.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(strings1);

        strings1.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(strings1);

        strings2.sort((a, b) -> a.compareTo(b));
        System.out.println(strings2);

        strings2.sort((a, b) -> b.compareTo(a));
        System.out.println(strings2);
    }
}
