package com;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map map1 = new HashMap();
        Map map2 = new Hashtable();
        Map map3 = new LinkedHashMap();
        Map map4 = new TreeMap();

        map1.put("1","one");
        map1.put("3","three");
        map1.put("2","two");
        System.out.println(map1.get(3));
        Set set = map1.entrySet();
        for (Object o:set) {
            System.out.println(o );

        }

    }
}
