package HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {

    static class HashMap<K, V> { // in class we Pass K,V Which is Called Generic Parameter...Which is used if we want to add anytype of value like String Integer  
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> Bucket[];

        @SuppressWarnings("unchecked") // this used if we define a LinkedList Without type
        public HashMap() {
            this.n = 4;
            this.Bucket = new LinkedList[4];
            this.N = Bucket.length;
            for (int i = 0; i < 4; i++) {
                this.Bucket[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;

        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = Bucket[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = Bucket;
            Bucket = new LinkedList[N * 2];

            n = 2 * N;
            for (int i = 0; i < Bucket.length; i++) {
                Bucket[i] = new LinkedList<>();
            }

            //nodes- > add in Bucket
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                Node node = Bucket[bi].get(di);
                node.value = value;
            } else {
                Bucket[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                return true;
            }
            else {
                return false;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                Node node = Bucket[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di != -1) {
                Node node = Bucket[bi].get(di);
                return node.value;
            } else {
                return null;
            }

        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < Bucket.length; i++) {
                LinkedList<Node> ll = Bucket[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }
    
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Nepal", 170);
        hm.put("US", 200);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
        
        
        
    }
}
