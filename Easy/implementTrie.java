class TrieNode {
    public TrieNode[] children;
    public boolean hasWord;
    // Initialize your data structure here.
    public TrieNode() {
        children = new TrieNode[26];
        hasWord = false;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        if (word == null || word.length() == 0) return;
        int len = word.length();
        TrieNode t = root;
        for (int i = 0; i < len; i++) {
            int index = word.charAt(i) - 'a';
            if (t.children[index] == null) {
                t.children[index] = new TrieNode();
            }
            t = t.children[index];
        }
        t.hasWord = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        if (word == null || word.length() == 0) return false;
        int len = word.length();
        TrieNode t = root;
        for (int i = 0; i < len; i++) {
            int index = word.charAt(i) - 'a';
            t = t.children[index];
            if (t == null) return false;

        }
        return t.hasWord;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if (prefix == null || prefix.length() == 0) return false;
        int len = prefix.length();
        TrieNode t = root;
        for (int i = 0; i < len; i++) {
            int index  = prefix.charAt(i) - 'a';
            t = t.children[index];
            if (t == null) return false;
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");