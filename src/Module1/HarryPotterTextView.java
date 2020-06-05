package Module1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;

/************************************
***   Created by Bohdan Mandych   ***
************************************/

class HarryPotterTextView {
    public static void main(String[] args) throws Exception {
        //loading book text from file
        String text = new String (Files.readAllBytes(Paths.get("HarryPotter.txt")),StandardCharsets.UTF_8);
        text = text.replaceAll("\n", " ").
                replaceAll("[.%,;?!@:№\"[0-9]]", "").
                replaceAll("- ", "");

        //removing incorrect spaces
        text = text.replaceAll("\\s+", " ");

        //splitting text in array of word strings
        String[] words = text.split(" ");

        //Creating Array of text distinct words
        String distincts = "";
        for (int i = 0; i < words.length; i++){
            if(!distincts.contains(words[i])){
                distincts += words[i] + " ";
            }
        }
        String[] distinctArray = distincts.split(" ");


        //Sorting words in alphabetic order.
        Arrays.sort(distinctArray);

        //Printing all distinct words from text
        for (int i = 0; i < distinctArray.length; i++){
            System.out.println(distinctArray[i]);
        }
        System.out.println("\nThere are " + distinctArray.length + " distinct words in text.");
    }
}