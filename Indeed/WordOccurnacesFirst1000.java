package com.Indeed;
/*
/*

https://public.karat.io/content/q093/wordlist.txt

The text file at the URL above lists common words in English, together with a count of their occurrence in a certain text.
 It is tab-delimited and newline-separated. The file is sorted with most common words at the top.

Write a function that, given parameters N and K, downloads the file and returns the N most common words of length
[2..K] together with their occurrence counts.

# Sample usage with maximum word length 5, to find top 1000 words:
get_list(1000, 5)

# Expected output (in order, pseudodata):
[
  ['THE', 53097401461],
  ['OF',  30966074232],
  ['AND', 22632024504],
  # ...
  ['OWNED', 30008173],
  ['VARY', 29995673],
  ['AXIS', 29993153]
]

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class WordOccurnacesFirst1000
{

    LinkedHashMap<String, String> wordMap =  new LinkedHashMap<>();
    LinkedHashMap<String, String> count1000s = new LinkedHashMap<>();

    public static void main(String[] args) throws  Exception
    {
        String url = "https://public.karat.io/content/q093/wordlist.txt";
         WordOccurnacesFirst1000 s = new WordOccurnacesFirst1000();

        System.out.println("This is: "+s.toDownLoad(url));

    }

    // to implement the download file
    HashMap<String, String> toDownLoad(String theURL) throws Exception
    {
        BufferedReader br = new BufferedReader
                          ( new InputStreamReader(
                            new URL(theURL).openStream()));
        String test;
        while(( test=br.readLine()) != null)
        {
            String[] splited = test.split("\\s+");
            wordMap.put(splited[0] , splited[1]);
        }

        int counter1000 = 0;
        Set<Map.Entry<String, String>> count1000 = wordMap.entrySet();
        for(Map.Entry entry:count1000 ) {

            if(entry.getKey().toString().length()>=2 && entry.getKey().toString().length()<=5  && counter1000<1000)
            {
                count1000s.put((String)entry.getKey(), (String)entry.getValue());
                System.out.println("Key= "+entry.getKey()+ ",  Value= " +entry.getValue());
                counter1000++;

            }
        }
        System.out.println("The size of 1000 counts map is:" + count1000s.size() );

        return count1000s;
    }
}

/*
while(((line2 = in.readLine()) != null))
            {
                line2 = in.readLine();
                String[] val2 = line2.split(SEPARATOR);
                String ID = val2[0];
                String name = val2[1];

                courses.put(ID, name);
            }

         in.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }

       return courses;
        }
 */