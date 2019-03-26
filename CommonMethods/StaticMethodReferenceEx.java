package com.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class StaticMethodReferenceEx {

    public static void main(String a[]) {

        List<String> countryList = new ArrayList<>();
        countryList.add("India");
        countryList.add("USA");
        countryList.add("Japan");
        countryList.add("Canada");

        // print the list elements in normal way
        System.out.println("<--- Prior to java-8 --->");
        for(String str:countryList) {
            StaticMethodReferenceEx.printString(str);
        }

        // In Method Reference way
        System.out.println("\n<--- java-8 method reference way --->");
        countryList.forEach(StaticMethodReferenceEx::printString);

        // in Lambda expression way
        System.out.println("\n<--- java-8 lambda expression way --->");
        countryList.forEach(str -> StaticMethodReferenceEx.printString(str));
    }

    public static void printString(String str) {
        System.out.println(str);
    }
}