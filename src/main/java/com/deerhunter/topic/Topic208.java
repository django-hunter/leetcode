package com.deerhunter.topic;

import java.util.HashMap;
import java.util.Map;

/**
 * 实现一个 Trie2 (前缀树)，包含 insert, search, 和 startsWith 这三个操作。
 * <p>
 * 示例:
 * <p>
 * Trie2 trie = new Trie2();
 * <p>
 * trie.insert("apple");
 * trie.search("apple");   // 返回 true
 * trie.search("app");     // 返回 false
 * trie.startsWith("app"); // 返回 true
 * trie.insert("app");
 * trie.search("app");     // 返回 true
 * 说明:
 * <p>
 * 你可以假设所有的输入都是由小写字母 a-z 构成的。
 * 保证所有输入均为非空字符串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-trie-prefix-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-08-28
 */
public class Topic208 {
    // 自己写的实现，和标准实现的区别是：子节点使用了Map
    public static class Trie2 {
        private Node root = new Node(null);

        /**
         * Initialize your data structure here.
         */
        public Trie2() {

        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            Node cur = root;
            for (int i = 0; i < word.length(); i++) {
                cur = cur.addChild(word.charAt(i));
            }
            cur.setEndOfWord(true);
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            Node node = findDeepestNode(word);
            return node != null && node.isEndOfWord();
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            Node node = findDeepestNode(prefix);
            return node != null;
        }

        private Node findDeepestNode(String word) {
            Node cur = root;
            for (int i = 0; i < word.length(); i++) {
                Node next = cur.getChild(word.charAt(i));
                if (null == next) {
                    return null;
                }
                cur = next;
            }
            return cur;
        }
    }

    private static class Node {
        private Character character;
        private Map<Character, Node> children;
        private boolean endOfWord;

        public Node(Character s) {
            this.character = s;
            children = new HashMap<>();
        }

        /**
         * 添加一个子节点
         *
         * @param c
         * @return 新增的子节点
         */
        public Node addChild(Character c) {
            if (children.containsKey(c)) {
                return children.get(c);
            }
            Node child = new Node(c);
            children.put(c, child);
            return child;
        }

        public Character getChar() {
            return character;
        }

        public Node getChild(Character c) {
            return children.get(c);
        }

        public boolean hasChild() {
            return children.keySet().size() > 0;
        }

        public boolean isEndOfWord() {
            return endOfWord;
        }

        public void setEndOfWord(boolean endOfWord) {
            this.endOfWord = endOfWord;
        }
    }

    // 参考官方题解写的标准实现
    static class Trie {
        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode cur = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (!cur.containsKey(c)) {
                    cur.put(c);
                }
                cur = cur.getChild(c);
            }
            cur.setEnd();
        }

        public boolean search(String word) {
            TrieNode node = searchPrefix(word);
            return node != null && node.isEnd();
        }

        public boolean startsWith(String word) {
            TrieNode node = searchPrefix(word);
            return node != null;
        }

        private TrieNode searchPrefix(String word) {
            TrieNode cur = root;
            for (int i = 0; i < word.length(); i++) {
                TrieNode next = cur.getChild(word.charAt(i));
                if (null == next) {
                    return null;
                }
                cur = next;
            }
            return cur;
        }

        private String searchLongestPrefix(String word) {
            TrieNode node = root;
            StringBuilder prefix = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char curLetter = word.charAt(i);
                if (node.containsKey(curLetter) && (node.getLinks() == 1) && (!node.isEnd())) {
                    prefix.append(curLetter);
                    node = node.getChild(curLetter);
                } else
                    return prefix.toString();

            }
            return prefix.toString();
        }
    }

    private static class TrieNode {
        private static final int R = 26;
        private TrieNode[] children = new TrieNode[R];
        private boolean end;
        // 非空子节点的数量
        private int size;

        public void put(char c) {
            children[c - 'a'] = new TrieNode();
            size++;
        }

        public boolean containsKey(char c) {
            return children[c - 'a'] != null;
        }

        public TrieNode getChild(char c) {
            return children[c - 'a'];
        }

        public boolean isEnd() {
            return end;
        }

        public void setEnd() {
            end = true;
        }

        public int getLinks() {
            return size;
        }
    }
}
/**
 * Your Trie2 object will be instantiated and called as such:
 * Trie2 obj = new Trie2();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
