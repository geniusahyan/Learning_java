package Lambda;

import java.util.function.Function;
import java.util.function.Predicate;
/*
public class PredicateLambda {
    public static void main(String[] args) {
        Predicate<Integer> lessthan18 = (i)->(i<18);
        System.out.println(lessthan18.test(17));
        System.out.println(lessthan18.test(19));
    }
} */

/*
public class PredicateLambda {
    public static void main(String[] args) {
        Predicate<Integer> greaterThan10 = (i)->(i>10);

        Predicate<Integer> lessThan20 = (i)->(i<20);

        boolean result = greaterThan10.and(lessThan20).test(15);
        System.out.println(result);
        boolean result1 = greaterThan10.and(lessThan20).test(8);
        System.out.println(result1);
        boolean result2= greaterThan10.and(lessThan20).test(25);
        System.out.println(result2);
        boolean result3= greaterThan10.negate().test(5);
        System.out.println(result3);
    }
} */


class FunctionInterface{
    public static void main(String[] args) {
        Function<Integer, Double> half = (a)-> a/2.0;
        System.out.println(half.apply(10));

        half = half.andThen((a)-> a*3);
        System.out.println(half.apply(10));

        half = half.compose((a)-> a*3);
        System.out.println(half.apply(2));
    }
}
