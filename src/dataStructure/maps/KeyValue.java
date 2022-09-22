package dataStructure.maps;

import java.util.*;

public class KeyValue {



    public static void main(String[] args) {
        List<String> li = new ArrayList();
        li.add("fdsjnfkj");
        li.add("fdsjnfkj2");
        li.add("fdsjnfkj3");
        li.add("fdsjnfkj4");
        li.add("fdsjnfkj5");

        for (String str : li){
            System.out.println(str);
        }

  // what is the diffrence between hashmap vs hashTable?
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1,"Hello W");
        mp.put(2,"Hello W2");
        mp.put(3,"Hello W3");
        mp.put(4,"Hello W4");
        mp.put(5,"Hello W5");
        mp.put(6,"Hello W6");

        for (Map.Entry<Integer, String> mr : mp.entrySet()){
            System.out.println(mr.getKey() + " -> "+ mr.getValue());
        }
    }

}
