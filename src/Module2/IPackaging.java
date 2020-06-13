/*
 * Class name: IPackaging
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

public interface IPackaging {

    /**
     * Interface method that must be implemented
     * to output object in string format.
     * @return Must return string object representation.
     */
    String toString();

    /**
     * Interface method that must be implemented
     * to output object in string JSON format.
     * @return Must return string JSON object representation.
     */
    String toJSON();

    /**
     * Interface method that must be implemented
     * to output object in XML format.
     * @return Must return XML object representation.
     */
    String toXML();

    /**
     * Interface method that must be implemented
     * to output object fields in handsome way.
     * @return Must return string object representation.
     */
    void toConsole();
}
