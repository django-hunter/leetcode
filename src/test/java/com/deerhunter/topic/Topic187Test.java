package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2021/1/4 10:26
 */
class Topic187Test {
    void batchTest(Function<String, List<String>> function) {
        Object[][] testCases = {
                {"AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT", Arrays.asList("AAAAACCCCC", "CCCCCAAAAA")},
                {"AAAAAAAAAAAAA", Arrays.asList("AAAAAAAAAA")}
        };
        for (Object[] testCase : testCases) {
            test(function, (String) testCase[0], (List<String>) testCase[1]);
        }
    }

    void test(Function<String, List<String>> function, String s, List<String> expectedResult) {
        assertEquals(expectedResult, function.apply(s));
    }

    @Test
    void solution1() {
        batchTest(new Topic187.Solution1()::findRepeatedDnaSequences);
    }

    @Test
    void solution2() {
        batchTest(new Topic187.Solution2()::findRepeatedDnaSequences);
    }

    @Test
    void solution3() {
        batchTest(new Topic187.Solution3()::findRepeatedDnaSequences);
    }

    @Test
    void solution4() {
        batchTest(new Topic187.Solution4()::findRepeatedDnaSequences);
    }
}
