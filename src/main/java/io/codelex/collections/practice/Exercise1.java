package io.codelex.collections.practice;

import java.sql.Array;
import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList);

        HashSet<String> hashSet = new HashSet<>((Arrays.asList(array)));
        System.out.println(hashSet);


        Map<String, String> map = new HashMap<>();
        map.put("Audi", "Germany");
        map.put("BMW", "Germany");
        map.put("Honda", "Japan");
        map.put("Mercedes", "Germany");
        map.put("VolksWagen", "Germany");
        map.put("Tesla", "USA");

        System.out.println(map);
    }
}
