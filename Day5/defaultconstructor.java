public class defaultconstructor {
    public static void main(String [] args){
      constructor2 o1 = new constructor2("Ansar");
      constructor2 o2 = new constructor2("John");
        System.out.println(o1.name);
        System.out.println(o2.name);

    }
}

class constructor2{
   String name; 
    constructor2(String n){
        name = n;

    }
}
