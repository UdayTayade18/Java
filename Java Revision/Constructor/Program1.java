// concept= constructor get called automatically when object is created
class ConstructorDemo1 {
    ConstructorDemo1(){
        System.out.println(" In Constructor");
    }
    public static void main(String argss[]){
        ConstructorDemo1 obj=new ConstructorDemo1();
        ConstructorDemo1 obj2=new ConstructorDemo1(); // every new object constructor get called 
        ConstructorDemo1 obj3=new ConstructorDemo1();
    }
    
}
