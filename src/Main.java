import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class Main {
    public static void main(String[] args) throws Exception {
        String text = new String (Files.readAllBytes(Paths.get("HarryPotter.txt")));
        text = text.replaceAll("\n", " ").
                replaceAll("[.%,;?!@:№\"[0-9]]", "").
                replaceAll("- ", "").
                replaceAll("  ", " ");

        String[] words = text.split(" ");
        String longest = "";
        for (int i = 0; i < words.length; i++){
            if(words[i].length() > longest.length()){
                longest = words[i];
            }
        }

        List <String> linesArray = Files.readAllLines(Paths.get("HarryPotter.txt"));

        int counter = 0;
        for (int i = 0; i < linesArray.size(); i++){
            if (linesArray.get(i).contains("Гаррі")){
                counter++;
            }
        }

        String [] hashCodes = new String [linesArray.size()];
        for (int i = 0; i < linesArray.size(); i++){
            hashCodes[i] = String.valueOf(linesArray.get(i).hashCode());
            System.out.println("Line number " + (i+1) + " has hash code: " + hashCodes[i]);
        }

        int intersections = 0;
        for (int i = 0; i < hashCodes.length; i++){
            for (int j = 0; j < hashCodes.length; j++){
                if (hashCodes[i] == hashCodes[j] && i != j){
                    intersections++;
                }
            }
        }
        System.out.println("There are " + intersections + " intersections in hash!");
        System.out.println("There are " + counter + " words \"Гаррі\" in text.");
        System.out.println("Longest word is: " + longest);
    }
}