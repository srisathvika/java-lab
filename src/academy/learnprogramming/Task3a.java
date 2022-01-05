package academy.learnprogramming;

public class Task3a {
    int num=5;
    void show(){
        int num=15;
        System.out.println("The instance value is "+this.num);
        System.out.println("The local value is :"+num);
    }
    void display(int num){
        num=4;
        System.out.println("The instance value is "+this.num);
        System.out.println("The local value is "+num);
    }
    public static void main(String[] args){
        Task3a obj = new Task3a();
        obj.show();
        obj.display(15);
    }
}
