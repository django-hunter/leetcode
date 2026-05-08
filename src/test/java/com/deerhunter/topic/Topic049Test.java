package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-06
 */
class Topic049Test {
    @Test
    void solution1() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = new Topic049.Solution1().groupAnagrams(strs);
        assertIterableEquals(Arrays.asList("eat", "tea", "ate"), lists.get(0));
        assertIterableEquals(Arrays.asList("tan", "nat"), lists.get(2));
        assertIterableEquals(Collections.singletonList("bat"), lists.get(1));
    }

    @Test
    void sort() {
        String sored = new Topic049.Solution1().sort("adc");
        assertEquals("acd", sored);
    }
}
