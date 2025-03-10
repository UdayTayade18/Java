// concept is pramertic constructor
class ConstructorDemo5 {
    ConstructorDemo5(){
        System.out.println("In ConstructorDemo1");

    }
    ConstructorDemo5(int x){
        System.out.println("In ConstructorDemo2");

    }
    ConstructorDemo5(int x,int y){
        System.out.println("In ConstructorDemo3");

    }
    public static void main(String args[]){
        ConstructorDemo5 obj=new ConstructorDemo5();
        ConstructorDemo5 obj1=new ConstructorDemo5(10);
        ConstructorDemo5 obj2=new ConstructorDemo5(5,4);
    }
    

    
}
