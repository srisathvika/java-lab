package academy.learnprogramming;

class Thread1 implements Runnable {
    public void run(){
        while(true){
            System.out.println("good morning");
            Thread.sleep(1000);
        }
    }
}

class Thread2 implements Runnable{
    public void run(){
        while(true){
            System.out.println("hello");
            Thread.sleep(2000);
        }
    }
}

class Thread3 implements Runnable{
    public void run(){
        while(true){
            System.out.println("welcome");
            Thread.sleep(3000);
        }
    }
}

 class Task7a {
    public static void main(String[] args){
        Thread1 T1 = new Thread1();
        Thread2 T2 = new Thread2();
        Thread3 T3 = new Thread3();
        Thread th1 = new Thread(T1);
        Thread th2 = new Thread(T2);
        Thread th3 = new Thread(T3);
        th1.start();
        th2.start();
        th3.start();
        System.out.println("Press Ctrl C to stop");
    }
}
