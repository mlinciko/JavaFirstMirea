package ru.mirea.task27;

import java.util.*;

public class Map {
    public static void main(String[] args){

        java.util.Map<String, String> map = new HashMap<>(5);
        map.put("Kalin", "Edward");
        map.put("Robberts", "Emma");
        map.put("Adams","Jane");
        map.put("Agron","Emma");
        map.put("Alba","Emma");

        Collection<String> list = map.values();
        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
        {
            if(Collections.frequency(list, itr.next())>1)
            {
                itr.remove();
            }
        }
        for(java.util.Map.Entry<String, String> item : map.entrySet()){
            System.out.println(item.getKey()+ " "+item.getValue());
            System.out.print("");
        }
    }
}
