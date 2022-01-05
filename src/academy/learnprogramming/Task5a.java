package academy.learnprogramming;

import java.io.File;
import java.util.Scanner;

public class Task5a {
    public static void main (String[] args){
        System.out.println("Enter the file name:");
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        File f= new File(s);
        if(f.exists()){
            System.out.println("File is existing");
        }
        if(f.canRead()){
            System.out.println("File is Readable");
        }
        if(f.canWrite()){
            System.out.println("File is writable");
        }
        if(f.isFile()){
            System.out.println("The given name is a file");
        }
        else {
            System.out.println("The given name is a directory");
        }
        System.out.println("File is of length "+f.length());
    }

}
