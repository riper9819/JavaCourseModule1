/*
 * Class name: Army
 *
 * @version 1.0
 *
 * 23-Jun-2020
 *
 * @author Bohdan Mandych
 *
 * Description:
    Army.java is a main class of task.

    IMPLEMENT THE FOLLOWING INTERFACE.

    public class Company
    public interface ICompanyService
    long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies);
 */

package FinalCourseTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Army {
    public static void main(String[] args) {

        //Declaring military service variable
        MilitaryServiceImpl militaryService = new MilitaryServiceImpl();

        //Declaring list of armed forces branches
        List<ArmedForces> armedForces = new ArrayList<>();

        //Declaring and initializing armed forces objects
        ArmedForces ukraine = new ArmedForces (null, "Ukraine Armed forces", 255000);
        ArmedForces russia = new ArmedForces (null, "Russia Armed forces", 900000);
        ArmedForces georgia = new ArmedForces (null, "Georgia Armed forces", 37000);
        armedForces.addAll(Arrays.asList(ukraine, russia, georgia));

        //Declaring and initializing support forces objects
        ArmedForces ukraineSupport = new ArmedForces(ukraine, "Ukraine Support forces", 35000);
        ArmedForces russiaSupport = new ArmedForces(russia, "Russia Support forces", 85000);
        ArmedForces georgiaSupport = new ArmedForces(georgia, "Georgia Support forces", 1500);
        armedForces.addAll(Arrays.asList(ukraineSupport, russiaSupport, georgiaSupport));

        //Declaring and initializing navy objects
        ArmedForces ukraineNavy = new ArmedForces (ukraineSupport, "Ukraine Navy", 6500);
        ArmedForces russiaNavy = new ArmedForces (russiaSupport, "Russia Navy", 148000);
        ArmedForces georgiaNavy = new ArmedForces (georgiaSupport, "Georgia Navy", 1000);
        armedForces.addAll(Arrays.asList(ukraineNavy, russiaNavy, georgiaNavy));

        //Declaring and initializing air forces objects
        ArmedForces ukraineAirForce = new ArmedForces (ukraineSupport, "Ukraine Air force", 45000);
        ArmedForces russiaAirForce = new ArmedForces (russiaSupport, "Russia Air force", 430000);
        ArmedForces georgiaAirForce = new ArmedForces (georgiaSupport, "Georgia Air force", 2980);
        armedForces.addAll(Arrays.asList(ukraineAirForce, russiaAirForce, georgiaAirForce));

        //Declaring and initializing marine objects
        ArmedForces ukraineMarine = new ArmedForces (ukraineNavy, "Ukraine Marine infantry", 1500);
        ArmedForces russiaMarine = new ArmedForces (russiaNavy, "Russia Marine infantry", 35000);
        ArmedForces georgiaMarine = new ArmedForces (georgiaNavy, "Georgia Marine infantry", 300);
        armedForces.addAll(Arrays.asList(ukraineMarine, russiaMarine, georgiaMarine));

        //Declaring and initializing airborne objects
        ArmedForces ukraineAirborne = new ArmedForces (ukraineAirForce, "Ukraine Airborne infantry", 2200);
        ArmedForces russiaAirborne = new ArmedForces (russiaAirForce, "Russia Marine infantry", 72000);
        ArmedForces georgiaAirborne = new ArmedForces (georgiaAirForce, "Georgia Marine infantry", 210);
        armedForces.addAll(Arrays.asList(ukraineAirborne, russiaAirborne, georgiaAirborne));

        //Declaring and initializing national guard objects
        ArmedForces ukraineGuard = new ArmedForces (null, "Ukraine National guard", 46000);
        ArmedForces russiaGuard = new ArmedForces (null, "Russia National guard", 34000);
        ArmedForces georgiaGuard = new ArmedForces (null, "Georgia National guard", 750);
        armedForces.addAll(Arrays.asList(ukraineGuard, russiaGuard, georgiaGuard));

        //Declaring and initializing air defence objects
        ArmedForces ukraineAirDefence = new ArmedForces(ukraine, "Ukraine Air defence", 2500);
        ArmedForces russiaAirDefence = new ArmedForces(russia, "Russia Air defence", 60000);
        ArmedForces georgiaAirDefence = new ArmedForces(georgia, "Georgia Air defence", 320);
        armedForces.addAll(Arrays.asList(ukraineAirDefence, russiaAirDefence, georgiaAirDefence));

        //Using method to count all branch and it's children personnel
        System.out.println("---------Counting all branch and it's children personnel---------");
        System.out.println("Armed forces branch " + russia.getName() +
                " and it's children have " +
                militaryService.getPersonnelCountForArmedForcesAndChildren(russiaAirForce, armedForces) +
                " personnel");
        System.out.println("Armed forces branch " + ukraineNavy.getName() +
                " and it's children have " +
                militaryService.getPersonnelCountForArmedForcesAndChildren(ukraineNavy, armedForces) +
                " personnel");
        System.out.println("Armed forces branch " + georgiaSupport.getName() +
                " and it's parents have " +
                militaryService.getPersonnelCountForArmedForcesAndChildren(georgiaSupport, armedForces) +
                " personnel");

        //Using method to find base parent
        System.out.println("---------Finding base parent---------");
        System.out.println("Armed forces branch " + georgiaMarine.getName() + " has base parent " +
                militaryService.getTopLevelParent(georgiaMarine).getName());
        System.out.println("Armed forces branch " + russiaAirborne.getName() + " has base parent " +
                militaryService.getTopLevelParent(russiaAirborne).getName());
        System.out.println("Armed forces branch " + ukraineNavy.getName() + " has base parent " +
                militaryService.getTopLevelParent(ukraineNavy).getName());

        //Using method to print armed forces branch information
        System.out.println("---------Printing armed forces branch information---------");
        System.out.println(MilitaryServiceImpl.toString(ukraine));
    }
}
