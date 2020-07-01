//https://www.hackerrank.com/challenges/new-year-chaos/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int s=0;s<t;s++){
        int n=sc.nextInt();
        int arr[]=new int[n];int c=0;int flag=0;
        for(int x=0;x<n;x++)
        arr[x]=sc.nextInt();
        for(int i=n-1;i>=0;--i){
            if(arr[i]!=i+1){
             if(i-1>=0 && arr[i-1]==i+1){
                 arr[i-1]=arr[i];
                 arr[i]=i+1;
                 c=c+1;
             }
             else if(i-2>=0 && arr[i-2]==i+1){
                arr[i-2]=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=i+1;
                c=c+2;
             }
              else {
                flag=1;
                System.out.println("Too chaotic");
                break;
                }
            }
        }
       if(flag==0)
       System.out.println(c);  
}
}
}
