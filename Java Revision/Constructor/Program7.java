// calling id calling two or more constructor by single object

import java.lang.reflect.Constructor;

class ConstructorDemo7 {
    ConstructorDemo7(){

        System.out.println("In non parametric constructor");

    }
    ConstructorDemo7(int x){

        this();
        System.out.println("In Constructor having one parameter");

    }
    ConstructorDemo7(int x,int y){

        this(x);
        System.out.println("In COnstructor having two parameter");
        
    }
    public static void main(String[]args){

        ConstructorDemo7 obj=new ConstructorDemo7(4,6);

    }

    
}
