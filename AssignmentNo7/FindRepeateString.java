package AssignmentNo7;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.stream.Collectors;


import static java.util.function.Function.identity;


public class FindRepeateString {

        private Optional<Character> findFirstNonRepeatingLetter(String s) {
            final Optional<Character> optionalCharacter = s.chars()
                    .mapToObj(i -> (char) i)
                    .collect(Collectors.groupingBy(identity(), LinkedHashMap::new, Collectors.counting()))
                    .entrySet().stream()
                    .filter(entry -> entry.getValue() == 1L)
                    .map(entry -> entry.getKey())
                    .findFirst();
            return optionalCharacter;
        }

    public static void main(String[] args) {
        FindRepeateString srt = new FindRepeateString();


    }
    }


