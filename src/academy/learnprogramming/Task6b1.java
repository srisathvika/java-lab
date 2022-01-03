package academy.learnprogramming;

public class Task6b1 {
    public static void main(String[] args){
        int a[]= {1,2,3,4,5};
        int i=1;
        try{
            while(i>0){
                int c = a[i];
                System.out.println(c);
                i++;
            }
        }
        catch(Exception e){
            System.out.println("REACHED THE END OF ARRAY");
        }
    }

}