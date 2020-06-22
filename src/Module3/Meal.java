/*
 * Class name: Meal
 *
 * @version 1.0
 *
 * 22-Jun-2020
 *
 * @author Bohdan Mandych
 *
 * Description:
    This class contains Meal object constructor and meal methods.

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
import java.util.concurrent.TimeUnit;

public class Meal implements IMeal {
    int mealID; //meal ID number
    String name; //meal name
    float price; //meal price
    float rate; //meal rate out of 5
    int rateCount; //number of customers who rated this meal
    List<Cafe.MainDish> mainDish = new ArrayList<>(); //list that consists of main dishes taken from enum
    List<Cafe.SideDish> sideDish = new ArrayList<>(); //list that consists of side dishes taken from enum
    List<Cafe.Drinks> drinks = new ArrayList<>(); //list that consists of drinks dishes taken from enum
    List<Cafe.Dessert> desserts = new ArrayList<>(); //list that consists of desserts taken from enum

    //empty constructor
    public Meal() {
    }

    //default full constructor
    public Meal(int mealID,
                String name,
                float price,
                float rate,
                int rateCount,
                List<Cafe.MainDish> mainDish,
                List<Cafe.SideDish> sideDish,
                List<Cafe.Drinks> drinks,
                List<Cafe.Dessert> desserts) {
        this.mealID = mealID;
        this.name = name;
        this.price = price;
        this.rate = rate;
        this.rateCount = rateCount;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.drinks = drinks;
        this.desserts = desserts;
    }

    /**
     * Getter for meal ID
     * @return Returns ID number of meal
     */
    public int getMealID() {
        return mealID;
    }

    /**
     * Setter for meal ID
     * @param mealID Sets ID number of meal
     */
    public void setMealID(int mealID) {
        this.mealID = mealID;
    }

    /**
     * Getter for meal name
     * @return Returns name of meal
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for meal name
     * @param name Sets name of meal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for meal price
     * @return Returns price of meal
     */
    public float getPrice() {
        return price;
    }

    /**
     * Setter for meal name
     * @param price Sets price of meal
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Getter for meal rate
     * @return Returns rate of meal
     */
    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    /**
     * Getter for number of customers who rated meal
     * @return Returns number of customers who rated meal
     */
    public int getRateCount() {
        return rateCount;
    }

    /**
     * Setter for number of customers who rated meal
     * @param rateCount Sets number of customers who rated meal
     */
    public void setRateCount(int rateCount) {
        this.rateCount = rateCount;
    }

    /**
     * Getter for List of Main dish enum
     * @return Returns List of Main dish enum elements
     */
    public List<Cafe.MainDish> getMainDish() {
        return mainDish;
    }

    /**
     * Setter for Main dish enum
     * @param mainDish Sets new enum for Main dish list
     */
    public void setMainDish(List<Cafe.MainDish> mainDish) {
        this.mainDish = mainDish;
    }

    /**
     * Getter for List of Side dish enum
     * @return Returns List of Side dish enum elements
     */
    public List<Cafe.SideDish> getSideDish() {
        return sideDish;
    }

    /**
     * Setter for Side dish enum
     * @param sideDish new enum for Side dish list
     */
    public void setSideDish(List<Cafe.SideDish> sideDish) {
        this.sideDish = sideDish;
    }

    /**
     * Getter for List of Drinks enum
     * @return Returns List of Drinks enum elements
     */
    public List<Cafe.Drinks> getDrinks() {
        return drinks;
    }

    /**
     * Setter for Drinks  enum
     * @param drinks Sets new enum for Drinks list
     */
    public void setDrinks(List<Cafe.Drinks> drinks) {
        this.drinks = drinks;
    }

    /**
     * Getter for List of Dessert enum
     * @return Returns List of Dessert enum elements
     */
    public List<Cafe.Dessert> getDesserts() {
        return desserts;
    }

    /**
     * Setter for Dessert enum
     * @param desserts Sets new enum for Desserts list
     */
    public void setDesserts(List<Cafe.Dessert> desserts) {
        this.desserts = desserts;
    }

    /**
     * Method to count cooking time of the meal
     * @return Returns counted cooking time of the meal
     */
    public long cookingTime() {
        long time = 0;
        for (Cafe.MainDish dish: mainDish) {
            time += dish.getTime();
        }
        for (Cafe.SideDish dish: sideDish) {
            time += dish.getTime();
        }
        for (Cafe.Drinks dish: drinks) {
            time += dish.getTime();
        }
        for (Cafe.Dessert dish: desserts) {
            time += dish.getTime();
        }
        return time;
    }

    /**
     * Method to count calories of the meal
     * @return Returns counted calories of the meal
     */
    public int caloriesCounter() {
        int calories = 0;
        for (Cafe.MainDish dish: mainDish) {
            calories += dish.getCalories();
        }
        for (Cafe.SideDish dish: sideDish) {
            calories += dish.getCalories();
        }
        for (Cafe.Drinks dish: drinks) {
            calories += dish.getCalories();
        }
        for (Cafe.Dessert dish: desserts) {
            calories += dish.getCalories();
        }
        return calories;
    }

    /**
     * Method to count tip for service
     * This method simulates process of meal cooking
     */
    public void cookMeal() {
        long wait = cookingTime();
        System.out.println("Cooking \"" + this.name + "\".");
        System.out.print("Please wait for dish to be cooked: \n");
        try
        {
            for (int i = 1; i < wait; i++){
                if (i%10 == 0){
                    System.out.println();
                }
                System.out.print(i + "..");
                TimeUnit.SECONDS.sleep(1);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Interruption happened!");
        }
        System.out.println("\n" + this.name + " is cooked");
    }

    /**
     * Method to get formatted meal object
     * @return Returns info about meal object
     */
    @Override
    public String toString() {
        return "Meal{" +
                "mealID=" + mealID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rate=" + rate +
                ", rateCount=" + rateCount +
                ", mainDish=" + mainDish +
                ", sideDish=" + sideDish +
                ", drinks=" + drinks +
                ", desserts=" + desserts +
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
        Meal meal = (Meal) o;
        return getMealID() == meal.getMealID() &&
                Float.compare(meal.getPrice(), getPrice()) == 0 &&
                Float.compare(meal.getRate(), getRate()) == 0 &&
                getRateCount() == meal.getRateCount() &&
                Objects.equals(getName(), meal.getName()) &&
                Objects.equals(getMainDish(), meal.getMainDish()) &&
                Objects.equals(getSideDish(), meal.getSideDish()) &&
                Objects.equals(getDrinks(), meal.getDrinks()) &&
                Objects.equals(getDesserts(), meal.getDesserts());
    }

    /**
     * Method to get object hash
     * @return Returns meal id.
     */
    @Override
    public int hashCode() {
        return getMealID();
    }
}