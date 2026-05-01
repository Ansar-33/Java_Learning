public class copyconstructor {
    public static void main(String [] args){
       cons2 o =  new cons2();
       cons2 o1 = new cons2("Mohammed Ansar");
       cons2 o2 = new cons2(o);
       System.out.println(o.name1);
       System.out.println(o1.name1);
       System.out.println(o2.name1);

    }
}
class cons2{
    String name1;
    
    cons2(){
        name1 = "Ansar";
    }
    cons2(String s){
        name1 = s;
    }
    cons2(cons2 c){
            name1 = c.name1;
    }
}
