package FinalCourseTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Army {
    public static void main(String[] args) {

        List<ArmedForces> armedForces = new ArrayList<>();
        ArmedForces ukraine = new ArmedForces (null, "Ukraine Armed forces", 255000);
        ArmedForces russia = new ArmedForces (null, "Russia Armed forces", 900000);
        ArmedForces georgia = new ArmedForces (null, "Georgia Armed forces", 37000);
        armedForces.addAll(Arrays.asList(ukraine, russia, georgia));

        ArmedForces ukraineSupport = new ArmedForces(ukraine, "Ukraine Support forces", 35000);
        ArmedForces russiaSupport = new ArmedForces(russia, "Russia Support forces", 85000);
        ArmedForces georgiaSupport = new ArmedForces(georgia, "Georgia Support forces", 1500);
        armedForces.addAll(Arrays.asList(ukraineSupport, russiaSupport, georgiaSupport));

        ArmedForces ukraineNavy = new ArmedForces (ukraineSupport, "Ukraine Navy", 6500);
        ArmedForces russiaNavy = new ArmedForces (russiaSupport, "Russia Navy", 148000);
        ArmedForces georgiaNavy = new ArmedForces (georgiaSupport, "Georgia Navy", 1000);
        armedForces.addAll(Arrays.asList(ukraineNavy, russiaNavy, georgiaNavy));


        ArmedForces ukraineAirForce = new ArmedForces (ukraineSupport, "Ukraine Air force", 45000);
        ArmedForces russiaAirForce = new ArmedForces (russiaSupport, "Russia Air force", 430000);
        ArmedForces georgiaAirForce = new ArmedForces (georgiaSupport, "Georgia Air force", 2980);
        armedForces.addAll(Arrays.asList(ukraineAirForce, russiaAirForce, georgiaAirForce));

        ArmedForces ukraineMarine = new ArmedForces (ukraineNavy, "Ukraine Marine infantry", 1500);
        ArmedForces russiaMarine = new ArmedForces (russiaNavy, "Russia Marine infantry", 35000);
        ArmedForces georgiaMarine = new ArmedForces (georgiaNavy, "Georgia Marine infantry", 300);
        armedForces.addAll(Arrays.asList(ukraineMarine, russiaMarine, georgiaMarine));

        ArmedForces ukraineAirborne = new ArmedForces (ukraineAirForce, "Ukraine Airborne infantry", 2200);
        ArmedForces russiaAirborne = new ArmedForces (russiaAirForce, "Russia Marine infantry", 72000);
        ArmedForces georgiaAirborne = new ArmedForces (georgiaAirForce, "Georgia Marine infantry", 210);
        armedForces.addAll(Arrays.asList(ukraineAirborne, russiaAirborne, georgiaAirborne));

        ArmedForces ukraineGuard = new ArmedForces (null, "Ukraine National guard", 46000);
        ArmedForces russiaGuard = new ArmedForces (null, "Russia National guard", 34000);
        ArmedForces georgiaGuard = new ArmedForces (null, "Georgia National guard", 750);
        armedForces.addAll(Arrays.asList(ukraineGuard, russiaGuard, georgiaGuard));

        ArmedForces ukraineAirDefence = new ArmedForces(ukraineSupport, "Ukraine Air defence", 2500);
        ArmedForces russiaAirDefence = new ArmedForces(russiaSupport, "Russia Air defence", 60000);
        ArmedForces georgiaAirDefence = new ArmedForces(georgiaSupport, "Georgia Air defence", 320);
        armedForces.addAll(Arrays.asList(ukraineAirDefence, russiaAirDefence, georgiaAirDefence));

        List<ArmedForces> Navy = new ArrayList<>(Arrays.asList(ukraineNavy, russiaNavy, georgiaNavy));
        List<ArmedForces> SupportForce = new ArrayList<>(Arrays.asList(ukraineSupport, russiaSupport, georgiaSupport));
        List<ArmedForces> AirForce = new ArrayList<>(Arrays.asList(ukraineAirForce, russiaAirForce, georgiaAirForce));
        List<ArmedForces> Marine = new ArrayList<>(Arrays.asList(ukraineMarine, russiaMarine, georgiaMarine));
        List<ArmedForces> AirBorne = new ArrayList<>(Arrays.asList(ukraineAirborne, russiaAirborne, georgiaAirborne));
        List<ArmedForces> NationalGuard = new ArrayList<>(Arrays.asList(ukraineGuard, russiaGuard, georgiaGuard));
        List<ArmedForces> AirDefence = new ArrayList<>(Arrays.asList(ukraineAirDefence, russiaAirDefence, georgiaAirDefence));

        //MilitaryServiceImpl.getTopLevelParent(ukraineMarine));

        //System.out.println(
        //       "Employee count for lawyer company and its children = " +
        //               MilitaryServiceImpl.getPersonnelCountForArmedForcesAndChildren(
        //                       ukraineNavy, Navy));
        System.out.println(ukraineNavy.toString());
    }
}
