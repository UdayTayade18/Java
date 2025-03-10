//concept :- Constructor is use to intialize the non-static global variable
class ConstructorDemo2 {
    int x=10;
    static int y=20;
    public static void main(String argss[]){
       // System.out.println(x); //error occur beacuse x is non static variable ,not intialize in static without creating object
        System.out.println(y);
    }
    
}
