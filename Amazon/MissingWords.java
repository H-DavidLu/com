package com.Amazon;

import java.util.ArrayList;

public class MissingWords
{
    protected  static String getMissingWords(String S, String T)
    {

        /*
         String S = "I am David Lu";
        String T = "I am Daniel Chang Lu";

        case 2:

        s= I am a programmer am I

         t= am programmer
         */
        ArrayList<String> arrayList =  new ArrayList<>();
        String words[]=T.split(" ");
        //String words2[]=T.split(" ");
        for(int i= 0; i< words.length ; i++)
        {
            if(!S.contains(words[i]))
                arrayList.add(words[i]);
        }


        return arrayList.toString();

    }



    public static void main(String[] args) {

        String S = "I am David Lu";
        String T = "I am Daniel Chang Lu";

        MissingWords m =  new MissingWords();
        System.out.println(getMissingWords(S,T));

    }
}
