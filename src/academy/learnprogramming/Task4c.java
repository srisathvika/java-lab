package academy.learnprogramming;
interface Exam{
    void percent();
}
class Student{
    String name, rno;
    int mark1, mark2;
    Student(String n , String r,int m1, int m2){
        name=n;
        rno=r;
        mark1=m1;
        mark2=m2;
    }
    void display(){
        System.out.println("Student name is "+name);
        System.out.println("Student rollnum is "+rno);
        System.out.println("Student mark1 is "+mark1);
        System.out.println("Student mark2 is "+mark2);

    }
}
class Result extends Student implements Exam{
    Result(String n, String r, int m1, int m2){
        super(n,r,m1,m2);
    }
    void display(){
        super.display();
    }
    public void percent(){
        int tot= mark1+mark2;
        float avg= tot/2;
        System.out.println("Average is "+avg);
    }

}
public class Task4c {
    public static void main(String[] args){
        Result ob = new Result("sathvika","20241A05R3",99,96);
        ob.display();
        ob.percent();

    }
}
