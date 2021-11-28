package AssignmentNo7;

import java.util.Arrays;
import java.util.*;

public class DecidingOrder {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,-1,-2,3,4);

        number.stream().sorted().forEachOrdered(System.out::println);
    }
}
