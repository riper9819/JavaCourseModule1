import java.util.Scanner;

/************************************
 ***   Created by Bohdan Mandych   ***
 ************************************/

class PalindromeAndAreaCalc {
    public static void main(String[] args) {
        //8 facts about me
        byte age = 22;
        short birth = 1998;
        long weight = 73_000_000l;
        String name = "Bohdan";
        float height = 187.6f;
        boolean married = false;
        char sex = 'm';

        System.out.println("My name is: " + name +
                "\nBirth year: " + birth +
                "\nAge: " + age +
                "\nSex: " + sex +
                "\nMarriege status: " + married +
                "\nHeight in cm: " + height +
                "\nWeight in mg: " + weight);

        //getting string input from user
        Scanner scn = new Scanner(System.in);
        System.out.print("\nEnter your word: ");
        String input = scn.nextLine();

        //checking string for palindrome with reverse method
        System.out.println("\n_____Checking for palindrome with reverse method_____");
        String reversed1 = new StringBuilder(input).reverse().toString();
        System.out.println("Input word: " + input + "\nReversed word: " + reversed1 + "\nPalindrome check: " + input.toLowerCase().equals(reversed1.toLowerCase()));

        //checking string for palindrome with for loop
        System.out.println("\n_____Checking for palindrome with for loop_____");
        String reversed2 = "";
        for (int i = input.length()-1; i >= 0; i--){
            reversed2 += input.charAt(i);
        }
        System.out.println("Input word: " + input + "\nReversed word: " + reversed2 + "\nPalindrome check: " + input.toLowerCase().equals(reversed2.toLowerCase()));

        double area = 0;
        int k = 4;
        int a = 0;
        double b = Math.PI;
        float step = 0.01f;

        //Counting area limited by the functions: x = 0 .. Pi; y = sin(x); y = 0.1 * k.
        for (double x = a; x <= b; x += step ){
            double y = Math.sin(x);
            if (y < 0.1 * k){
                area += y * step;
            }
            else{
                area += 0.1 * k * step;
            }
        }
        System.out.println("\nArea is: " + area);
    }
}