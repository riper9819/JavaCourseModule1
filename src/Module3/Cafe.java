/*
 * Class name: Cafe
 *
 * @version 1.0
 *
 * 22-Jun-2020
 *
 * @author Bohdan Mandych
 *
 * Description:
    Cafe class is main class of the program

    Laboratory work 2. Object-oriented programming. JavaCollectionFramework.
    Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.
    Six methods must be written like in the following example. A point for each one.

 * Subject:
    Cafe - standard lunch and ordering.
 */

package Module3;

import java.util.List;

public class Cafe {
    public static void main(String[] args) {
        //Creating new customer objects
        Customer customer1 = new Customer(1, "Oleh", List.of(AllFood.RICE, AllFood.MILKSHAKE));
        Customer customer2 = new Customer(2, "Andrij", List.of(AllFood.CUTLET, AllFood.STAKE, AllFood.SALAD));
        Customer customer3 = new Customer(3, "Volodymyr", List.of(AllFood.EGGS, AllFood.MUSHROOMS));
        Customer customer4 = new Customer(4, "Orest", List.of(AllFood.SALAD, AllFood.FISH));
        Customer customer5 = new Customer(5, "Mykola", List.of(AllFood.MUSHROOMS, AllFood.CHEESECAKE, AllFood.MILKSHAKE));
        Meal meal1 = new Meal(1, "Complex meal-1", 23f, 4.3f, 54,
                List.of(MainDish.CHOP, MainDish.STAKE),
                List.of(SideDish.RICE),
                List.of(Drinks.JUICE, Drinks.COFFEE),
                List.of(Dessert.CAKE, Dessert.BISCUIT));

        //Creating new meal objects
        Meal meal2 = new Meal(2, "Complex meal-2", 34.5f, 4.7f, 72,
                List.of(MainDish.CHOP, MainDish.EGGS, MainDish.FISH),
                List.of(SideDish.PASTA, SideDish.MUSHROOMS, SideDish.SALAD),
                List.of(Drinks.MILKSHAKE, Drinks.TEA),
                List.of(Dessert.CHEESECAKE, Dessert.BISCUIT));
        Meal meal3 = new Meal(3, "Complex meal-3", 26.36f, 4.5f, 29,
                List.of(MainDish.STAKE),
                List.of(SideDish.SALAD, SideDish.PASTA),
                List.of(Drinks.TEA, Drinks.JUICE),
                List.of(Dessert.CHEESECAKE, Dessert.PUDDING));
        Meal meal4 = new Meal(4, "Complex meal-4", 28f, 3.8f, 38,
                List.of(MainDish.EGGS, MainDish.CUTLET),
                List.of(SideDish.MASH, SideDish.MUSHROOMS),
                List.of(Drinks.MILKSHAKE, Drinks.COFFEE),
                List.of(Dessert.PUDDING, Dessert.BISCUIT));
        Meal meal5 = new Meal(5, "Dessert meal", 18f, 4.6f, 46,
                null,
                null,
                List.of(Drinks.MILKSHAKE, Drinks.COFFEE),
                List.of(Dessert.CAKE, Dessert.BISCUIT, Dessert.CHEESECAKE));

        //Using method to count cooking time of the meal.
        System.out.println("Meal: " + meal1.getName() +
                " will be cooked in " + meal1.cookingTime() + " seconds.");
        System.out.println("Meal: " + meal2.getName() +
                " will be cooked in " + meal2.cookingTime() + " seconds.\n");

        //Using method to count calories of the meal.
        System.out.println("Meal: " + meal3.getName() +
                " contains " + meal3.caloriesCounter() + " calories.");
        System.out.println("Meal: " + meal4.getName() +
                " contains " + meal4.caloriesCounter() + " calories.\n");

        //Using method to check meal for allergic food.
        System.out.println(customer1.getName() + " has allergy for " + customer1.checkForAllergy(meal1));
        System.out.println(customer2.getName() + " has allergy for " + customer1.checkForAllergy(meal2) + "\n");

        //Using method to rate meal.
        customer3.rateMeal(4, meal3);
        customer4.rateMeal(4, meal5);
        System.out.println();

        //Using method to count tip
        System.out.println(customer3.getName() + " be polite!!! Leave " + customer4.tipsCount(8, meal4) + "$ for waiter!");
        System.out.println(customer5.getName() + " be polite!!! Leave " + customer4.tipsCount(8, meal5) + "$ for waiter!\n");

        //Using method to simulate meal cooking process.
        meal4.cookMeal();
    }

    //Declaring Main dish enum
    public enum MainDish{
        EGGS(7, 95), FISH(8, 135), STAKE(10, 190), CHOP(11, 150), CUTLET(8, 140);

        private int time; //title of enum element
        private int calories; //title of enum element

        /**
         * Setter for enum element
         * @param time Sets cooking time of enum element
         * @param calories Sets calories of enum element
         */
        MainDish(int time, int calories) {
            this.time = time;
            this.calories = calories;
        }

        /**
         * Getter for Main dish cooking time
         * @return Returns Main dish cooking time
         */
        public float getTime() {
            return time;
        }

        /**
         * Getter for Main dish calories
         * @return Returns Main dish calories
         */
        public float getCalories() {
            return calories;
        }
    }

    //Declaring Side dish enum
    public enum SideDish{
        RICE(7, 116), MASH(4, 90), PASTA(5, 131), MUSHROOMS(10, 110), SALAD(7, 75);

        private int time; //title of enum element
        private int calories; //title of enum element

        /**
         * Setter for enum element
         * @param time Sets cooking time of enum element
         * @param calories Sets calories of enum element
         */
        SideDish(int time, int calories) {
            this.time = time;
            this.calories = calories;
        }

        /**
         * Getter for Side dish cooking time
         * @return Returns Side dish cooking time
         */
        public float getTime() {
            return time;
        }

        /**
         * Getter for Side dish calories
         * @return Returns Side dish calories
         */
        public float getCalories() {
            return calories;
        }
    }

    //Declaring Drinks enum
    public enum Drinks{
        JUICE(3, 34), TEA(7, 52), MILKSHAKE(13, 54), COFFEE(9, 43);

        private int time; //title of enum element
        private int calories; //title of enum element

        /**
         * Setter for enum element
         * @param time Sets cooking time of enum element
         * @param calories Sets calories of enum element
         */
        Drinks(int time, int calories) {
            this.time = time;
            this.calories = calories;
        }

        /**
         * Getter for Drinks dish cooking time
         * @return Returns Drinks cooking time
         */
        public float getTime() {
            return time;
        }

        /**
         * Getter for Drinks calories
         * @return Returns Drinks calories
         */
        public float getCalories() {
            return calories;
        }
    }

    //Declaring Dessert enum
    public enum Dessert{
        CAKE(9, 190), BISCUIT(5, 142), CHEESECAKE(8, 129), PUDDING(6, 134);

        private int time; //title of enum element
        private int calories;

        /**
         * Setter for enum element
         * @param time Sets cooking time of enum element
         * @param calories Sets calories of enum element
         */
        Dessert(int time, int calories) {
            this.time = time;
            this.calories = calories;
        }

        /**
         * Getter for Dessert cooking time
         * @return Returns Dessert cooking time
         */
        public float getTime() {
            return time;
        }

        /**
         * Getter for Dessert calories
         * @return Returns Dessert calories
         */
        public float getCalories() {
            return calories;
        }
    }

    //Declaring All food enum
    public enum AllFood{
        EGGS, FISH, STAKE, CHOP, CUTLET, RICE, MASH, PASTA, MUSHROOMS, SALAD,
        JUICE, TEA, MILKSHAKE, COFFEE, CAKE, BISCUIT, CHEESECAKE, PUDDING;
    }
}