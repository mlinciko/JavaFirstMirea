package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;

public class City {
    private String city;
    private String country;
    public City(String city, String country){
        this.city = city;
        this.country = country;
    }

    public static void main(String[] args){
        City city1 = new City("Moscow", "Russia");
        City city2 = new City("London", "UnitedKingdom");
        City city3 = new City("SaintPetersburg", "Russia");
        City city4 = new City("Vologda", "Russia");
        City city5 = new City("NewYork", "USA");
        //создаем массив объектов
        City[] cityArray = new City[]{city1, city2, city3, city4, city5};

        java.util.Map<String, ArrayList<String>> map = new HashMap<>(5);
        //запись стран в Map
        for(int i = 0; i < cityArray.length; i++){
            if(!map.containsKey(cityArray[i].country)) {
                map.put(cityArray[i].country, null);
            }
        }
        //запись городов в Map
        for(java.util.Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            ArrayList<String> temp = new ArrayList<String>();
            for(int i = 0; i < cityArray.length; i++){
                if(item.getKey() == cityArray[i].country) {
                    temp.add(cityArray[i].city);
                }
            }
            item.setValue(temp);
        }

        //вывод
        for(java.util.Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            System.out.println(item.getKey()+ " "+item.getValue());
            System.out.print("");
        }

    }
}
