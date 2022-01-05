package academy.learnprogramming;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Task2c {
    public static void main(String[] args){
        int k, total=0;
        System.out.println("Enter the line of integers: ");
        Scanner sc = new Scanner(System.in);
        StringTokenizer st= new StringTokenizer(sc.nextLine());
        while (st.hasMoreElements()){
            k= Integer.parseInt(st.nextToken());
            total=total+k;
            System.out.println("The integers entered are: "+k);
        }
        System.out.println("Total= "+total);
    }
}
