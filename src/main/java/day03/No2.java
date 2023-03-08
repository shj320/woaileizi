/**
 * author:sj
 */

package day03;

public class No2 {
    class TrieNode {		// 节点
        boolean isWord;
        TrieNode[] children = new TrieNode[26];
    }
    private TrieNode root;
    public No2() {
        root=new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur=root;
        for(int i=0;i<word.length();i++){
            int temp=word.charAt(i)-'a';
            if(cur.children[temp]==null){
                cur.children[temp]=new TrieNode();
            }
            cur=cur.children[temp];
        }
        cur.isWord=true;
    }

    public boolean search(String word) {
        TrieNode cur=root;
        for(int i=0;i<word.length();i++){
            int temp=word.charAt(i)-'a';
            if(cur.children[temp]==null){
                return false;
            }
            cur=cur.children[temp];
        }
        return cur.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur=root;
        for(int i=0;i<prefix.length();i++){
            int temp=prefix.charAt(i)-'a';
            if(cur.children[temp]==null){
                return false;
            }
            cur=cur.children[temp];
        }

        return true;
    }
}
