package com.Indeed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DomainNames
{
    HashMap<String, String> domainMap =  new HashMap<>();
    HashMap<String, Integer> finalCounts  =  new HashMap<>();
    ArrayList<String> d = new ArrayList<>();

    public static void main(String args[])
    {

        String[] test = {"901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"};
        DomainNames domainNames =  new DomainNames();
       // domainNames.d.add()
        System.out.println(domainNames.splitDomains(test));
    }

    HashMap splitDomains(String[] test)
    {

        //String[] domainStr = test.split("\\s");

        String[] tmp =new String[2];
        for(int i= 0; i<test.length ; i++)
        {
            String test2 = test[i].replaceAll("[^a-zA-Z0-9]", " ");
            String[] splited = test2.split("[^\\w]+");
            finalCountDomains(splited);
            test2="";
        }
        return finalCounts;
    }

    void finalCountDomains(String[] splited)
    {
        int length = splited.length;


        if(finalCounts== null || finalCounts.size()==0) // length = 0
        {
            String addHere2 = "";
            for(int i= splited.length-1; i>=0 ; i--)
            {
                if(i==splited.length-1)
                {
                    finalCounts.put(splited[i], Integer.valueOf(splited[0]));
                    addHere2 += "." + splited[i];
                }
                    else if(i>0 && i< splited.length-1)
                {
                    finalCounts.put( splited[i]+addHere2 , Integer.valueOf(splited[0]));
                    addHere2 = "."+splited[i]+addHere2;
                }
                    else if (i==1)
                {
                    finalCounts.put( splited[i]+addHere2 , Integer.valueOf(splited[0]));
                }
            }
        }
        else
        {
                String addHere = ".";

                if(finalCounts.size()>0)  // meaing there are elements in the hashmap already
                {
                     //if() // if there is some elements here




                }

                 /*
                for(int i= splited.length-1; i>=0 ; i--)
                {
                    if(i==splited.length-1)
                        finalCounts.put( addHere , Integer.valueOf(splited[0]));
                    else if(i>0 && i< splited.length-1)
                    {
                        finalCounts.put( addHere+splited[i] , Integer.valueOf(splited[0]));
                    }else if (i==1)
                    {
                        finalCounts.put( splited[i]+addHere , Integer.valueOf(splited[0]));
                    }
                }
                */
        }
    }
}
