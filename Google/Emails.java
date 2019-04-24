package com.Google;

/*
Every email consists of a local name and a domain name, separated by the @ sign.

For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.

Besides lowercase letters, these emails may contain '.'s or '+'s.

If you add periods ('.') between some characters in the local name part of
 an email address, mail sent there will be forwarded to the same address
 without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com"
 forward to the same email address.  (Note that this rule does not apply for domain names.)

If you add a plus ('+') in the local name, everything after the first plus sign will be ignored.
 This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.
  (Again, this rule does not apply for domain names.)

It is possible to use both of these rules at the same time.

Given a list of emails, we send one email to each address in the list.
 How many different addresses actually receive mails?


Example 1:

Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Emails
{
    HashSet<String> emailSet = new HashSet<>();
    ArrayList<String> emailArrayList = new ArrayList<>();

    String addHere="";

    public static void main(String args[])
    {

        String[] addresses = {
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};

        Emails emails = new Emails();
        for(int i= 0; i< addresses.length ; i++)
        {
            System.out.println( emails.collecEmails(addresses,addresses[i]));
        }

        System.out.println("HashSet: " +emails.emailSet);
    }

    HashSet<String> collecEmails(String[] addresses, String elementString)
    {
        Emails emails = new Emails();
        String[] fromUnformats = elementString.split("@");
        String localDomain = fromUnformats[0].toLowerCase();

        //local domain: to delet the signs: . +
        String realDomain ="";
        for(int i= 0; i<localDomain.length() ; i++)
        {
            if(!String.valueOf(localDomain.charAt(i)).equals("+"))
                realDomain+= localDomain.charAt(i);
            else break;
        }

        String removeDotLocalDomain = realDomain.replaceAll("[^a-zA-Z0-9]","");

        // email domain
        String emailDomain = fromUnformats[1].toLowerCase();
       // String afterEmailDomain = emailDomain.replaceAll("[^a-zA-Z0-9]", "");

        String realEmailAddress = removeDotLocalDomain+"@"+emailDomain;
        emailSet.add(realEmailAddress);

        //System.out.println( emails.emailArrayList);
        //System.out.println( "This is the local domain:" + emails.emailSet);

        addHere+=realEmailAddress;
        return emails.emailSet;

        }
}
