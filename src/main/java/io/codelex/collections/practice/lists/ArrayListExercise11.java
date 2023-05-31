package io.codelex.collections.practice.lists;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> arrayList = new ArrayList<>();
        //TODO: Add 10 values to list
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        arrayList.add("g");
        arrayList.add("h");
        arrayList.add("j");
        arrayList.add("k");
        System.out.println(arrayList);
        //TODO: Add new value at 5th position
        arrayList.add(4, "p");
        //TODO: Change value at last position (Calculate last position programmatically)

        arrayList.set(arrayList.size() - 1, "z");

        //TODO: Sort your list in alphabetical order
        Collections.sort(arrayList);
        //TODO: Check if your list contains "Foobar" element
        if (arrayList.contains("Foobar")) {
            System.out.println("it contains");
        } else {
            System.out.println("it dosent");
        }
        //TODO: Print each element of list using loop
        for (String arr : arrayList) {
            System.out.println(arr);
        }
    }

}
