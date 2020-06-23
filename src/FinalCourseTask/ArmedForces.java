/*
 * Class name: ArmedForces
 *
 * @version 1.0
 *
 * 23-Jun-2020
 *
 * @author Bohdan Mandych
 *
 * Description:
    ArmedForces.java is a class contains armed forces branches constructors and methods

    IMPLEMENT THE FOLLOWING INTERFACE.

    public class Company
    public interface ICompanyService
    long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies);
 */

package FinalCourseTask;

import java.util.Objects;

public class ArmedForces extends  MilitaryServiceImpl {
    private ArmedForces parent; //armed forces branch parent
    private String name; //armed forces branch name
    private long personnel; //amount of personnel in armed forces branch

    //empty constructor
    public ArmedForces(){

    }

    //default full constructor
    public ArmedForces(ArmedForces parent, String name, long personnel) {
        this.parent = parent;
        this.name = name;
        this.personnel = personnel;
    }

    /**
     * Getter for armed forces branch parent
     * @return Returns object of armed forces branch parent
     */
    public ArmedForces getParent() {
        return parent;
    }

    /**
     * Setter for armed forces branch parent
     * @param parent Sets armed forces branch parent
     */
    public void setParent(ArmedForces parent) {
        this.parent = parent;
    }

    /**
     * Getter for armed forces branch name
     * @return Returns armed forces branch name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for armed forces branch name
     * @param name Sets armed forces branch name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for personnel amount
     * @return Returns amount of personnel
     */
    public long getPersonnel() {
        return personnel;
    }

    /**
     * Setter for amount of personnel
     * @param personnel Sets amount of personnel
     */
    public void setPersonnel(long personnel) {
        this.personnel = personnel;
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
        ArmedForces that = (ArmedForces) o;
        return getPersonnel() == that.getPersonnel() &&
                Objects.equals(getParent(), that.getParent()) &&
                Objects.equals(getName(), that.getName());
    }

    /**
     * Method to get object hash
     * @return Returns armored forces branch hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getParent(), getName(), getPersonnel());
    }
}
