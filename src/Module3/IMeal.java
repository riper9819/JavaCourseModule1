/*
 * Class name: IMeal
 *
 * @version 1.0
 *
 * 22-Jun-2020
 *
 * @author Bohdan Mandych
 *
 * Description:
    This Interface class contains Meal object methods.

    Laboratory work 2. Object-oriented programming. JavaCollectionFramework.
    Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.
    Six methods must be written like in the following example. A point for each one.

 * Subject:
    Cafe - standard lunch and ordering.
 */

package Module3;

public interface IMeal {

    /**
     * Interface method that must be implemented
     * to calculate meal cooking time.
     * @return Must return long value which is meal cooking time.
     */
    long cookingTime();

    /**
     * Interface method that must be implemented
     * to calculate meal calories amount.
     * @return Must return int value which is meal calories amount.
     */
    int caloriesCounter();

    /**
     * Interface method that must be implemented
     * to simulate meal cooking.
     */
    void cookMeal();
}
