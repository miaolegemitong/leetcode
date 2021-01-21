package com.miaolegemitong.leetcode.p208;

/**
 * @author mitong
 * @date 2019-06-05
 * @email mitong@meituan.com
 * @desc
 */
public class Trie {
    private TrieNode head;

    /** Initialize your data structure here. */
    public Trie() {
        head = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curNode = head;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curNode.getAlphabet()[c - 'a'] == null) {
                Alphabet alphabet = new Alphabet();
                if (i == word.length() - 1) {
                    alphabet.setWordEnd(true);
                }
                curNode.getAlphabet()[c - 'a'] = alphabet;
                if (i != word.length() - 1) {
                    curNode = new TrieNode();
                    alphabet.setNext(curNode);
                }
            } else {
                if (i == word.length() - 1) {
                    curNode.getAlphabet()[c - 'a'].setWordEnd(true);
                }
                if (curNode.getAlphabet()[c - 'a'].getNext() == null) {
                    TrieNode node = new TrieNode();
                    curNode.getAlphabet()[c - 'a'].setNext(node);
                    curNode = node;
                } else {
                    curNode = curNode.getAlphabet()[c - 'a'].getNext();
                }
            }
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curNode = head;
        for (int i = 0; i < word.length(); i++) {
            if (curNode == null) {
                return false;
            }
            char c = word.charAt(i);
            if (curNode.getAlphabet()[c - 'a'] == null) {
                return false;
            }
            if (i == word.length() - 1 && !curNode.getAlphabet()[c - 'a'].isWordEnd()) {
                return false;
            }
            curNode = curNode.getAlphabet()[c - 'a'].getNext();
        }
        return true;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode curNode = head;
        for (int i = 0; i < prefix.length(); i++) {
            if (curNode == null) {
                return false;
            }
            char c = prefix.charAt(i);
            if (curNode.getAlphabet()[c - 'a'] == null) {
                return false;
            }
            curNode = curNode.getAlphabet()[c - 'a'].getNext();
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
class TrieNode {
    private static final int ALPHABET_SIZE = 26;

    private Alphabet[] alphabet = new Alphabet[ALPHABET_SIZE];

    public Alphabet[] getAlphabet() {
        return alphabet;
    }
}

class Alphabet {
    private boolean isWordEnd;

    private TrieNode next;

    public Alphabet() {
        this.isWordEnd = false;
    }

    public void setWordEnd(boolean wordEnd) {
        isWordEnd = wordEnd;
    }

    public void setNext(TrieNode node) {
        next = node;
    }

    public boolean isWordEnd() {
        return isWordEnd;
    }

    public TrieNode getNext() {
        return next;
    }
}