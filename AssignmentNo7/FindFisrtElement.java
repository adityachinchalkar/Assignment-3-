package AssignmentNo7;
import java.util.*;
import java.util.stream.*;

public class FindFisrtElement {
        public static <T> T
        firstElementInStream(Stream<T> stream)
        {
            T first_element
                    = stream.reduce((first, second) -> first).orElse(null);

            return first_element;
        }
        public static void main(String[] args)
        {

            Stream<String> stream
                    = Stream.of("edyuda_First", "edyuda_2",
                    "edyuda_3", "edyuda_4",
                    "edyuda_Last");

            System.out.println("First Element: " + firstElementInStream(stream));
        }
}



