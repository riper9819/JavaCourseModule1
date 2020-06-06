package Module2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/************************************
***   Created by Bohdan Mandych   ***
************************************/

//Child class for Pyramid.java (Pyramid <- Tent)
//This class represent objects of class Tent in general
public class Tent extends Pyramid{
    public String material;
    public String color;
    public float price;
    public LocalDate purchaseData;
    public boolean mosquitoNet;
    public float mosquitoNetPriceBase;
    public int sleepPlaces;
    public int windows;
    public String rodMaterial;
    public float rodPriceBase;

    //Default empty constructor
    public Tent() {
    }

    //Full constructor
    public Tent(String material, String color, float price, LocalDate purchaseData, boolean mosquitoNet, float mosquitoNetPriceBase, int sleepPlaces, int windows, String rodMaterial, float rodPriceBase) {
        this.material = material;
        this.color = color;
        this.price = price;
        this.purchaseData = purchaseData;
        this.mosquitoNet = mosquitoNet;
        this.mosquitoNetPriceBase = mosquitoNetPriceBase;
        this.sleepPlaces = sleepPlaces;
        this.windows = windows;
        this.rodMaterial = rodMaterial;
        this.rodPriceBase = rodPriceBase;
    }

    //Full constructor extended with Pyramid class
    public Tent(float sideA, int sides, float height, String material, String color, float price, LocalDate purchaseData, boolean mosquitoNet, float mosquitoNetPriceBase, int sleepPlaces, int windows, String rodMaterial, float rodPriceBase) {
        super(sideA, sides, height);
        this.material = material;
        this.color = color;
        this.price = price;
        this.purchaseData = purchaseData;
        this.mosquitoNet = mosquitoNet;
        this.mosquitoNetPriceBase = mosquitoNetPriceBase;
        this.sleepPlaces = sleepPlaces;
        this.windows = windows;
        this.rodMaterial = rodMaterial;
        this.rodPriceBase = rodPriceBase;
    }

    //Counting mosquito net price by multiplying tent side area by net price
    public float getNetPrice() {
        return super.getSideArea() * this.mosquitoNetPriceBase;
    }

    //Counting rod price by multiplying doubled tent lateral edge length by the number of rods needed and then again by rod price
    public float getRodPrice() {
        return ((super.getEdgeHeight() * 2) * super.getSides()) * this.rodPriceBase;
    }

    //Counting available place area per one person by dividing tent base area by available sleep places
    public float getPlacePerPerson() {
        return super.getBaseArea() / this.sleepPlaces;
    }

    //Creating getters and setter for all tent parameters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getPurchaseData() {
        return purchaseData;
    }

    public void setPurchaseData(LocalDate purchaseData) {
        this.purchaseData = purchaseData;
    }

    public boolean isMosquitoNet() {
        return mosquitoNet;
    }

    public void setMosquitoNet(boolean mosquitoNet) {
        this.mosquitoNet = mosquitoNet;
    }

    public float getMosquitoNetPriceBase() {
        return mosquitoNetPriceBase;
    }

    public void setMosquitoNetPrice(float mosquitoNetPriceBase) {
        this.mosquitoNetPriceBase = mosquitoNetPriceBase;
    }

    public int getSleepPlaces() {
        return sleepPlaces;
    }

    public void setSleepPlaces(int sleepPlaces) {
        this.sleepPlaces = sleepPlaces;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getRodMaterial() {
        return rodMaterial;
    }

    public void setRodMaterial(String rodMaterial) {
        this.rodMaterial = rodMaterial;
    }

    public float getRodPriceBase() {
        return rodPriceBase;
    }

    public void setRodPriceBase(float rodPriceBase) {
        this.rodPriceBase = rodPriceBase;
    }

    @Override
    public String toString() {
        return  "\n\n-----Tent characteristics-----" +
                "\n\nMaterial: " + this.material +
                "\nColor: " + this.color +
                "\nPrice: " + this.price + " $" +
                "\nSize width x height: " + super.getSideA() + " x " + super.getHeight() +
                "\nPurchase data: " + this.purchaseData.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) +
                "\nMosquito net: " + (this.mosquitoNet ? "Included" : "Not included") +
                "\nMosquito net price per m2: " + this.mosquitoNetPriceBase + " $" +
                "\nSleep places: " + this.sleepPlaces +
                "\nWindows: " + this.windows +
                "\nRod material: " + this.rodMaterial +
                "\nRod price base per m2: " + this.rodPriceBase + " $" +
                "\nCounted rod price: " + String.format("%.2f", getRodPrice()) + " $" +
                "\nCounted net price: " + String.format("%.2f", getNetPrice()) + " $" +
                "\nPlace per one person avaliable: " + getPlacePerPerson() + " m2";
    }
}
