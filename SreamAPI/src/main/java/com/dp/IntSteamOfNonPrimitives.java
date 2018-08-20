package com.dp;


import java.util.stream.IntStream;

/**
 * This is just to show how it is possible obtain a stream of non-primitive
 * integers from certain range using {@Link Sream}
 */
public class IntSteamOfNonPrimitives {

    private static IntStream nonPrimitivesFromRange(int fromInclusive, int toInclusive) {
        return IntStream
                .rangeClosed(fromInclusive, toInclusive)
                .filter(a -> IntStream.range(2, a)
                        .anyMatch(divisor -> a % divisor == 0)
                );
    }

    public static void main(String[] args) {
        System.out.println("The product of non-primitive integers in range [10; 20] is - " + nonPrimitivesFromRange(10, 20)
                .reduce(1, (a, b) -> a * b)
        );

        nonPrimitivesFromRange(10, 20).forEach(System.out::println);
    }
}
