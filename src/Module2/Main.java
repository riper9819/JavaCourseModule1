/*
 * Class name: Main
 *
 * Version info 1.0
 *
 * 11-Jun-2020
 *
 * Copyright (c) Bohdan Mandych
 *
 * Description:
    Main class for all module tasks
 */

package Module2;

import java.time.LocalDate;

public class Main {
    public static void  main (String[] args){

        //______________________________Task 1. Java class creation______________________________
        //Creating new object of class Pyramid
        Pyramid pyramid = new Pyramid();

        //Setting parameter values
        pyramid.setSideA(4.5f);
        pyramid.setSides(6);
        pyramid.setHeight(16);

        //Printing the results of calculations
        System.out.println(pyramid);

        //______________________________Task 2. Inheritance______________________________
        System.out.println("\n\n****************   Inheritance task   ****************");

        //Creating new object of class Tent
        Tent tent = new Tent(1, "Polyester", "Olive", 300.75f, LocalDate.of(2020, 05, 24), true, 1.2f, 3, 2, "Aluminium", 1.25f);

        //Setting parameter values for tent
        tent.setSideA(3);
        tent.setSides(4);
        tent.setHeight(1.5f);

        //Printing the results of calculations
        System.out.println(tent);

        //Creating new object of class Tent
        OutdoorEquipmentTent OutdoorTent = new OutdoorEquipmentTent("Outdoor camping", "Mandiga Arona", 18, true);

        //Setting parameter values for Outdoor Equipment tent
        OutdoorTent.setId(1);
        OutdoorTent.setPurchaseData(LocalDate.of(2020, 05, 24));
        OutdoorTent.setColor("Olive");
        OutdoorTent.setMaterial(" Polyester");
        OutdoorTent.setPrice(300.75f);
        OutdoorTent.setSideA(3);
        OutdoorTent.setSides(4);
        OutdoorTent.setHeight(1.5f);

        //Printing the results of calculations
        System.out.println(OutdoorTent);

        //______________________________Task 3. Polymorphism______________________________

        //Calling interface methods
        System.out.println("\nBase perimeter = " + pyramid.getBasePerimeter()+ "\n");
        System.out.println("Side perimeter = " + pyramid.getSidePerimeter()+ "\n");
        //Interface toString method is already called above in Task 1 section
        System.out.println(pyramid.toJSON() + "\n");
        System.out.println(pyramid.toXML() + "\n");
        pyramid.toConsole();

        //______________________________Task 4. Factory method_____________________________

        //Creating new pyramid object with factory method
        Pyramid pyramidNew = PyramidFactory.create(6, 6, 12);
        System.out.println(pyramidNew);

        //Creating new model object with abstract factory method
        IPerimeter model = PyramidAbstractFactory.create(12, 34, 5, Model.SIGN);
        System.out.println(model);

        //Creating new student object with builder method
        Student andrijSternyk = new Student.Builder()
                .setId(1)
                .setFirstName("Andrij")
                .setLastName("Sternyk")
                .setPatronymic("Vitalijovych")
                .setGender(Gender.MALE)
                .setBirthday(LocalDate.of(1999, 06, 12))
                .setMaritalStatus(false)
                .setNationality("Ukrainian")
                .setCountry("Ukraine")
                .setCity("Lviv")
                .setStreet("Zelena")
                .setHouse("123/34")
                .setZipcode(79056)
                .setPhone("+380976435891")
                .setEmail("asternyk@gmail.com")
                .setCourse(Course.BACHELOR)
                .setInstitute(Institute.COMPUTER)
                .setChair(Chair.INFSYSTEMS)
                .setStartedStudy(LocalDate.of(2018, 9, 01))
                .setFullTimeStudy(true)
                .setCommercialStudy(false)
                .setScholarship(1430f)
                .setMark(83.7f)
                .setMilitaryDepartment(true)
                .setDormitory(false)
                .setEducation("School №3")
                .build();
        //Print Andrij Sternyk student survey
        System.out.println(andrijSternyk);

        //Creating new student object based on already existing object with builder method
        Student tarasYurchyn = new Student.Builder()
                .setSimilarTo(andrijSternyk)
                .setId(2)
                .setFirstName("Taras")
                .setLastName("Yurchyn")
                .setPatronymic("Romanovych")
                .setBirthday(LocalDate.of(1997, 3, 25))
                .setStreet("Topol'na")
                .setHouse("108a/13")
                .setZipcode(79032)
                .setPhone("+380639454891")
                .setEmail("yurchyn97@gmail.com")
                .setCourse(Course.MASTER)
                .setInstitute(Institute.ECONOMY)
                .setChair(Chair.FINANCE)
                .setStartedStudy(LocalDate.of(2019, 9, 01))
                .setCommercialStudy(true)
                .setScholarship(1635f)
                .setMark(88.7f)
                .setEducation("Uzhhorod national university")
                .build();
        //Print Taras Yurchyn student survey
        System.out.println(tarasYurchyn);
    }

    //___________________________________Enum declarations___________________________________

    //Declaring model enum
    public enum Model{
        TENT, SIGN, TOWER
    }

    //Declaring gender enum
    public enum Gender{
        MALE, FEMALE
    }

    //Declaring course enum
    public enum Course{
        MASTER, BACHELOR, POSTGRADUATE;
    }

    //Declaring institute enum
    public enum Institute{
        COMPUTER ("Institute of Computer Science and Information Technology"),
        ECONOMY ("Institute of Economics and Management"),
        ARCHITECTURE ("Institute of Architecture and Design"),
        TRANSPORT ("Institute of Engineering Mechanics and Transport"),
        LAW ("Institute of Law, Psychology and Innovative Education"),
        CHEMISTRY ("Institute of Chemistry and Chemical Technology");
        private String title; //title of enum element

        /**
         * Setter for enum element
         * @param title Sets title of enum element
         */
        Institute(String title) {
            this.title = title;
        }

        /**
         * Method to get formatted enum title
         * @return Returns title of enum element
         */
        @Override
        public String toString() {
            return title;
        }
    }

    //Declaring chair enum
    public enum Chair{
        SOFTWARE("Department of Software"),
        INFSYSTEMS("Department of Information Systems and Networks"),
        MANAGEMENT("Department of Organizational Management"),
        FINANCE("Department of Finance"),
        RESTORATION("Department of Architecture and Restoration"),
        DESIGN("Department of Design and Fundamentals of Architecture"),
        CARS("Department of Car Engineering"),
        TRANSPORTTECH("Department of Transport Technologies"),
        ADMINLAW ("Department of Administrative and Information "),
        PSYCHOLOGY ("Department of Theoretical and Practical Psychology"),
        ORGANIC ("Department of Organic Chemistry"),
        PLASTICRECYCLING ("Institute of Engineering Mechanics and Transport");
        private String title; //title of enum element

        /**
         * Setter for enum element
         * @param title Sets title of enum element
         */
        Chair(String title) {
            this.title = title;
        }

        /**
         * Method to get formatted enum title
         * @return Returns title of enum element
         */
        @Override
        public String toString() {
            return title;
        }
    }
}