package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise1 {

    //TODO: Write a Java program to create a new array list, add some elements (string) and print out the collection.
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        //TODO: Add 5 colors to list
        colors.add("Red");
        colors.add("green");
        colors.add("black");
        colors.add("blue");
        colors.add("orange");
        colors.add("brown");


        System.out.println(colors);
    }

}
