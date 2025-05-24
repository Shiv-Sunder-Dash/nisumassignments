import java.util.*;

public class q12 {
    static Set<Integer> getSortedUnique(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        for (int i : arr) set.add(i);
        return set;
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 2, 3, 4, 5};
        System.out.println(getSortedUnique(nums));
    }
}

