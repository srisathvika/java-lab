package academy.learnprogramming;
class Queue{
    int n;
    boolean valueSet=false;
    synchronized int get() {
        if (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interruption occured");
            }
            System.out.println("The value get(): " + n);
            valueSet = false;
            notify();
        }
        return n;
    }
    synchronized void put(int n){
        if(valueSet){
            try{
                wait();
            }
            catch(Exception e){
                System.out.println("Interruption occured");
            }
            this.n=n;
            System.out.println("The value of put(): "+n);
            valueSet=true;
            notify();
        }
    }
}
class Producer implements Runnable{
    Queue Q ;
    Producer(Queue Q){
        this.Q=Q;
        new Thread(this,"producer").start();
    }
    public void run(){
        int i=1;
        while(true){
            Q.put(i);
            i++;
        }
    }
}
class Consumer implements Runnable{
    Queue Q ;
    Consumer(Queue Q){
        this.Q=Q;
        new Thread(this ,"consumer").start();
    }
    public void run(){
        while(true){
            Q.get();
        }
    }
}

public class Task7b {
    public static void main(String[] args){
        Queue Q = new Queue();
        new Producer(Q);
        new Consumer(Q);
        System.out.println("Press ctrl c to stop");
    }
}
