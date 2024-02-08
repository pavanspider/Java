package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("pavan");
        list.add("satish");
        System.out.println(list);

        Map<Integer,ArrayList<String>> map = new HashMap<>();
        map.put(1,list);
        System.out.println("returned map :"+map);
    }
}
