/*
 * Class name: IMilitaryService
 *
 * @version 1.0
 *
 * 23-Jun-2020
 *
 * @author Bohdan Mandych
 *
 * Description:
    IMilitaryService.java is an interface, that contains methods for parent and personnel operations.

    IMPLEMENT THE FOLLOWING INTERFACE.

    public class Company
    public interface ICompanyService
    long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies);
 */

package FinalCourseTask;

import java.util.List;

public interface IMilitaryService {
    /**
     * @param child - army for which we are searching the top level parent
     *                  (parent of parent of ...)
     * @return top level paren
     */
    ArmedForces getTopLevelParent(ArmedForces child);

    /**
            *
            * @param armedForces  - army for which we are searching the count of personnel
     *                 (count of this army personnel +
            *                 count personnel of all children and their children personnel )
            * @param armedForces  - list of all available armies
     *
             * @return count of personnel
     */
    long getPersonnelCountForArmedForcesAndChildren(ArmedForces armedForces, List<ArmedForces> armedForcesList);
}
