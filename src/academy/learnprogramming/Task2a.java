package academy.learnprogramming;

import java.util.Locale;
import java.util.Scanner;

public class Task2a {
    public static void main(String[] args){
        System.out.println("Enter the string:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        if(s.toLowerCase().equals(sb.toString().toLowerCase())) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
