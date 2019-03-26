package com.words.practices;
import java.util.List;

public class Tickets
{
    public static void main(String args[])
    {

    }

    static long waitingTime(List<Integer> theLine, int p)
    {

        int thewaitingTime = theLine.get(p);
        for (int i = 0; i < theLine.size(); i++) {
            if (i == p) continue;

           thewaitingTime += (Math.min(theLine.get(p), theLine.get(i)));

            if (i > p) {
                thewaitingTime--;
            }
        }

        return thewaitingTime;
    }

}
