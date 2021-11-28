package AssignmentNo7;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.*;

public class FindDuplicates {

    public static <T> Set<T>
    findDuplicateInStream(Stream<T> stream){
        Set<T> item = new HashSet<>();

        return stream.filter(n -> !item.add(n)).collect(Collectors.toSet());

    }

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(10,20,20,30,10,25,89);

        System.out.println(findDuplicateInStream(stream));
    }


}
