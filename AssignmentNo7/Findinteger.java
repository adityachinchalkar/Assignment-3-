package AssignmentNo7;
import java.util.*;
public class Findinteger {
        public static void main(String[] args)
        {
            List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8);


            number.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        }



}


