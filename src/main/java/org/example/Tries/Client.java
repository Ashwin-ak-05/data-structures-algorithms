package org.example.Tries;

public class Client {
    public static void main(String[] args) {
        SearchTheWord searchTheWord = new SearchTheWord();
        String[] words = {"cater","draw","man","cat"};
        Trie root = searchTheWord.insertWords(words);
        System.out.println(searchTheWord.search(root,"man"));
    }
}
