package academy.learnprogramming;

import java.util.Scanner;

public class Task2b {
    public static void main(String[] args){
        int n;
        String temp;
        System.out.println("Enter number of strings: ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        String names[]= new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the string "+i);
            names[i]= sc.next();
        }
        for(int i=0; i<n;i++){
            for(int j=1;j<n;j++){
                if(names[j].compareTo(names[j-1])<0)
                {
                    temp=names[j];
                    names[j]= names[j-1];
                    names[j-1]= temp;
                }
            }
        }
        System.out.println("The sorted names are:");
        for(int i=0;i<n;i++){
            System.out.println(" "+names[i]);
        }
    }
}
