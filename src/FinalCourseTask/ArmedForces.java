package FinalCourseTask;

public class ArmedForces extends  MilitaryServiceImpl {
    private ArmedForces parent;
    private String name;
    private long personnel;

    public ArmedForces(){

    }

    public ArmedForces(ArmedForces parent, String name, long personnel) {
        this.parent = parent;
        this.name = name;
        this.personnel = personnel;
    }

    public ArmedForces getParent() {
        return parent;
    }

    public void setParent(ArmedForces parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

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
     * Method to get formatted meal object
     * @return Returns info about meal object
     */
    @Override
    public String toString() {
        return "Armed forces: " + this.name +
                "\nParent branch: " + this.parent +
                "\nPersonnel: " + this.personnel +"\n";
    }
}
