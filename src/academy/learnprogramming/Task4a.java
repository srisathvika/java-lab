package academy.learnprogramming;
 class Bank{
     void roi(){
         int r=0;
         System.out.println("Rate of interest: "+r);
     }
 }
 class SBI extends Bank{
     void roi(){
         int r=7;
         System.out.println("Rate of interest of SBI: "+r);
     }
 }
class PNB extends Bank{
    void roi(){
        int r=8;
        System.out.println("Rate of interest of PNB: "+r);
    }
}
class Task4a {
     public static void main(String[] args){
         Bank b = new Bank();
         b.roi();
         SBI s= new SBI();
         s.roi();
         PNB p= new PNB();
         p.roi();
         Bank x = new SBI();
         x.roi();
     }

}
