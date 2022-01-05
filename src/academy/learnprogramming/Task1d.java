package academy.learnprogramming;

public class Task1d {
    int sid;
    String sname;
    Task1d(int id, String name){
        sid=id;
        sname=name;
    }
    void show(){
        System.out.println("sid="+sid+" sname="+sname);
    }
    Task1d(){
        sid=13;
        sname="ravi";
    }
    public static void main(String[] args){
        Task1d t = new Task1d();
        Task1d t1 = new Task1d(23,"raju");
        t.show();
        t1.show();
    }
}
