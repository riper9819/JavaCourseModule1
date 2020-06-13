/*
 * Class name: Sign
 *
 * Version info 1.0
 *
 * 11-Jun-2020
 *
 * Copyright (c) Bohdan Mandych
 *
 * Description:
    Factory Method.
    Create fabric and abstract fabric for your class.
    Create a class Student - 25 fields.
    Create a builder for the class Student.
 */

package Module2;

import java.util.Objects;

//This class contains fields and methods of Sign object
public class Sign implements IPerimeter{
    int sideA; //length of sign base side
    int sides; //number of sign base sides
    int height; //sign height

    /**
     * Default constructor without parameters
     */
    public Sign() {
    }

    /**
     * Constructor with all parameters
     * @param sideA side length that will be set to sign object
     * @param sides number of sides that will be set to sign object
     * @param height height that will be set to sign object
     */
    public Sign(int sideA, int sides, int height) {
        this.sideA = sideA;
        this.sides = sides;
        this.height = height;
    }

    /**
     * Getter for sign side length field
     * @return Returns side length of sign object
     */
    public int getSideA() {
        return sideA;
    }

    /**
     * Setter for sign side length field
     * @param sideA Sets side of sign object
     */
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    /**
     * Getter for sign sides field
     * @return Returns number of sides of sign object
     */
    public int getSides() {
        return sides;
    }

    /**
     * Setter for sign sides field
     * @param sides Sets number of sides of sign object
     */
    public void setSides(int sides) {
        this.sides = sides;
    }

    /**
     * Getter for sign height field
     * @return Returns height of sign object
     */
    public int getHeight() {
        return height;
    }

    /**
     * Setter for sign height field
     * @param height Sets height of sign object
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Method to get edge height of sign object
     * @return Returns counted edge height of sign object
     */
    public float getEdgeHeight() {
        return (float) Math.sqrt(Math.pow(this.height, 2) + Math.pow((this.sideA / (2 * Math.sin(Math.toRadians(180 / this.sides)))), 2));
    }

    /**
     * Method to get formatted sign object
     * @return Returns info about sign object
     */
    @Override
    public String toString() {
        return "\n------Sign------" +
                "\nSide length: " + sideA +
                "\nNumber of sides: " + sides +
                "\nHeight: " + height;
    }

    /**
     * Method to check whether object equals by value
     * @param o Object as parameter
     * @return Return boolean value as a result of comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sign sign = (Sign) o;
        return getSideA() == sign.getSideA() &&
                getSides() == sign.getSides() &&
                getHeight() == sign.getHeight();
    }

    /**
     * Method to get object hash
     * @return Returns sign object hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSides(), getHeight());
    }

    /**
     * Method to calculate sign base perimeter.
     * @return Returns sign base perimeter.
     */
    @Override
    public float getBasePerimeter() {
        return this.getSideA() * this.getSides();
    }

    /**
     * Method to calculate sign side perimeter.
     * @return Returns sign side perimeter.
     */
    @Override
    public float getSidePerimeter() {
        return this.getSideA() + 2 * (this.getEdgeHeight());
    }
}
