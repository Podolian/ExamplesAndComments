package com.dp;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class MapOfAnagrams {
    private static String alphabetize(String aWord){
        char[] letters = aWord.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }

    static Map<String, List<String>> valueOf(Collection<String> aText){
        return aText.stream()
                .collect(groupingBy(s -> alphabetize(s)));
    }

}
