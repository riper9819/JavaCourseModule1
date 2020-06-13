/*
 * Class name: Tower
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

//This class contains fields and methods of Tower object
public class Tower implements IPerimeter {
    int sideA; //length of tower base side
    int sides; //number of tower base sides
    int height; //sign height

    /**
     * Default constructor without parameters
     */
    public Tower() {
    }

    /**
     * Constructor with all parameters
     * @param sideA side length that will be set to tower object
     * @param sides number of sides that will be set to tower object
     * @param height height that will be set to tower object
     */
    public Tower(int sideA, int sides, int height) {
        this.sideA = sideA;
        this.sides = sides;
        this.height = height;
    }

    /**
     * Getter for tower side length field
     * @return Returns side length of tower object
     */
    public int getSideA() {
        return sideA;
    }

    /**
     * Setter for towe side length field
     * @param sideA Sets side of tower object
     */
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    /**
     * Getter for tower sides field
     * @return Returns number of sides of tower object
     */
    public int getSides() {
        return sides;
    }

    /**
     * Setter for tower sides field
     * @param sides Sets number of sides of tower object
     */
    public void setSides(int sides) {
        this.sides = sides;
    }

    /**
     * Getter for tower height field
     * @return Returns height of tower object
     */
    public int getHeight() {
        return height;
    }

    /**
     * Setter for tower height field
     * @param height Sets height of tower object
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Method to get edge height of tower object
     * @return Returns counted edge height of tower object
     */
    public float getEdgeHeight() {
        return (float) Math.sqrt(Math.pow(this.height, 2) + Math.pow((this.sideA / (2 * Math.sin(Math.toRadians(180 / this.sides)))), 2));
    }

    /**
     * Method to get formatted tower object
     * @return Returns info about tower object
     */
    @Override
    public String toString() {
        return "\n------Tower------" +
                "\nSide length: " + sideA +
                "\nNumber of sides" + sides +
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
        Tower tower = (Tower) o;
        return getSideA() == tower.getSideA() &&
                getSides() == tower.getSides() &&
                getHeight() == tower.getHeight();
    }

    /**
     * Method to get object hash
     * @return Returns tower object hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSides(), getHeight());
    }

    /**
     * Method to calculate tower base perimeter.
     * @return Returns tower base perimeter.
     */
    @Override
    public float getBasePerimeter() {
        return this.getSideA() * this.getSides();
    }

    /**
     * Method to calculate tower side perimeter.
     * @return Returns tower side perimeter.
     */
    @Override
    public float getSidePerimeter() {
        return this.getSideA() + 2 * (this.getEdgeHeight());
    }
}
