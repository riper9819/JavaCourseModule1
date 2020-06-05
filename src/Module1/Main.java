package Module1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;

/************************************
***   Created by Bohdan Mandych   ***
************************************/

class Main {
    public static void main(String[] args) throws Exception {
        //loading book text from file
        String text = new String (Files.readAllBytes(Paths.get("HarryPotter.txt")),StandardCharsets.UTF_8);
        text = text.replaceAll("\n", " ").
                replaceAll("[.%,;?!@:№\"[0-9]]", "").
                replaceAll("- ", "");

        //removing incorrect spaces
        text = text.replaceAll("\\s+", " ");

        //finding longest word
        String[] words = text.split(" ");
        String longest = "";
        for (int i = 0; i < words.length; i++){
            if(words[i].length() > longest.length()){
                longest = words[i];
            }
        }

        //Creating List and counting number of word "Гаррі" repetitions in text

        List <String> linesArray = Files.readAllLines(Paths.get("HarryPotter.txt"));
        int counter = 0;
        for (int i = 0; i < linesArray.size(); i++){
            if (linesArray.get(i).contains("Гаррі")){
                counter++;
            }
        }

        //Creating Array of text distinct words

        String distincts = "";
        for (int i = 0; i < words.length; i++){
            if(!distincts.contains(words[i])){
                distincts += words[i] + " ";
            }
        }
        String[] distinctArray = distincts.split(" ");
        Arrays.sort(distinctArray);

        //Hashing all text words in Array

        int [] hashCodes = new int [words.length];
        for (int i = 0; i < words.length; i++){
            hashCodes[i] = (words[i]).hashCode();
            System.out.println(words[i] + "     has hash code: " + hashCodes[i]);
        }

        //Counting hash intersections

        int intersections = 0;
        String [] intersectionArray = new String [distinctArray.length];
        for (int i = 0; i < hashCodes.length; i++){
            if(Arrays.asList(intersectionArray).contains(String.valueOf(hashCodes[i]))){
                System.out.println(intersections);
                intersectionArray[intersections] = String.valueOf(hashCodes[i]);
                intersections ++;
            }
        }

        //Results of calculations
        System.out.println("\n**************Results of calculations**************\n");
        System.out.println("There are " + intersections + " intersections in words hash.");
        System.out.println("There are " + distinctArray.length + " distinct words in text.");
        System.out.println("There are " + counter + " words \"Гаррі\" in text.");
        System.out.println("Longest word is: " + longest);
    }
}