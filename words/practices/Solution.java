package com.words.practices;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Solution {

    private int theMaxWords = 0;
    private List<String> lineCount = new ArrayList<String>();

    public int getCurrentMaxCount() {
        return theMaxWords;
    }

    public void setCurrentMaxCount(int theMaxWords) {
        this.theMaxWords = theMaxWords;
    }

    public List<String> getLines() {
        return lineCount;
    }

    public void setLines(List<String> lineCount) {
        this.lineCount = lineCount;
    }

    public static void main(String a[]) {

        Solution object = new Solution();

        object.readMaxLineCount("This is a book. that's a pen.");

        print("\n\nHere is a line with Maximum Word Count in it ====> ");

        List<String> lineCount = object.getLines();
        for (String theLine : lineCount) {
            println(theLine);
        }

        println("The line has max " + object.getCurrentMaxCount() + " words.");
    }

    public void readMaxLineCount(String theFile) {

        Stream<String> theStream = null;
        try {

            // Read all lines from a file as a Stream. Bytes from the file are decoded into characters using the UTF-8 charset
            theStream = Files.lines(Paths.get(theFile));

        } catch (IOException exception) {
            exception.printStackTrace();
        }

        print("============= Printing file FindLongestLineFromFile.txt =============\n");
        theStream.forEach(line -> analyseLines(line));
    }

    private void analyseLines(String theLine) {
        println(theLine);

        // Split a string with any whitespace chars
        int theCount = (theLine.split("\\s+")).length;

        if (theCount > theMaxWords) {

            lineCount.clear();
            lineCount.add(theLine);
            theMaxWords = theCount;

        } else if (theCount == theMaxWords) {
            lineCount.add(theLine);
        }
    }

    private static void println(String theLine) {
        System.out.println(theLine);

    }

    private static void print(String string) {
        System.out.print(string);

    }

}
