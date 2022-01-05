package academy.learnprogramming;
class a{
    int a=10;
    public int b=20;
    protected int c=30;
    private int d=40;   
    public void show(){
        System.out.println("Volume of d "+d);
    }
}
class b {
    a obj = new a();
    int x= obj.a+=1;
   int y= obj.b+=1;
    int z=obj.c+=1;

    void display() {
        System.out.println("Value of a " + obj.a);
        System.out.println("Value of b " + obj.b);
        System.out.println("Value of c " + obj.c);

    }
}
class Task4d {
    public static void main(String[] args){
        a ob1 = new a();
        b ob2 = new b();
        ob1.show();
        ob2.display();
    }

}
