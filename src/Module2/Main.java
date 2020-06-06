package Module2;

/************************************
 ***   Created by Bohdan Mandych   ***
 ************************************/

public class Main {
    public static void  main (String[] args){

        //Creating new object of class Pyramid
        Pyramid pyramid = new Pyramid();

        //Setting parameter values
        pyramid.setSideA(4.5f);
        pyramid.setSides(6);
        pyramid.setHeight(16);

        //Printing the results of calculations
        System.out.println(pyramid);
    }
}