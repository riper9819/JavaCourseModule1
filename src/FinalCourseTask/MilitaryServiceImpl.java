/*
 * Class name: MilitaryServiceImpl
 *
 * @version 1.0
 *
 * 23-Jun-2020
 *
 * @author Bohdan Mandych
 *
 * Description:
    MilitaryServiceIMP.java is a class that implements IMilitaryService interface methods.

    IMPLEMENT THE FOLLOWING INTERFACE.

    public class Company
    public interface ICompanyService
    long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies);
 */

package FinalCourseTask;

import java.util.List;

public class MilitaryServiceImpl implements IMilitaryService {
    /**
     * @param child - army for which we are searching the top level parent
     *                  (parent of parent of ...)
     * @return top level paren
     */
    @Override
    public ArmedForces getTopLevelParent(ArmedForces child) {
        ArmedForces topLevelParent = child;
        while (child.getParent() != null) {
            child = child.getParent();
            topLevelParent = child;
        }
        return topLevelParent;
    }

    /**
     *
     * @param armedForces  - army for which we are searching the count of personnel
     *                 (count of this army personnel +
     *                 count personnel of all children and their children personnel )
     * @param armedForces  - list of all available armies
     *
     * @return count of personnel
     */
    @Override
    public long getPersonnelCountForArmedForcesAndChildren(ArmedForces armedForces, List<ArmedForces> armedForcesList) {
        return  armedForces.getPersonnel() +
                armedForcesList.stream().filter(i -> (i.getParent() == armedForces))
                .mapToLong(ArmedForces::getPersonnel).sum();
    }

    /**
     * Method to get formatted armed forces branch
     * @return Returns info about armed forces branch
     */
    public static String toString(ArmedForces armedForces) {
        String parent;
        if (armedForces.getParent() != null){
            parent = armedForces.getParent().getName();
        } else parent = "Has no parent";
        if (armedForces != null)
            return "Armed forces branch " + armedForces.getName() +
                    "\nParent branch: " + parent +
                    "\nPersonnel: " + armedForces.getPersonnel() +"\n";
        return "Object is null";
    }
}
