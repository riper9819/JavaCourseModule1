/*
 * Class name: Customer
 *
 * @version 1.0
 *
 * 22-Jun-2020
 *
 * @author Bohdan Mandych
 *
 * Description:
    This class contains Customer object constructor and customer methods.

    Laboratory work 2. Object-oriented programming. JavaCollectionFramework.
    Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.
    Six methods must be written like in the following example. A point for each one.

 * Subject:
    Cafe - standard lunch and ordering.
 */

package Module3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer extends Meal {
    int id; //customer's ID number
    String name; //customer's name
    List<Cafe.AllFood> Allergies = new ArrayList<>(); //list that consists of allergies that have customer

    //empty constructor
    public Customer() {
    }

    //default full constructor
    public Customer(int id, String name, List<Cafe.AllFood> allergies) {
        this.id = id;
        this.name = name;
        Allergies = allergies;
    }

    /**
     * Getter for customer ID
     * @return Returns ID number of customer
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for customer ID
     * @param id Sets ID number of customer
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for customer Name
     * @return Returns Name of customer
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for customer Name
     * @param name Sets name of customer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for List of Allergies enum
     * @return Returns List of Allergies enum elements
     */
    public List<Cafe.AllFood> getAllergies() {
        return Allergies;
    }

    /**
     * Setter for customer Allergies enum
     * @param allergies Sets new enum for Allergies list
     */
    public void setAllergies(List<Cafe.AllFood> allergies) {
        Allergies = allergies;
    }

    /**
     * Method used to rate meal
     * @param point takes points that customer gives for the meal
     * @param meal takes meal object as parameter
     */
    public void rateMeal(int point, Meal meal){
        float rate = meal.getRate();
        if (rate>5 || rate<0){
            System.out.println("Incorrect rate point!");
        } else {
            int rateCount = meal.getRateCount();
            float rateNew = (((rate * rateCount) + point) / (rateCount + 1));
            meal.setRate(rateNew);
            meal.setRateCount(rateCount+1);
            System.out.println(this.name + " rated \"" + meal.getName() + "\". New rate is " + rateNew);}
    }

    /**
     * Method to count tip for service
     * @param meal takes meal object as a parameter
     * @return Returns counted amount of tip
     */
    public float tipsCount(int percent, Meal meal){
        return  (meal.getPrice() / 100) * percent;
    }

    /**
     * Method to check whether customer has allergy to any food in the meal
     * @param meal takes meal object as a parameter
     * @return Returns string of allergic food
     */
    public String checkForAllergy(Meal meal){
        boolean allergy = false;
        String allergicFood = "";
        for (Cafe.AllFood x: this.Allergies){
            for (Cafe.MainDish x1: meal.mainDish){
                if (x.toString().equals(x1.toString())){
                    allergy = true;
                    allergicFood += x1.toString() + ", ";
                }
            }
            for (Cafe.SideDish x1: meal.sideDish){
                if (x.toString().equals(x1.toString())){
                    allergy = true;
                    allergicFood += x1.toString() + ", ";
                }
            }
            for (Cafe.Drinks x1: meal.drinks){
                if (x.toString().equals(x1.toString())){
                    allergy = true;
                    allergicFood += x1.toString() + ", ";
                }
            }
            for (Cafe.Dessert x1: meal.desserts){
                if (x.toString().equals(x1.toString())){
                    allergy = true;
                    allergicFood += x1.toString() + ", ";
                }
            }
        }
        if (allergy == false){
            allergicFood = ("no meals");
        }
        return allergicFood.substring(0, allergicFood.length() - 2);
    }

    /**
     * Method to get formatted customer object
     * @return Returns info about customer object
     */
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Allergies=" + Allergies +
                '}';
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
        Customer customer = (Customer) o;
        return getId() == customer.getId() &&
                Objects.equals(getName(), customer.getName()) &&
                Objects.equals(getAllergies(), customer.getAllergies());
    }

    /**
     * Method to get object hash
     * @return Returns customer id.
     */
    @Override
    public int hashCode() {
        return getId();
    }
}
