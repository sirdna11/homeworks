package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Error: Each dimension of the parcel should be not less than 30.");
            return false;
        }

        if (xLength + yLength + zLength > 300) {
            System.out.println("Error: The sum of the dimensions of the parcel should not exceed 300.");
            return false;
        }

        if (isExpress && weight > 15.0) {
            System.out.println("Error: The weight of an express parcel should not exceed 15.0.");
            return false;
        }

        if (!isExpress && weight > 30.0) {
            System.out.println("Error: The weight of a non-express parcel should not exceed 30.0.");
            return false;
        }

        return true;
    }
}
