package academy.learnprogramming;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Task5b{
    public static void main (String[] args){
        System.out.println("Enter the file name:");
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        FileInputStream fin = new FileInputStream(s);
        int s1, i=1;
        do{
            s1= fin.read();
            if(s1!=-1){
                System.out.println((char)s1);
            }
            if ((char)s1=='\n'){
                System.out.println(i+++" ");
            }

        }while (s1!=-1);

    }

}