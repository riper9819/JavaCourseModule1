/*
 * Class name: PyramidFactory
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

//This class contains factory method for object creation
public class PyramidFactory {
    /**
     * Factory method to create object only when all parameters satisfy condition
     * @param sideA side length that will be set to pyramid object
     * @param sides number of sides that will be set to pyramid object
     * @param height height that will be set to pyramid object
     * @return Returns object if received parameters were correct or Exception when not.
     */
    public static Pyramid create(float sideA, int sides, float height){
        //When input parameters are bigger then 0 return new Pyramid object, else return Exception
        if(sideA > 0 & sides > 0 & height > 0 ){
            return new Pyramid(sideA, sides, height);
        }else throw new IllegalArgumentException("You put wrong arguments");
    }
}
