package org.programs.java8.streams.questions;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatedCharString {
    public static void main(String[] args) {
        List<String> inputStrings = List.of("Aniruddh",
                "Java",
                "Program",
                "abcxyz");

        List<Map<Character, Long>> charsOfNonRepeatedCharInString = findCharsOfNonRepeatedCharInString(inputStrings);
        System.out.println(charsOfNonRepeatedCharInString);
    }

    public static List<Map<Character, Long>> findCharsOfNonRepeatedCharInString(List<String> inputStrings){
        return inputStrings
                .stream()
                .map(String::chars)
                .toList().stream().map(obj -> obj.mapToObj(ch -> (char)ch)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())))
                        .filter(opt -> opt.entrySet().stream().filter(p -> p.getValue()> 1).findAny().orElseGet(() -> null) == null)
                        .collect(Collectors.toList());




    }
}
