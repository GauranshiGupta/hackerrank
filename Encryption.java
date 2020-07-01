


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
    String str=sc.next();
    int l=str.length();
    double root=Math.sqrt(l);
    int column=(int)Math.ceil(root);
    for(int i=0;i<column;i++){
        for(int j=i;j<l;j=j+column){
          System.out.print(str.charAt(j));
        }
        System.out.print(" ");
    }
}
}
