package LinkedList;
import java.util.LinkedList;
public class List {
    public static void main(String [] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Divyansh");
        list.add("is");
        list.add("great");
        list.add("man.");
        System.out.println(list);
        for(String s : list){
            System.out.println(s);
        }
    }
}
