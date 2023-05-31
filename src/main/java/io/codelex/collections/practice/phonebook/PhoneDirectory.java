package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String, String> directory;

    public PhoneDirectory() {
        directory = new TreeMap<>();
    }

    public String getNumber(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        return directory.get(name);
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        directory.put(name, number);
    }
}
