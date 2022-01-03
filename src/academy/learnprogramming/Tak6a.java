package academy.learnprogramming;

import java.io.FileInputStream;
import java.util.Scanner;

public class Tak6a {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the file details:");
        String s= in.next();
        try{
            FileInputStream fin= new FileInputStream(s);
            if(fin.read()!=-1){
                System.out.println("File is readable");
            }
        }
        catch(Exception e){
            System.out.println("File is not readable ");
        }

    }
}
