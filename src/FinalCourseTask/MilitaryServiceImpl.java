package FinalCourseTask;

import java.util.List;

public class MilitaryServiceImpl implements IMilitaryService {
    @Override
    public ArmedForces getTopLevelParent(ArmedForces child) {
        ArmedForces topLevelParent = child;
        while (child.getParent() != null) {
            child = child.getParent();
            topLevelParent = child;
        }
        return topLevelParent;
    }

    @Override
    public long getPersonnelCountForArmedForcesAndChildren(ArmedForces armedForces, List<ArmedForces> armedForcesList) {
        return  armedForces.getPersonnel() +
                armedForcesList
                        .stream()
                        .mapToLong(ArmedForces::getPersonnel)
                        .sum();
    }

    public String toString(ArmedForces armedForces) {
        if (armedForces != null)
            return "Armed forces branch " + armedForces.getName() +
                    "\nParent branch: " + armedForces.getParent() +
                    "\nPersonnel: " + armedForces.getPersonnel() +"\n";
        return "Object is null";
    }
}
