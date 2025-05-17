package org.programs.java8.streams.questions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String input = "ilovejavaprogramming";
        System.out.println("**************************Input String**************************");
        System.out.println(input);
        System.out.println("**************************Printing Occurrence of Character in String**************************");
        Map<Character, Long> characterCount =  getCountOfOccurrenceOfCharacter(input);
        System.out.println(characterCount);
    }

    private static Map<Character, Long> getCountOfOccurrenceOfCharacter(String input){
        return  input.chars().mapToObj(obj -> (char) obj).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }


}
