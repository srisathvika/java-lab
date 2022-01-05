package academy.learnprogramming;

import java.util.Scanner;

public class Task6b2 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter value of a ");
        int a= in.nextInt();
        System.out.println("Enter value of b ");
        int b= in.nextInt();
        int c;
        try{
            c=a/b;
            System.out.println("Result= "+c);
        }
        catch(Exception e ){
            System.out.println("Division with 0 is not possible");
        }
    }
}
