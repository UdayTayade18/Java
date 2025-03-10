// real time example of Constructor
class Employee {
    int employeId=10;
    String employeName="Raghav";
    int employeAge=25;
    Employee(){
        System.out.println("employeId :"+employeId);
        System.out.println("employeName is :"+employeName);
        System.out.println("employeAge :"+employeAge);

    }
    public static void  main(String argss[]){
        Employee obj=new Employee();
    }
    
}
