//package CF;

import java.util.*;

public class Div3_1080B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            int[] b = new int[n+1];

            for(int i=1;i<=n;i++){
                a[i] = sc.nextInt();
                b[i] = a[i];
            }

            Arrays.sort(b,1,n+1);

            HashMap<Integer,ArrayList<Integer>> m1 = new HashMap<>();
            HashMap<Integer,ArrayList<Integer>> m2 = new HashMap<>();

            for(int i=1;i<=n;i++){
                int k = i;
                while(k%2==0) k/=2;

                m1.putIfAbsent(k,new ArrayList<>());
                m2.putIfAbsent(k,new ArrayList<>());

                m1.get(k).add(a[i]);
                m2.get(k).add(b[i]);
            }

            boolean f = true;

            for(int k : m1.keySet()){
                ArrayList<Integer> l1 = m1.get(k);
                ArrayList<Integer> l2 = m2.get(k);
                Collections.sort(l1);
                Collections.sort(l2);
                if(!l1.equals(l2)){
                    f = false;
                    break;
                }
            }

            System.out.println(f ? "YES" : "NO");
        }
    }
}
