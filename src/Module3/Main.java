/*
 * Class name: Main
 *
 * @version 1.0
 *
 * 21-Jun-2020
 *
 * @author Bohdan Mandych
 *
 * Description:
    JavaCollectionsFramework. List.
    1. Create ArrayList and LinkedList containing  100 000 Integer elements. Compare time intervals.
    2. Insert new 1000 elements  on the  beginning, on  the middle  and on the end of ones. Compare time intervals.
    3. Update 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
    4. Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
 */

package Module3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Main class for all module tasks
public class Main {
    public static void main(String[] args) {
        //------------------------Creating Array and Linked List------------------------
        System.out.println("1. Creating Array and Linked List");
        List <Integer> integersArray = new ArrayList<>(); //creating empty ArrayList
        List <Integer> integersLinked = new LinkedList<>(); //creating empty LinkedList
        int arrayPoints = 0; //point counter for ArrayList time interval wins
        int linkedPoints = 0; //point counter for ArrayList time interval wins
        String result = "LinkedList is faster"; //this string used in if condition of time interval comparison

        float resultArray = fillArray(integersArray); //filling ArrayList with elements
        System.out.println("For ArrayList that took " + resultArray + " seconds");
        float resultLinked = fillArray(integersLinked); //filling LinkedList with elements
        System.out.println("For LinkedList that took " + resultLinked + " seconds");

        //comparing time interval results for ArrayList and LinkedList
        float compare =  resultArray - resultLinked;
        //adding points for a winner and showing results
        if (compare<0){
            result = "ArrayList is faster";
            arrayPoints++;
        } else linkedPoints++;
        System.out.println(result);

        //-------------------Inserting on the beginning of Array and Linked List-------------------
        System.out.println("\n2.1. Inserting on the beginning of Array and Linked List");
        resultArray = insertOnBeginning(integersArray);//inserting elements on the beginning of ArrayList
        System.out.println("For ArrayList that took " + resultArray + " seconds");
        resultLinked = insertOnBeginning(integersLinked);//inserting elements on the beginning of LinkedList
        System.out.println("For LinkedList that took " + resultLinked + " seconds");

        //comparing time interval results for ArrayList and LinkedList
        compare =  resultArray - resultLinked;
        //adding points for a winner and showing results
        if (compare<0){
            result = "ArrayList is faster";
            arrayPoints++;
        } else linkedPoints++;
        System.out.println(result);

        //-------------------Inserting on the middle of Array and Linked List-------------------
        System.out.println("\n2.2. Inserting on the middle of Array and Linked List");
        resultArray = insertOnMiddle(integersArray); //inserting elements on the middle of ArrayList
        System.out.println("For ArrayList that took " + resultArray + " seconds");
        resultLinked = insertOnMiddle(integersLinked); //inserting elements on the middle of LinkedList
        System.out.println("For LinkedList that took " + resultLinked + " seconds");

        //comparing time interval results for ArrayList and LinkedList
        compare =  resultArray - resultLinked;
        //adding points for a winner and showing results
        if (compare<0){
            result = "ArrayList is faster";
            arrayPoints++;
        } else linkedPoints++;
        System.out.println(result);

        //-------------------Inserting on the end of Array and Linked List-------------------
        System.out.println("\n2.3. Inserting on the end of Array and Linked List");
        resultArray = insertOnEnd(integersArray); //inserting elements on the End of ArrayList
        System.out.println("For ArrayList that took " + resultArray + " seconds");
        resultLinked = insertOnEnd(integersLinked); //inserting elements on the end of LinkedList
        System.out.println("For LinkedList that took " + resultLinked + " seconds");

        //comparing time interval results for ArrayList and LinkedList
        compare =  resultArray - resultLinked;
        //adding points for a winner and showing results
        if (compare<0){
            result = "ArrayList is faster";
            arrayPoints++;
        } else linkedPoints++;
        System.out.println(result);

        //-------------------Updating elements from the beginning of Array and Linked List-------------------
        System.out.println("\n3.1. Updating elements from the beginning of Array and Linked List");
        resultArray = updateFromBeginning(integersArray); //updating elements from the beginning of ArrayList
        System.out.println("For ArrayList that took " + resultArray + " seconds");
        resultLinked = updateFromBeginning(integersLinked); //updating elements from the beginning of LinkedList
        System.out.println("For LinkedList that took " + resultLinked + " seconds");

        //comparing time interval results for ArrayList and LinkedList
        compare =  resultArray - resultLinked;
        //adding points for a winner and showing results
        if (compare<0){
            result = "ArrayList is faster";
            arrayPoints++;
        } else linkedPoints++;
        System.out.println(result);

        //-------------------Updating elements from the middle of Array and Linked List-------------------
        System.out.println("\n3.2. Updating elements from the middle of Array and Linked List");
        resultArray = updateFromMiddle(integersArray); //updating elements from the middle of ArrayList
        System.out.println("For ArrayList that took " + resultArray + " seconds");
        resultLinked = updateFromMiddle(integersLinked); //updating elements from the middle of LinkedList
        System.out.println("For LinkedList that took " + resultLinked + " seconds");

        //comparing time interval results for ArrayList and LinkedList
        compare =  resultArray - resultLinked;
        //adding points for a winner and showing results
        if (compare<0){
            result = "ArrayList is faster";
            arrayPoints++;
        } else linkedPoints++;
        System.out.println(result);

        //-------------------Updating elements from the end of Array and Linked List-------------------
        System.out.println("\n3.3. Updating elements from the end of Array and Linked List");
        resultArray = updateFromEnd(integersArray); //updating elements from the end of ArrayList
        System.out.println("For ArrayList that took " + resultArray + " seconds");
        resultLinked = updateFromEnd(integersLinked); //updating elements from the end of LinkedList
        System.out.println("For LinkedList that took " + resultLinked + " seconds");

        //comparing time interval results for ArrayList and LinkedList
        compare =  resultArray - resultLinked;
        //adding points for a winner and showing results
        if (compare<0){
            result = "ArrayList is faster";
            arrayPoints++;
        } else linkedPoints++;
        System.out.println(result);

        //-------------------Deleting elements from the beginning of Array and Linked List-------------------
        System.out.println("\n4.1. Deleting elements from the beginning of Array and Linked List");
        resultArray = deleteFromBeginning(integersArray); //deleting elements from the beginning of ArrayList
        System.out.println("For ArrayList that took " + resultArray + " seconds");
        resultLinked = deleteFromBeginning(integersLinked); //deleting elements from the beginning of LinkedList
        System.out.println("For LinkedList that took " + resultLinked + " seconds");

        //comparing time interval results for ArrayList and LinkedList
        compare =  resultArray - resultLinked;
        //adding points for a winner and showing results
        if (compare<0){
            result = "ArrayList is faster";
            arrayPoints++;
        } else linkedPoints++;
        System.out.println(result);

        //-------------------Deleting elements from the middle of Array and Linked List-------------------
        System.out.println("\n4.2. Deleting elements from the middle of Array and Linked List");
        resultArray = deleteFromMiddle(integersArray); //deleting elements from the middle of ArrayList
        System.out.println("For ArrayList that took " + resultArray + " seconds");
        resultLinked = deleteFromMiddle(integersLinked); //deleting elements from the middle of LinkedList
        System.out.println("For LinkedList that took " + resultLinked + " seconds");

        //comparing time interval results for ArrayList and LinkedList
        compare =  resultArray - resultLinked;
        //adding points for a winner and showing results
        if (compare<0){
            result = "ArrayList is faster";
            arrayPoints++;
        } else linkedPoints++;
        System.out.println(result);

        //-------------------Deleting elements from the end of Array and Linked List-------------------
        System.out.println("\n4.3. Deleting elements from the end of Array and Linked List");
        resultArray = deleteFromEnd(integersArray); //deleting elements from the end of ArrayList
        System.out.println("For ArrayList that took " + resultArray + " seconds");
        resultLinked = deleteFromEnd(integersLinked); //deleting elements from the end of LinkedList
        System.out.println("For LinkedList that took " + resultLinked + " seconds");

        //comparing time interval results for ArrayList and LinkedList
        compare =  resultArray - resultLinked;
        //adding points for a winner and showing results
        if (compare<0){
            result = "ArrayList is faster";
            arrayPoints++;
        } else linkedPoints++;
        System.out.println(result);

        //printing point results of List comparison and showing the winner
        System.out.println("----------Results of comparison----------");
        System.out.println("\nArrayList has " + arrayPoints + " points." +
                           "\nLinkedList has " + linkedPoints + " points.");
        System.out.println("\nThe winner is: " + (linkedPoints > arrayPoints ? "LinkedList" : "ArrayList"));
    }

    /**
     * Method to count execution time of filling list with elements.
     * @param integers Takes list as parameter
     * @return Returns counted execution time
     */
    static float fillArray(List<Integer> integers){
        float startTime = System.nanoTime();
        for (int i = 1; i <= 1_000_000; i++){
            integers.add(i);
        }
        float endTime = System.nanoTime();
        return (endTime - startTime)/1_000_000_000;
    }

    /**
     * Method to count execution time of inserting elements on the beginning of list.
     * @param integers Takes list as parameter
     * @return Returns counted execution time
     */
    static float insertOnBeginning(List<Integer> integers){
        float startTime = System.nanoTime();
        for (int i = 1; i <= 1000; i++){
            integers.add(i-1, i+1000);
        }
        float endTime = System.nanoTime();
        return (endTime - startTime)/1_000_000_000;
    }

    /**
     * Method to count execution time of inserting elements on the middle of list.
     * @param integers Takes list as parameter
     * @return Returns counted execution time
     */
    static float insertOnMiddle(List<Integer> integers){
        int counter = integers.size()%2;
        float startTime = System.nanoTime();
        for (int i = 1; i <= 1000; i++){
            integers.add(counter, i);
            counter++;
        }
        float endTime = System.nanoTime();
        return (endTime - startTime)/1_000_000_000;
    }

    /**
     * Method to count execution time of inserting elements on the end of list.
     * @param integers Takes list as parameter
     * @return Returns counted execution time
     */
    static float insertOnEnd(List<Integer> integers){
        float startTime = System.nanoTime();
        for (int i = 1; i <= 1000; i++){
            integers.add(i);
        }
        float endTime = System.nanoTime();
        return (endTime - startTime)/1_000_000_000;
    }

    /**
     * Method to count execution time of updating elements from the beginning of list.
     * @param integers Takes list as parameter
     * @return Returns counted execution time
     */
    static float updateFromBeginning(List<Integer> integers){
        float startTime = System.nanoTime();
        for (int i = 1; i <= 1000; i++){
            integers.set(i-1, i-1);
        }
        float endTime = System.nanoTime();
        return (endTime - startTime)/1_000_000_000;
    }

    /**
     * Method to count execution time of updating elements from the middle of list.
     * @param integers Takes list as parameter
     * @return Returns counted execution time
     */
    static float updateFromMiddle(List<Integer> integers){
        float startTime = System.nanoTime();
        for (int i = 1; i <= 1000; i++){
            integers.set(i-1, i-1);
        }
        long endTime = System.nanoTime();
        return (endTime - startTime)/1_000_000_000;
    }

    /**
     * Method to count execution time of updating elements from the end of list.
     * @param integers Takes list as parameter
     * @return Returns counted execution time
     */
    static float updateFromEnd(List<Integer> integers){
        int counter = integers.size()%2;
        float startTime = System.nanoTime();
        for (int i = 1; i <= 1000; i++){
            integers.add(counter, i);
            counter++;
        }
        float endTime = System.nanoTime();
        return (endTime - startTime)/1_000_000_000;
    }

    /**
     * Method to count execution time of deleting elements from the beginning of list.
     * @param integers Takes list as parameter
     * @return Returns counted execution time
     */
    static float deleteFromBeginning(List<Integer> integers){
        float startTimeA = System.nanoTime();
        for (int i = 1; i <= 1000; i++){
            integers.remove(i-1);
        }
        float endTime = System.nanoTime();
        return  (endTime - startTimeA)/1_000_000_000;
    }

    /**
     * Method to count execution time of deleting elements from the middle of list.
     * @param integers Takes list as parameter
     * @return Returns counted execution time
     */
    static float deleteFromMiddle(List<Integer> integers){
        int counter = integers.size()%2;
        float startTime = System.nanoTime();
        for (int i = 1; i <= 1000; i++){
            integers.remove(counter);
            counter++;
        }
        float endTime = System.nanoTime();
        return (endTime - startTime)/1_000_000_000;
    }

    /**
     * Method to count execution time of deleting elements from the end of list.
     * @param integers Takes list as parameter
     * @return Returns counted execution time
     */
    static float deleteFromEnd(List<Integer> integers){
        float startTime = System.nanoTime();
        for (int i = 1; i <= 1000; i++){
            integers.remove(integers.size()-i);
        }
        float endTime = System.nanoTime();
        return (endTime - startTime)/1_000_000_000;
    }
}
