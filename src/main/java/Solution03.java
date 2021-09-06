import java.util.Scanner;

public class Solution03 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 03 Solution
     *  Copyright 2021 Reynaldo Martinez
     */
    /*
     * Write application
     * Create scanner to read input
     * Ask user for a quote
     * Store quote inside 'userQuote'
     * Ask user for author
     * Store author inside 'quotesAuthor'
     * output must contain quotation marks using escape characters
     * Use string concatenation
     * Create variable 'outputString'
     * Print the 'outputString'
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String userQuote = input.nextLine();
        System.out.print("Who said it? ");
        String quotesAuthor = input.nextLine();
        String outputString = quotesAuthor + " says, " + "\"" + userQuote + "\"";
        System.out.println(outputString);
    }
}
