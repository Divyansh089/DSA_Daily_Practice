package LinkedList;
import java.util.HashSet;
import java.util.LinkedList;
public class duplicate {
    public static LinkedList<Integer> removeDuplicate(LinkedList<Integer> list){
        LinkedList<Integer> dup = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i : list){
            set.add(i);
        }
        System.out.println(set);
        dup.addAll(set);
        return dup;
    }
    public static void main (String [] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(removeDuplicate(list));
    }
}
