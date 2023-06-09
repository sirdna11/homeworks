package io.codelex.oop.parcels;

public class Test {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(40, 60, 200, 28.0f, false);
        System.out.println("Validation of parcel1: " + parcel1.validate());

        Parcel parcel2 = new Parcel(20, 60, 200, 28.0f, false);
        System.out.println("Validation of parcel2: " + parcel2.validate());

        Parcel parcel3 = new Parcel(40, 60, 300, 28.0f, false);
        System.out.println("Validation of parcel3: " + parcel3.validate());

        Parcel parcel4 = new Parcel(40, 60, 200, 40.0f, false);
        System.out.println("Validation of parcel4: " + parcel4.validate());

        Parcel parcel5 = new Parcel(40, 60, 200, 20.0f, true);
        System.out.println("Validation of parcel5: " + parcel5.validate());
    }
}

