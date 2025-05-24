import java.util.*;

public class q13 {
    static List<Integer> getCommon(List<Integer> a, List<Integer> b) {
        Set<Integer> set = new HashSet<>(a);
        set.retainAll(b);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        System.out.println(getCommon(list1, list2));
    }
}

