import java.util.*;

public class Anagram {

    // Step 1: Create TrieNode class
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        List<String> list = new ArrayList<>();
        boolean isEnd = false;
    }

    static TrieNode root = new TrieNode(); // Trie ka root node

    
    // Step 2: Sorted word ko insert karo
    public static void insert(String sortedWord, String originalWord) {
        TrieNode curr = root;

        for (int i = 0; i < sortedWord.length(); i++) {
            char ch = sortedWord.charAt(i);
            int idx = ch - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();  // naye curr banaye agar null ho
            }

            curr = curr.children[idx];  // aage badho
        }

        curr.isEnd = true;
        curr.list.add(originalWord);  // original word ko store karo
    }

    // Step 3: DFS se saare anagram groups collect karo
    public static void collectGroups(TrieNode curr, List<List<String>> result) {
        if (curr == null) return;

        if (curr.isEnd) {
            result.add(new ArrayList<>(curr.list));
        }

        for (int i = 0; i < 26; i++) {
            collectGroups(curr.children[i], result);
        }
    }

    // Step 4: Main function to group anagrams
    public static List<List<String>> groupAnagrams(String[] words) {
        for (String word : words) {
            char[] chArr = word.toCharArray();
            Arrays.sort(chArr);  // word ko sort karo
            String sorted = new String(chArr);

            insert(sorted, word);  // sorted word ke according insert karo
        }

        List<List<String>> result = new ArrayList<>();
        collectGroups(root, result);  // final result collect karo

        return result;
    }

    // ✅ Driver Code
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> output = groupAnagrams(words);

        for (List<String> group : output) {
            System.out.println(group);
        }
    }
}
