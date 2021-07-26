/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileMaker {
    private static final Scanner in = new Scanner(System.in);
    public static boolean webGen(String css, String js, String author, String siteName) {
        //declare and find current working directory
        String webPath;
        webPath = System.getProperty("user.dir");

        //add siteName onto current path
        webPath += "\\" + siteName;

        //create new file with new path
        File website = new File(webPath);

        //if the website gets created than access if statement
        boolean websiteCreated = website.mkdir();

        // prints the directory it was created in
        if (websiteCreated) {
            System.out.println("Created " + webPath);
            try {

                //create html file in new folder
                FileWriter myWriter = new FileWriter(webPath + "\\index.html");

                //write html code displaying siteName for the title and author inside of the meta tag
                myWriter.write("< html>\n<html lang=\"en\">\n\t<head>\n");
                myWriter.write("\t\t<meta author=\"" + author + "\">\n");
                myWriter.write("\t\t<title>" + siteName + "</title>\n\t");
                myWriter.write("</head>\n\t<body>\n\t</body>\n</html>");

                //close writer
                myWriter.close();

                //this tells us the location of the file
                System.out.println("Created " + webPath + "\\index.html");

                //if user wants a JavaScript file than create one in new path
                if (js.equals("y") || js.equals("Y")) {
                    File jsFolder = new File(webPath + "\\js");

                    //this says that the js file was created and if not print the error
                    boolean jsCreated = jsFolder.mkdir();
                    if (jsCreated) {
                        System.out.println("Created " + jsFolder + "\\");
                    } else {
                        System.out.println("Js folder not created!!");
                    }
                }

                //prints out the css file if needed
                if (css.equals("y") || css.equals("Y")) {
                    File cssFolder = new File(webPath + "\\css");

                    //if the folder was created print created if not print the error message
                    boolean cssCreated = cssFolder.mkdir();
                    if (cssCreated) {
                        System.out.println("Created " + cssFolder + "\\");
                    } else {
                        System.out.println("CSS folder not created!!");
                    }
                }
                //file did not create properly
            } catch (IOException e) {
                System.out.println("index.html not created as required!!");
                //if anything else is wrong print that the folder was not created
            }}else{
            System.out.println("Website folder not created!!");
        }
        in.close();
        return websiteCreated;
    }
}
