package academy.learnprogramming;

public class Task1c {
    int sid;
    String sname;
    Task1c(int id, String name){
        sid=id;
        sname= name;
    }
    void show(){
        System.out.println("sid= "+sid+" sname= "+sname);
    }
    void show(String dept){
        System.out.println("Department="+dept+" sid="+sid+" sname="+sname);
    }
    public static void main(String[] args){
        Task1c t= new Task1c(13,"ravi");
        Task1c t1= new Task1c(14,"raju");
        t.show();
        t1.show();
        t.show("cse");
        t1.show("it");
    }
}
