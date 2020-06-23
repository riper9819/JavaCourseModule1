/*
 * Class name: Glossary
 *
 * @version 1.0
 *
 * 23-Jun-2020
 *
 * @author Bohdan Mandych
 *
 * Description:
    Glossary.java is a class created for Harry Potter book glossary.

    1. GLOSSARY - 10 points

    1.1.  Download a text about Harry Potter.
    1.2.  For each distinct word in the text calculate the number of occurrence.
    1.3.  Use RegEx.
    1.4.  Sort in the DESC mode by the number of occurrence.
    1.5.  Find  the first 20 pairs.
    1.6   Find all the proper names.
    1.7.  Count them and arrange in alphabetic order.
    1.8.  First 20 pairs and names write into to a file test.txt.
    1.9.  Create a fine header for the file.
    1.10. Use Java  Collections to demonstrate your experience (Map, List).

    Show all your skills and experience.  All the tricks will be taken into account.
 */

package FinalCourseTask;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.io.Writer;
import java.io.IOException;
import java.io.UncheckedIOException;

public class Glossary {
    public static void main(String[] args) throws Exception {
        //loading book text from file
        String text = new String (Files.readAllBytes(Paths.get("src/FinalCourseTask/harry.txt")), StandardCharsets.UTF_8);

        //clearing text from signs
        text = text.replaceAll("\n", " ").
                replaceAll("[%,;()?!@:�№\"[0-9]]", "").
                replaceAll("--", "").
                replaceAll("- ", "");

        //creating array of words
        String[] words = text.replaceAll("\\.", " ").
                replaceAll("\\s+", " ").
                replaceAll("\\.", " ").
                split(" ");

        //Creating Array of text distinct words
        String distincts = "";
        for (int i = 0; i < words.length; i++){
            if(!distincts.contains(words[i])){
                distincts += words[i] + " ";
            }
        }
        String[] distinctArray = distincts.split(" ");
        Arrays.sort(distinctArray);

        //Creating Map of distinct words
        Map<String, Integer> map = IntStream.range(0, distinctArray.length).boxed()
                .collect(Collectors.toMap(i -> distinctArray[i], i -> 0, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        //counting occurrence of distinct words in text
        for (String s: distinctArray){
            for (String t: words){
                if (s.equals(t)){
                    map.replace(s, map.get(s), map.get(s)+1);
                }
            }
        }

        //sorting Map of distinct words by DESC
        map = map.entrySet().stream().sorted(Map.Entry. <String, Integer> comparingByValue().reversed()).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new));


        //Printing first 20 pairs of distinct words and their occurrences results from Map to console
        map.entrySet().stream().limit(20).forEach(s -> System.out.println("Word: \"" + s.getKey() + "\" occurred: " + s.getValue() + " times"));

        //-----------------Counting name occurrence and saving first 20 pairs to txt file-----------------

        System.out.println("\n-------------Saving name occurrence information to txt file-------------");
        //declaring empty list for distinct names
        List<String> names = new ArrayList<>();

        //filling list with distinct name
        for (String word: words){
            if (
                    (!names.contains(word)) &&
                    (!text.contains(word.toLowerCase())) &&
                    (!word.contains("'")) &&
                    (Character.isUpperCase(word.charAt(0)))){
                names.add(word);
            }
        }

        //moving distinct names list to Map
        Map<String, Integer> nameMap = IntStream.range(0, names.size()).boxed()
                .collect(Collectors.toMap(i -> names.get(i), i -> 0, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        //counting occurrence of names in text
        for (String s: names){
            for (String t: words){
                if (s.equals(t)){
                    nameMap.replace(s, nameMap.get(s), nameMap.get(s)+1);
                }
            }
        }

        //sorting Map of distinct names by DESC
        nameMap = nameMap.entrySet().stream().sorted(Map.Entry. <String, Integer> comparingByValue().reversed()).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        //writing first 20 pairs of names and their occurrences results from Map to file
        try(Writer writer = Files.newBufferedWriter(Paths.get("src/FinalCourseTask/Harry names occurrence.txt"))) {
            nameMap.entrySet().stream().limit(20).forEach((s) -> {
                try { writer.write("Word: \"" + s.getKey() + "\" occurred: " + s.getValue() + " times" + System.lineSeparator()); }
                catch (IOException ex) { throw new UncheckedIOException(ex); }
            });
            System.out.println("File successfully saved to Harry names occurrence.txt");
        } catch(UncheckedIOException ex) { throw ex.getCause(); }
    }
}
