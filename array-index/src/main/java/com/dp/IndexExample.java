package com.dp;

import java.util.Arrays;

public class IndexExample {

    /**
     * This is just to show that it's possible to refer array element by index right after
     * calling {@Link String} method.
     * And the same, but using parallel stream.
    */
    private static String partOfStringByIndex(int arrayIndex, String anyString) {
        return anyString.split(" ")[arrayIndex];
    }

    public static void main(String[] args) {
        String numeros = "uno dos tres quatro cinco";

        for(int i = 0; i<3; i++){
            System.out.println(partOfStringByIndex(i, numeros));
        }


        Arrays.stream(numeros.split(" "))
                .parallel()
                .forEach(System.out::println);
    }
}
