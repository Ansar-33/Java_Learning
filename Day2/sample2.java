class sample2 {   
    public static void main(String [] args){
       samp o = new samp();
       o.add();
       System.out.println(o.a);
       System.out.println(samp.b);       //  (o.b) not recommended
         
    }
}

class samp{
    int a = 20;                //Instance variable
    static int b = 50;         //static variable
    void add(){
        int a = 10;
        final int c = 30;                     // cannot have static variable inside methods
        System.out.println(a); 
        System.out.println(c);     
                               
        
    }
}

