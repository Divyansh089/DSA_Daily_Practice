package HashMap;
import java.util.*;
public class ConstructItinerary {
    public static void main(String args[]) {
        String[][] tickets = {
                {"MUC","LHR"},
                {"JFK","MUC"},
                {"SFO","SJC"},
                {"LHR","SFO"}
        };
        List<String> ans = new ArrayList<>();
        ans.add("JFK");
        HashMap<String , String> map = new HashMap<>();
        for(String [] a: tickets){
            map.put(a[0] , a[1]);
        }

        for(String a : construct(map , ans , "JFK")){
            System.out.print(a + "->");
        }
    }
    public static List<String> construct(HashMap<String , String> map , List<String> ans , String start){
        if(!map.containsKey(start)){
            return ans;
        }

        ans.add(map.get(start));
        return construct(map , ans , map.get(start));
    }
}