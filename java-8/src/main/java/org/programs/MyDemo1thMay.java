package org.programs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyDemo1thMay {
    //String Array
    //Characters of a string which are not repeated in any of the String

    public static void main(String[] args) {
        List<String> inputStrings = List.of("Aniruddh",
                "Java",
                "Program",
                "abcxyz");
    }

    public static char[] findCharacters(List<String> inputStrings){
        Set<Character>  distinctCharSet = null;
        for(String obj: inputStrings){
            distinctCharSet = new HashSet<>();
            char[] stringChar =  obj.toCharArray();
            for(Character obj2 : stringChar){
                boolean isAdded = distinctCharSet.add(obj2);
                if(!isAdded){
                    break;
                }

            }
        }
        //return distinctCharSet;

        char[] chars ;
        for(String obj :inputStrings ){
            long distinct = obj.chars().distinct().count();
            if(distinct != obj.toCharArray().length){
                System.out.println("This is a repeated String "+inputStrings);
            }else{
                System.out.println("This is not a Repeated String "+inputStrings);
                chars = obj.toCharArray();
            }

        }
        return chars;
        /*inputStrings.stream()

                .map(obj -> obj.chars())

                .collect(Collectors.groupingBy(obj -> obj), Collectors.counting())
                */






    }
}
