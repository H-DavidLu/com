package com.Static.practices;

public class Blocks
{

    static
    {
        System.out.println("This is from static blocks.");
        System.out.println("This is from static blocks. Second line.");
        System.out.println("This is from static blocks. Third line here");
    }

    Blocks()
    {
        System.out.println("This is from constructor.");
    }

    public static void main(String args[])
    {
       Blocks blocks1 = new Blocks();
       Blocks blocks2 = new Blocks();
    }
}
