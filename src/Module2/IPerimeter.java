/*
 * Class name: IPerimeter
 *
 * Version info 1.0
 *
 * 11-Jun-2020
 *
 * Copyright (c) Bohdan Mandych
 *
 * Description:
    Polymorphism.
    Create and implement two interfaces for your class.
 */

package Module2;

public interface IPerimeter {

    /**
     * Interface method that must be implemented
     * to calculate figure base perimeter.
     * @return Must return double value which is figure base perimeter.
     */
    float getBasePerimeter();

    /**
     * Interface method that must be implemented
     * to calculate figure side perimeter.
     * @return Must return double value which is figure side perimeter.
     */
    float getSidePerimeter();
}
