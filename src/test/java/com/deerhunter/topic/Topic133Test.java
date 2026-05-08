package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/22 21:28
 */
class Topic133Test {
    // 注意，这里如果遇到两个图中的Node.neighbors顺序不同的情况，测试无法通过
    void test(Function<Node, Node> consumer) {
        Graph graph = new Graph(4, 4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);
        Node root = graph.vertexes[1];
//        root.bfs(System.out::println);
        Node clone = consumer.apply(root);
//        System.out.println("====");
//        clone.bfs(System.out::println);
        assertEquals(clone, root);
    }

    @Test
    void solution1() {
        test(new Topic133.Solution1()::cloneGraph);
    }

    @Test
    void solution2() {
        test(new Topic133.Solution2()::cloneGraph);
    }
}
