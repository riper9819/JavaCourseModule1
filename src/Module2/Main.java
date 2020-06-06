package Module2;

import java.time.LocalDate;


/************************************
***   Created by Bohdan Mandych   ***
************************************/

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
    }
}