package io.codelex.classesandobjects.practice.Exercise7;

public class Dog {
    private static String mother;
    private String name;
    private String sex;
    private String father;

    public Dog(String name, String sex, String father, String mother) {
        this.name = name;
        this.sex = sex;
        this.father = father;
        this.mother = mother;
    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public static String getMother() {
        return mother;
    }

    public boolean hasSameMotherAs(Dog Dog) {
        if (Dog.getMother() == Dog.getMother()) {
            return true;
        }
        return false;
    }

    public String fathersName() {
        if (father == null) {
            return "unknown";
        }
        return father;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
