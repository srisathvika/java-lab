package academy.learnprogramming;
class Example{
    int n=10;
}
class Task3b extends Example {
    int n=5;
    void display(){
        System.out.println("Value "+n);
        System.out.println("Value of ivariable: "+super.n);
    }
    public static void main(String[] args){
        Task3b obj = new Task3b();
        obj.display();
    }
}
