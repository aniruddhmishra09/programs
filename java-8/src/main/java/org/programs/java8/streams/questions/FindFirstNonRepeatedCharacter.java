package org.programs.java8.streams.questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String input = "ilovejavaprogramming";
        System.out.println("**************************Input String**************************");
        System.out.println(input);
        System.out.println("**************************Printing Occurrence of Character in String**************************");

        Optional<Map.Entry<Character, Long>> optionalMap =  getCountOfOccurrenceOfCharacter(input);
        if (optionalMap.isPresent()){
            System.out.println(optionalMap.get().getKey());
        }else{
            System.out.println("No Unique Character");
        }

    }

    private static Optional<Map.Entry<Character, Long>> getCountOfOccurrenceOfCharacter(String input){
        return input.chars().mapToObj(obj -> (char) obj).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream()
                .filter(obj -> obj.getValue() == 1)
                .findFirst();

    }
}
