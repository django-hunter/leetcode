package com.deerhunter.topic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Oops, forgot to write comments. Good luck, bro.
 *
 * @author chenxuejun
 * @since 2026/5/2 17:49
 */
class TopicRotatedDigitsTest {
  @Test
  void solution1() {
    TopicRotatedDigits.Solution1 solution = new TopicRotatedDigits.Solution1();
    int cnt = solution.rotatedDigits(10);
    assertThat(cnt).isEqualTo(4);
  }
}
