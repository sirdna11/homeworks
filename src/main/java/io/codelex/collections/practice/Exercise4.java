package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        Scanner myObj = new Scanner(System.in);

        while (true) {
            System.out.print("Enter name:");
            String userName = myObj.nextLine();
            mySet.add(userName);
            if (userName.equals("")) {
                System.out.print("Unique name list contains:");
                for (String name : mySet) {
                    System.out.print(name + " ");
                }
            }
        }
    }
}
