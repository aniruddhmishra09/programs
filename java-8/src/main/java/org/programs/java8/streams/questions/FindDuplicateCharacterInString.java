package org.programs.java8.streams.questions;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharacterInString {
    public static void main(String[] args) {
        String input = "ilovejavaprogramming";
        System.out.println("**************************Input String**************************");
        System.out.println(input);
        System.out.println("**************************Printing Duplicate of Character in String**************************");
        List<Character> duplicateCharacter =  getDuplicateCharacter(input);
        System.out.println(duplicateCharacter);
    }

    private static List<Character> getDuplicateCharacter(String input){
         return input.chars().mapToObj(obj -> (char) obj).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().filter(obj -> obj.getValue() > 1)
                 .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
