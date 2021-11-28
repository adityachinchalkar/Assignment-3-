package AssignmentNo7;

import java.util.Arrays;
import java.util.List;

public class FindStartwith1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,19,25,98,12);

        myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
    }
}




