/*
 * Class name: PyramidAbstractFactory
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

import java.time.LocalDate;

//This class contains abstract factory method for object creation
public class PyramidAbstractFactory {
    /**
     * Abstract factory method to create object based on received parameters
     * @param sideA side length that will be set to object
     * @param sides number of sides that will be set to object
     * @param height height that will be set to object
     * @return Returns object if received parameters were correct or null when not.
     */
    public static IPerimeter create(int sideA, int sides, int height, Main.Model model){
        switch(model){
            //Returns Tent object if received enum equals TENT
            case TENT: return new Tent(1, "Polyester", "Olive", 300.75f, LocalDate.of(2020, 05, 24), true, 1.2f, 3, 2, "Aluminium", 1.25f);
            //Returns Tower object if received enum equals TOWER
            case TOWER: return new Tower(sideA, sides, height);
            //Returns Sign object if received enum equals SIGN
            case SIGN: return  new Sign(sideA,sides, height);
            //Returns default null if received parameters are incorrect
            default: return null;
        }
    }
}
