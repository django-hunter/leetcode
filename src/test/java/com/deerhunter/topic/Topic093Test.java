package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/4/15 01:46
 */
class Topic093Test {
    @Test
    void solution1() {
        Topic093.Solution1 instance = new Topic093.Solution1();
        List<String> expected = Arrays.asList("255.255.11.135", "255.255.111.35");
        List<String> actual = instance.restoreIpAddresses("25525511135");
        assertIterableEquals(expected, actual);

        expected = Arrays.asList("0.10.0.10", "0.100.1.0");
        actual = instance.restoreIpAddresses("010010");
        assertIterableEquals(expected, actual);
    }
}
