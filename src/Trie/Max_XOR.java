package Trie;

public class Max_XOR {

    public static void main(String args[]) {

        int[] arr = {3, 10, 5, 25, 2, 8};

        Trie t = new Trie();

        // insert all numbers into trie
        for (int x : arr) {
            t.add(x);
        }

        int ans = 0;

        // find max xor
        for (int x : arr) {
            ans = Math.max(ans, t.getMaxXor(x));
        }

        System.out.println(ans); // Expected Output = 28
    }

    // ================= TRIE =================
    static class Trie {

        class Node {
            Node zero;
            Node one;
        }

        private Node root = new Node();

        // Insert number into Trie
        public void add(int val) {

            Node curr = root;

            for (int i = 31; i >= 0; i--) {

                int bit = (val >> i) & 1;

                if (bit == 0) {
                    if (curr.zero == null) {
                        curr.zero = new Node();
                    }
                    curr = curr.zero;
                } else {
                    if (curr.one == null) {
                        curr.one = new Node();
                    }
                    curr = curr.one;
                }
            }
        }

        // Get maximum XOR possible with val
        public int getMaxXor(int val) {

            Node curr = root;
            int maxXor = 0;

            for (int i = 31; i >= 0; i--) {

                int bit = (val >> i) & 1;

                // GREEDY: try opposite bit to maximize XOR
                if (bit == 0) {
                    if (curr.one != null) {
                        maxXor |= (1 << i);
                        curr = curr.one;
                    } else {
                        curr = curr.zero;
                    }
                } else {
                    if (curr.zero != null) {
                        maxXor |= (1 << i);
                        curr = curr.zero;
                    } else {
                        curr = curr.one;
                    }
                }
            }

            return maxXor;
        }
    }
}
