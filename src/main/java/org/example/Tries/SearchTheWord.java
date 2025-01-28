package org.example.Tries;

public class SearchTheWord {

    public Trie insertWords(String[] words) {
        Trie root = new Trie('*');
        for (int i = 0; i < words.length; i++) {
            insert(root,words[i]);
        }
        return root;
    }

    public void insert(Trie root, String word) {
        Trie temp = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (temp.child.isEmpty() || !temp.child.containsKey(ch)
            ) {
                Trie newNode = new Trie(ch);
                temp.child.put(ch, newNode);
                temp = newNode;
            } else {
                temp = temp.child.get(ch);
            }
        }
        temp.isWordEnd = true;
    }

    public boolean search(Trie root, String word){
        Trie temp = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(!temp.child.containsKey(ch) || temp.child.isEmpty()){
                return false;
            }
            else{
                temp = temp.child.get(ch);
            }
        }
        return temp.isWordEnd;
    }


}
