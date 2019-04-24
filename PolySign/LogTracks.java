package com.PolySign;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class LogTracks
{
    ArrayList<String> timeStamps =  new ArrayList<>();
    ArrayList<String> users= new ArrayList<>();
    ArrayList<String> status =  new ArrayList<>();
    HashMap<String, Integer> timeStampMap = new HashMap<>();
    HashMap<String, Integer> usersMap = new HashMap<>();
    HashMap<String, Integer> statusMap = new HashMap<>();
    HashMap<String, Integer> dailyUsers =  new HashMap<>();

    int totalNumberRequests = 0;
    int totalNummberErrors = 0;
    int totalUses = 0;
    int uniqueUsers = 0;

    public static void main(String args[])
    {

        // user need to change the log file path here if needed
        String fileName = "D:\\Polysign take home\\real.txt";

        List<String> list = new ArrayList<>();
        LogTracks logs = new LogTracks();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

            //br returns as stream and convert it into a List
            list = br.lines().collect(Collectors.toList());

        } catch (IOException e)
        {
            e.printStackTrace();
        }

        for(int i= 0; i<list.size() ; i++)
        {
            logs.convertToLogFormats(list.get(i));
        }

        // conver to arrays respectively
        String[] convertAgain = new String[logs.timeStamps.size()];
        for(int i= 0; i< logs.timeStamps.size() ; i++)
        {
            convertAgain[i] = (String)logs.timeStamps.get(i);
        }

        String[] convertAgainUsers = new String[logs.users.size()];
        for(int i= 0; i< logs.users.size() ; i++)
        {
            convertAgainUsers[i] = (String)logs.users.get(i);
        }

        String[] convertAgainStatus = new String[logs.status.size()];
        for(int i= 0; i< logs.status.size() ; i++)
        {
            convertAgainStatus[i] = (String)logs.status.get(i);
        }

        logs.timeStampNumbers(logs.timeStampMap, convertAgain);
        logs.timeStampNumbers(logs.usersMap, convertAgainUsers);
        logs.timeStampNumbers(logs.statusMap, convertAgainStatus);

        System.out.println("Requests: " + list.size() );

        //Errors in status
        Set<Map.Entry<String,Integer>> statusErrors =logs.statusMap.entrySet();
        for( Map.Entry<String, Integer> entry:statusErrors )
        {
            if(!entry.getKey().equals("200"))
                logs.totalNummberErrors+= entry.getValue();
        }

        System.out.println("Errors: " + logs.totalNummberErrors );
        System.out.println("Days: " + logs.timeStampMap.size() );
        System.out.println("Unique Users: " + logs.usersMap.size() );
        System.out.println();


        /*
        Requests 4
Errors 1
Days 5
Unique Users 2

         */
        System.out.println("===============Unique Users ===============" );
        //Daily users
        Set<Map.Entry<String,Integer>> daily =logs.dailyUsers.entrySet();
        for( Map.Entry<String, Integer> entry:daily ) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    void convertToLogFormats(String eachLog)
    {
        String[] convertLogs = eachLog.split("\\s+");

        timeStamps.add(convertLogs[0].substring(0, 10));
        users.add(convertLogs[1]);
        status.add(convertLogs[2]);

        if(dailyUsers.size()==0)
            dailyUsers.put(convertLogs[0].substring(0, 10), 1);
        else if( !dailyUsers.containsKey(convertLogs[0].substring(0, 10)))
            dailyUsers.put(convertLogs[0].substring(0, 10), 1);
        else if ( dailyUsers.containsKey(convertLogs[0].substring(0, 10)))
            dailyUsers.put(convertLogs[0].substring(0, 10), dailyUsers.get(convertLogs[0].substring(0, 10)) +1);
    }

    void timeStampNumbers(HashMap<String, Integer> timeStampMap, String[] timeStamps)
    {
        for(int i =0; i<timeStamps.length;i++)
        {
            if(i==0)
            {
                timeStampMap.put(timeStamps[i],1);
            }
          else if(!(timeStampMap.containsKey(timeStamps[i])))
            {
                timeStampMap.put(String.valueOf(timeStamps[i]), 1);
            }
            else if (timeStampMap.containsKey(timeStamps[i]) )
                     timeStampMap.put(String.valueOf(timeStamps[i]), timeStampMap.get(timeStamps[i]) +1);
        }
    }

    void userNumbers(HashMap<String, Integer> usersMap, String[] users)
    {
        for(int i =0; i<users.length;i++) {

            if(i==0)
            {
                usersMap.put(users[i], 1);
            }
            else if(!(usersMap.containsKey(users[i])))
            {
                usersMap.put(users[i], 1);
            }
            else if (usersMap.containsKey(users[i]) )
                usersMap.put(users[i], usersMap.get(users[i]) +1);
        }
    }

    void setStatusNumbers(HashMap<String, Integer> statusMap, String[] status )
    {
        for(int i =0; i<status.length;i++) {

            if(i==0) //String.valueOf(string.charAt(i))==null)
            {
                statusMap.put(status[i], 1);
            }
            else if(!(statusMap.containsKey(status[i])))
            {
                statusMap.put(status[i], 1);
            }
            else if (statusMap.containsKey(status[i]) )
                statusMap.put(status[i], statusMap.get(status[i]) +1);
        }
    }
}
