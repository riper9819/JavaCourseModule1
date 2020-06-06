package Module2;

import java.util.Objects;

/************************************
***   Created by Bohdan Mandych   ***
************************************/

// Class Pyramid is used for counting pyramid parameters
public class Pyramid implements IPerimeter, IPackaging {

    //Variables declaration
    private int id;
    private float sideA;
    private int sides;
    private float height;

    //Default empty constructor
    public Pyramid() {
    }

    //Full constructor
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

    //Counting angle between sides of pyramid base
    public float getBaseAngle() {
        return (180 * ((this.sides - 2f) / this.sides));
    }

    //Creating getters and setter for sideA, sides and height parameters
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
        return  "-----Pyramid parameters-----" +
                "\n\nSide a = " + getSideA() + " cm" +
                "\nNumber of sides = " + getSides() + " cm" +
                "\nHeight of pyramid = " + getHeight() + " cm" +
                "\nEdge height = " + getEdgeHeight() + " cm" +
                "\nApothem = " + getApothem() + " cm" +
                "\nVolume = " + getVolume() + " cm3" +
                "\nBase perimeter = " + getBasePerimeter() +
                "\nSide perimeter = " + getSidePerimeter() +
                "\nBase Area = " + getBaseArea() + " cm2" +
                "\nLateral Area = " + getSideArea() + " cm2" +
                "\nSurface Area = " + getSurfaceArea() + " cm2" +
                "\nInner Radius= " + getInnerRadius() + " cm" +
                "\nOuter Radius = " + getOuterRadius() + " cm" +
                "\nEdge Angle = " + getEdgeAngle() + "°" +
                "\nSlant Angle = " + getSlantAngle() + "°" +
                "\nBase Angle = " + getBaseAngle() + "°";
    }

    //Merging results into json string
    @Override
    public String toJSON() {
        String json = "Pyramid{"
                + "\""  + "sideA\":" + this.getSideA() + ","
                + "\""  + "sides\":" + this.getSides() + ","
                + "\""  + "height\":" + this.getHeight() + ","
                + "\""  + "edgeHeight\":" + this.getEdgeHeight() + ","
                + "\""  + "apothem\":" + this.getApothem() + ","
                + "\""  + "volume\":" + this.getVolume() + ","
                + "\""  + "basePerimeter\":" + this.getBasePerimeter() + ","
                + "\""  + "sidePerimeter\":" + this.getSidePerimeter() + ","
                + "\""  + "baseArea\":" + this.getBaseArea() + ","
                + "\""  + "lateralArea\":" + this.getSideArea() + ","
                + "\""  + "surfaceArea\":" + this.getSurfaceArea() + ","
                + "\""  + "innerRadius\":" + this.getInnerRadius() + ","
                + "\""  + "outerRadius\":" + this.getOuterRadius() + ","
                + "\""  + "edgeAngle\":" + this.getEdgeAngle() + ","
                + "\""  + "slantAngle\":" + this.getSlantAngle() + ","
                + "\""  + "baseAngle\":" + this.getBaseAngle() + ","
                + "}";
        return json;
    }

    //Merging results into xml string
    @Override
    public String toXML() {

        String xml = "<Pyramid>"
                + "<sideA>" + this.getSideA() + "</sideA>"
                + "<sides>" + this.getSides() + "</sides>"
                + "<height>" + this.getHeight() + "</height>"
                + "<edgeHeight>" + this.getEdgeHeight() + "</edgeHeight>"
                + "<apothem>" + this.getApothem() + "</apothem>"
                + "<volume>" + this.getVolume() + "</volume>"
                + "<basePerimeter>" + this.getBasePerimeter() + "</basePerimeter>"
                + "<sidePerimeter>" + this.getSidePerimeter() + "</sidePerimeter>"
                + "<baseArea>" + this.getBaseArea() + "</baseArea>"
                + "<lateralArea>" + this.getSideArea() + "</lateralArea>"
                + "<surfaceArea>" + this.getSurfaceArea() + "</surfaceArea>"
                + "<innerRadius>" + this.getInnerRadius() + "</innerRadius>"
                + "<outerRadius>" + this.getOuterRadius() + "</outerRadius>"
                + "<edgeAngle>" + this.getEdgeAngle() + "</edgeAngle>"
                + "<slantAngle>" + this.getSlantAngle() + "</slantAngle>"
                + "<baseAngle>" + this.getBaseAngle() + "</baseAngle>"
                +  "</Pyramid>";
        return xml;
    }


    //Printing results to console
    @Override
    public void toConsole() {
        System.out.println("-----Pyramid parameters-----");
        System.out.println("Number of sides = " + getSides() + " cm");
        System.out.println("Height of pyramid = " + getHeight() + " cm");
        System.out.println("Edge height = " + getEdgeHeight() + " cm");
        System.out.println("Apothem = " + getApothem() + " cm");
        System.out.println("Volume = " + getVolume() + " cm3");
        System.out.println("Base perimeter = " + getBasePerimeter());
        System.out.println("Side perimeter = " + getSidePerimeter());
        System.out.println("Base Area = " + getBaseArea() + " cm2");
        System.out.println("Lateral Area = " + getSideArea() + " cm2");
        System.out.println("Surface Area = " + getSurfaceArea() + " cm2");
        System.out.println("Inner Radius= " + getInnerRadius() + " cm");
        System.out.println("Outer Radius = " + getOuterRadius() + " cm");
        System.out.println("Edge Angle = " + getEdgeAngle() + "°");
        System.out.println("Slant Angle = " + getSlantAngle() + "°");
        System.out.println("Base Angle = " + getBaseAngle() + "°");
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

    //Interface method for counting pyramid base perimeter
    @Override
    public float getBasePerimeter() {
        return this.getSideA() * this.getSides();
    }

    //Interface method for counting pyramid side perimeter
    @Override
    public float getSidePerimeter() {
        return this.getSideA() + 2 * (this.getEdgeHeight());
    }
}