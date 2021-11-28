package AssignmentNo7;
import java.util.stream.*;
public class FindTotalElement {

        public static void main(String[] args)
        {
            long count = Stream.of("learning","stream","too","much","hard")
                    .count();
            System.out.printf("There are %d words in the stream %n", count);

            count = IntStream.of(1,2,3,4,5,6,7,8,9)
                    .count();
            System.out.printf("There are %d integers in the stream %n", count);

            count = LongStream.of(1,2,3,4,5,6,7,8,9)
                    .filter(i -> i%2 == 0)
                    .count();
            System.out.printf("There are %d even numbers in the stream %n", count);
        }


}
