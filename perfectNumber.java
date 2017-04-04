package imperative;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class perfectNumber {

    public enum STATE {
        DEFICIENT, PERFECT, ABUNDANT;
    }

    public static Set<Integer> divisors(int n) {
        Set<Integer> set = IntStream
                .rangeClosed(1, n)
                .filter((i) -> n % i == 0)
                .boxed()
                .collect(Collectors.toSet());
        return set;
    }


    public static STATE process(int n) {
        int sum = divisors(n)
                .stream()
                .filter((i) -> i != n)
                .reduce((summa, i) -> summa + i)
                .orElse(0);

        if (sum < n) {
            return STATE.DEFICIENT;
        } else if (sum == n) {
            return STATE.PERFECT;
        } else {
            return STATE.ABUNDANT;
        }
    }

}
