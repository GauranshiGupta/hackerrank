// Problem link https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int arr[]=new int[26];
        int arr2[]=new int[10];
        str=str.toLowerCase();
       for(int i=0;i<str.length();i++)
       {
        char ch=str.charAt(i);
        arr[ch-97]=arr[ch-97]+1;
      }
        int c=0; int large=0;int pos=0;
        for(int j=0;j<26;j++)
        {
            int n=arr[j];
            arr2[n]=arr2[n]+1;
            if(arr2[n]>large)
            {
            large=arr2[n];
            pos=n;
        }
        }
        for(int m=0;m<26;m++)
        {
            int x=pos-arr[m];
            if(x==0)
            continue;
            if(x==1)
            {
                if(arr[m]==1)
                {
                    c=c+1;
               continue;
                }
               else
               {
                   System.out.println("NO");
                   break;
               }
            }
            if(x==(-1))
            c=c+1;
            if(x>1 || x<(-1))
            {
                System.out.println("NO");
                break;
            }
        }
        if(c==1)
        System.out.println("YES");
        else
        System.out.println("NO");
        
}
}
