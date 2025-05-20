package org.programs.java8.streams.questions;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatedCharString {
    public static void main(String[] args) {
        List<String> inputStrings = List.of("Aniruddh",
                "Java",
                "Program",
                "abcxyz");
    }

    public char[] findCharsOfNonRepeatedCharInString(List<String> inputStrings){
        /*List<char[]> charArray = inputStrings
                .stream()
                .map(obj -> obj.toCharArray())
                .collect(Collectors.toList());
        charArray.stream()

                .map()
                .collect(Collectors)

        inputStrings.stream()
                .flatMap(obj -> obj.toCharArray())
                .toList()
                .stream()
                .flatMap(obj -> )
                .collect(Collectors.groupingBy(Function.identity()), Collectors.counting());
*/
        return null;
    }
}
