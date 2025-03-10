// concept  is object as parameter of constructor
class ConstructorDemo6{
    ConstructorDemo6(){

        System.out.println("In Non parametric constructor");

    }
    ConstructorDemo6(ConstructorDemo6 xyz){

        System.out.println("In constructor parameter as object");

    }
    public static void main(String args[]){
        ConstructorDemo6 obj1=new ConstructorDemo6();
        ConstructorDemo6 obj2=new ConstructorDemo6(obj1);
    }

    
}
