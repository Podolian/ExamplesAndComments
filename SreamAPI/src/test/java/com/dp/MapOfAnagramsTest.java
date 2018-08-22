package com.dp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class MapOfAnagramsTest {


        private List<String> testText = new LinkedList<>();

    @org.junit.Test
    public void valueOf() {
        Collections.addAll(testText, "boom mobo bomo bazar zabar razab".split(" "));
        System.out.println(MapOfAnagrams.valueOf(testText));
        assertEquals(2, MapOfAnagrams.valueOf(testText).size());
    }
}