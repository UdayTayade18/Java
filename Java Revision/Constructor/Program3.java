// concept is calling constructor fraom different method
class ConstructorDemo3 {
    ConstructorDemo3(){
        System.out.println("In Constructor");
    }
    void fun(){
        ConstructorDemo3 obj=new ConstructorDemo3();
    }
    public static void main(String argss[]){
        ConstructorDemo3 obj1=new ConstructorDemo3();
        ConstructorDemo3 obj2=new ConstructorDemo3();
        obj1.fun();
    }
    
}
