package academy.learnprogramming;
class Bank1{
    void roi(){
        int r=0;
        System.out.println("Rate of interest: "+r);
    }
}
class SBI1 extends Bank1{
    void roi(){
        int r=7;
        System.out.println("Rate of interest of SBI: "+r);
    }
}
class PNB1 extends Bank1{
    void roi(){
        int r=8;
        System.out.println("Rate of interest of PNB: "+r);
    }
}
class Task4b {
    public static void main(String[] args){
        Bank1 ref;
        Bank1 b= new Bank1();
        ref=b;
        ref.roi();
        SBI1 s= new SBI1();
        ref=s;
        ref.roi();
        PNB1 p = new PNB1();
        ref =p;
        ref.roi();
    }
}
