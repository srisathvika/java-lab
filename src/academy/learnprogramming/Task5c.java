package academy.learnprogramming;

import java.io.*;
import java.util.*;

public class Task5c {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter file name ");
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        FileInputStream fin= new FileInputStream(s);
        int s1,ch=0,w=0,l=0;
        do{
            s1=fin.read();
            if(s1!=-1){
                ch++;
            }
            if((char)s1=='\n'){
                l++;
                w++;
            }
            if((char)s1==' '){
                w++;
            }
        }while(s1!=-1);
        System.out.println("The no. of characters ; "+ch+
                " the no.of lines: "+l+
                "the no. of words: "+w);

    }
}
