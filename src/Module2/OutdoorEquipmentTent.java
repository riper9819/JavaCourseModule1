package Module2;

import java.time.LocalDate;
import java.util.Objects;

/************************************
***   Created by Bohdan Mandych   ***
************************************/

//Child class for Tent.java (Pyramid <- Tent <- OutdoorEquipmentTent)
//This class represent objects of class Tent, that were sold exclusively by Outdoor Equipment company
public class OutdoorEquipmentTent extends Tent {
    public String usage;
    public String model;
    public int Warranty; //warranty in months
    public boolean Delivery;

    //Default empty constructor
    public OutdoorEquipmentTent(){
    }

    //Full constructor
    public OutdoorEquipmentTent(String usage, String model, int warranty, boolean delivery) {
        this.usage = usage;
        this.model = model;
        this.Warranty = warranty;
        Delivery = delivery;
    }

    //Full constructor extended with Tent class
    public OutdoorEquipmentTent(int id, String material, String color, float price, LocalDate purchaseData, boolean mosquitoNet, float mosquitoNetPriceBase, int sleepPlaces, int windows, String rodMaterial, float rodPriceBase, String usage, String model, int warranty, boolean delivery) {
        super(id, material, color, price, purchaseData, mosquitoNet, mosquitoNetPriceBase, sleepPlaces, windows, rodMaterial, rodPriceBase);
        this.usage = usage;
        this.model = model;
        this.Warranty = warranty;
        Delivery = delivery;
    }

    //Full constructor extended with Pyramid class
    public OutdoorEquipmentTent(float sideA, int sides, float height, int id, String material, String color, float price, LocalDate purchaseData, boolean mosquitoNet, float mosquitoNetPriceBase, int sleepPlaces, int windows, String rodMaterial, float rodPriceBase, String usage, String model, int warranty, boolean delivery) {
        super(sideA, sides, height, id, material, color, price, purchaseData, mosquitoNet, mosquitoNetPriceBase, sleepPlaces, windows, rodMaterial, rodPriceBase);
        this.usage = usage;
        this.model = model;
        this.Warranty = warranty;
        Delivery = delivery;
    }

    //Creating getters and setter for all tent parameters
    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWarranty() {
        return Warranty;
    }

    public void setWarranty(int warranty) {
        Warranty = warranty;
    }

    public boolean isDelivery() {
        return Delivery;
    }

    public void setDelivery(boolean delivery) {
        Delivery = delivery;
    }

    //Creating toString method
    @Override
    public String toString() {
        return "\n\n-----Outdoor Equipment Tent-----" +
                "\n\nProduct ID: " + super.id +
                "\nModel: " + this.model +
                "\nPurchase Data: " + super.purchaseData +
                "\nWarranty till: " + super.getPurchaseData().plusMonths(this.Warranty) +
                "\nDelivery: " + (this.Delivery ? "Included" : "Not included") +
                "\nUsage: " + this.usage +
                "\nMaterial: " + super.material +
                "\nColor: " + super.color +
                "\nSize width x height: " + super.getSideA() + " x " + super.getHeight() +
                "\nPrice: " + super.price;
    }
}
