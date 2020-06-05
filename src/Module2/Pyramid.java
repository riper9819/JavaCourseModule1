package Module2;

import java.util.Objects;

public class Pyramid {

    private int id;
    private float sideA;
    private int sides;
    private float height;

    public Pyramid() {
    }

    public Pyramid(int id, float sideA, int sides, float height) {
        this.id = id;
        this.sideA = sideA;
        this.sides = sides;
        this.height = height;
    }

    public Pyramid(float sideA, int sides, float height) {
        this.sideA = sideA;
        this.sides = sides;
        this.height = height;
    }

    public float getSideArea() {
        return (float)
                ((this.sides * this.sideA / 2) *
                        Math.sqrt(Math.pow(this.height, 2) +
                                Math.pow((this.sideA / (2 * Math.tan(Math.toRadians(180 / this.sides)))), 2)));
    }

    public float getEdgeHeight() {
        return (float) Math.sqrt(Math.pow(this.height, 2) + Math.pow((this.sideA / (2 * Math.sin(Math.toRadians(180 / this.sides)))), 2));
    }

    public float getApothem() {
        return (float) Math.sqrt(Math.pow(this.height, 2) + Math.pow((this.sideA / (2 * Math.tan(Math.toRadians(180 / this.sides)))), 2));
    }

    public float getSurfaceArea() {
        return this.getSideArea() + this.getBaseArea();
    }

    public float getBaseArea() {
        return (float) ((this.sides * Math.pow(this.sideA, 2)) / (4 * (Math.tan(Math.toRadians(360 / (2 * this.sides))))));
    }

    public float getVolume() {
        return (float) ((this.height * this.sides * Math.pow(this.sideA, 2)) / (12 * Math.tan(Math.toRadians(180 / this.sides))));
    }



    public float getInnerRadius() {
        return (float) (this.sideA / (2 * Math.tan(Math.toRadians((180 / this.sides)))));
    }

    public float getOuterRadius() {
        return (float) (this.sideA / (2 * Math.sin(Math.toRadians((180 / this.sides)))));
    }

    public float getEdgeAngle() {
        return (float) Math.toDegrees(Math.atan(this.height / this.getOuterRadius()));
    }

    public float getSlantAngle() {
        return (float) Math.toDegrees(Math.atan(this.height / this.getInnerRadius()));
    }

    public float getBaseAngleOfFace() {
        return (180 * ((this.sides - 2f) / this.sides));
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pyramid pyramid = (Pyramid) o;
        return Float.compare(pyramid.getSideA(), getSideA()) == 0 &&
                getSides() == pyramid.getSides() &&
                Float.compare(pyramid.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}