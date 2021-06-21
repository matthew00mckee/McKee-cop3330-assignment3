/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex43;

import java.io.File;
import java.util.Scanner;
import java.io.*;

import static ex43.fileMaker.webGen;

public class webGen {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //prompting for siteName, author, and if they want a js and css folder
        String siteName = Input("Site name: ");
        String author = Input("Author: ");
        String javaScript = Input("Do you want a folder for JavaScript? ");
        String css = Input("Do you want a folder for CSS? ");

        //call websiteGeneration function
        webGen(css, javaScript, author, siteName);


    }

    public static String Input(String prompt) {
        System.out.println(prompt);
        String x = in.nextLine();
        return x;
    }

}
