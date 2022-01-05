package academy.learnprogramming;

public class Task3c {
    static int count=1;
    void display(){
        count++;
        System.out.println("Value of count: "+count);
    }
    public static void main(String[] args){
        Task3c ob1=new Task3c();
        ob1.display();
        Task3c ob2= new Task3c();
        ob2.display();
    }
}
