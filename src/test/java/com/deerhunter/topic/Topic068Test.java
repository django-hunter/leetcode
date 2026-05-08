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
 * @date 2020-03-24
 */
class Topic068Test {

    @Test
    void solution1() {
        Topic068.Solution1 instance = new Topic068.Solution1();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> expected = Arrays.asList(
                "This    is    an",
                "example  of text",
                "justification.  "
        );
        List<String> actualLines = instance.fullJustify(words, 16);
        assertLinesMatch(expected, actualLines);

        words = new String[]{"What", "must", "be", "acknowledgment", "shall", "be"};
        expected = Arrays.asList(
                "What   must   be",
                "acknowledgment  ",
                "shall be        "
        );

        actualLines = instance.fullJustify(words, 16);
        assertLinesMatch(expected, actualLines);

        words = new String[]{"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a",
                "computer.", "Art", "is", "everything", "else", "we", "do"};
        expected = Arrays.asList(
                "Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  ");
        actualLines = instance.fullJustify(words, 20);
        assertLinesMatch(expected, actualLines);

        words = new String[]{"Listen", "to", "many,", "speak", "to", "a", "few."};
        expected = Arrays.asList(
                "Listen",
                "to    ",
                "many, ",
                "speak ",
                "to   a",
                "few.  "
        );
        actualLines = instance.fullJustify(words, 6);
        assertLinesMatch(expected, actualLines);
    }
}
