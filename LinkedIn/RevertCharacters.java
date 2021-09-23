package com.LinkedIn;

import javax.swing.*;

public class RevertCharacters {


    public static void main(String[] args) {
        char[] sample = {'g','o',' ','t','o',' ','M','I','T'};
        RevertCharacters revertCharacters = new RevertCharacters();
        System.out.println(revertCharacters.getRevertChars(sample));

    }

    public String getRevertChars(char[] test){
        if(test.length==0 || test==null){
            return null;

        }
        String combineToString = "";
        for(int i= 0; i<test.length ; i++)
        {
            combineToString+=   Character.toString(test[i]);
        }

//        char[] finalRevert = new char[combineToString.length()];
//        for(int i= 0; ; i++) {
//
//        }

        return combineToString;
    }

}
