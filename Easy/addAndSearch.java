class TrieNode {
	boolean hasWord;
	TrieNode[] children;
	public TrieNode() {
		hasWord = false;
		children = new TrieNode[26];
	}
}

public class WordDictionary {


	TrieNode root = new TrieNode();
    // Adds a word into the data structure.
    public void addWord(String word) {
        if (word == null || word.length() == 0)
        	return;
        int len = word.length();
        TrieNode p = root;
        for (int i = 0; i < len; i++) {
        	int index = word.charAt(i) - 'a';
        	if (p.children[index] == null) {
        		p.children[index] = new TrieNode();
        	}
        	p = p.children[index];
        }
        p.hasWord = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        if (word == null || word.length() == 0) return false;
        return search_word(word, 0, root);
    }

    public boolean search_word(String word, int index, TrieNode node) {
    	if (index == word.length()) {
    		return node.hasWord;
    	}
    	if (word.charAt(index) == '.') {
    		for (int i = 0; i < 26; i++) {
    			if (node.children[i] != null) {
    				if (search_word(word, index + 1, node.children[i])) {
    					return true;
    				}
    			}
    		}
    	}
    	else {
    		int i = word.charAt(index) - 'a';
    		if (node.children[i] == null) {
    			return false;
    		} else {
    			return search_word(word, index+1, node.children[i]);
    		}
    	}
    	return false;
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");