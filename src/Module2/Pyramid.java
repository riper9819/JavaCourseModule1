package Module2;

import java.util.Objects;

/************************************
 ***   Created by Bohdan Mandych   ***
 ************************************/

// Class Pyramid is a constructor for counting pyramid parameters
public class Pyramid {

    //Variables declaration
    private int id;
    private float sideA;
    private int sides;
    private float height;

    //Empty constructor
    public Pyramid() {
    }

    //Default constructor
    public Pyramid(float sideA, int sides, float height) {
        this.sideA = sideA;
        this.sides = sides;
        this.height = height;
    }

    //Method for counting side Area by formula
    //Used Math.toRadians method in order to convert results from degrees into Radians
    public float getEdgeHeight() {
        return (float) Math.sqrt(Math.pow(this.height, 2) + Math.pow((this.sideA / (2 * Math.sin(Math.toRadians(180 / this.sides)))), 2));
    }

    //Method for counting Apothem of pyramid by formula
    public float getApothem() {
        return (float) Math.sqrt(Math.pow(this.height, 2) + Math.pow((this.sideA / (2 * Math.tan(Math.toRadians(180 / this.sides)))), 2));
    }

    //Method for counting side Area by formula
    public float getSideArea() {
        return (float)
                ((this.sides * this.sideA / 2) *
                        Math.sqrt(Math.pow(this.height, 2) +
                                Math.pow((this.sideA / (2 * Math.tan(Math.toRadians(180 / this.sides)))), 2)));
    }

    //Method for counting base Area by formula
    public float getBaseArea() {
        return (float) ((this.sides * Math.pow(this.sideA, 2)) / (4 * (Math.tan(Math.toRadians(360 / (2 * this.sides))))));
    }

    //Method for counting surface Area by formula
    public float getSurfaceArea() {
        return this.getSideArea() + this.getBaseArea();
    }

    //Method for counting pyramid volume by formula
    public float getVolume() {
        return (float) ((this.height * this.sides * Math.pow(this.sideA, 2)) / (12 * Math.tan(Math.toRadians(180 / this.sides))));
    }

    //Method for counting radius of the inner pyramid base circle
    public float getInnerRadius() {
        return (float) (this.sideA / (2 * Math.tan(Math.toRadians((180 / this.sides)))));
    }

    //Method for counting radius of the outer pyramid base circle
    public float getOuterRadius() {
        return (float) (this.sideA / (2 * Math.sin(Math.toRadians((180 / this.sides)))));
    }

    //Counting angle between pyramid edge and base centre
    public float getEdgeAngle() {
        return (float) Math.toDegrees(Math.atan(this.height / this.getOuterRadius()));
    }

    //Counting angle between pyramid slant and base centre
    public float getSlantAngle() {
        return (float) Math.toDegrees(Math.atan(this.height / this.getInnerRadius()));
    }

    //Counting angle between edge of pyramid and side length
    public float getBaseAngleOfFace() {
        return (180 * ((this.sides - 2f) / this.sides));
    }

    //Creating getters and setter for sideA, sides and height parametres
    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //Creating toString method for all counted results
    @Override
    public String toString() {
        return  "-----Pyramid parametres-----" +
                "\n\nSide a = " + this.sideA + " cm" +
                "\nNumber of sides = " + this.sides + " cm" +
                "\nHeight of pyramid = " + this.height + " cm" +
                "\nEdge height = " + getEdgeHeight() + " cm" +
                "\nApothem = " + getApothem() + " cm" +
                "\nVelocity = " + getVolume() + " cm3" +
                "\nBase Area = " + getBaseArea() + " cm2" +
                "\nLateral Area = " + getSideArea() + " cm2" +
                "\nSurface Area = " + getSurfaceArea() + " cm2" +
                "\nInner Radius= " + getInnerRadius() + " cm" +
                "\nOuter Radius = " + getOuterRadius() + " cm" +
                "\nEdge Angle = " + getEdgeAngle() + "°" +
                "\nSlant Angle = " + getSlantAngle() + "°" +
                "\nBase Angle Of Face= " + getBaseAngleOfFace() + "°";
    }

    //Method equals created for checking parameters equality
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pyramid pyramid = (Pyramid) o;
        return Float.compare(pyramid.getSideA(), getSideA()) == 0 &&
                getSides() == pyramid.getSides() &&
                Float.compare(pyramid.getHeight(), getHeight()) == 0;
    }

    //Method hashCode created for parameters hashing
    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSides(), getHeight());
    }
}