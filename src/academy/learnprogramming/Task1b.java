package academy.learnprogramming;

public class Task1b {
    int sid;
    String sname;
    Task1b(int id, String name){
        sid=id;
        sname=name;
        System.out.println("sid= "+sid+" sname= "+sname);
    }
    public static void main (String[] args){
        Task1b t= new Task1b(13,"ravi");
        Task1b t1= new Task1b(12,"raju");
    }
}
