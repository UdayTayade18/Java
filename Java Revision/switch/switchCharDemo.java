class switchCharDemo {
    public static void main(String[]args){
        char ch = 'A';
        System.out.println("Before switch");
        switch(ch){
            case 'A':System.out.println("A");
            break;
            case 'B':System.out.println("B");
            break;
            case 'C':System.out.println("C");
            break;
            case 'D':System.out.println("D");
            break;
            default:System.out.println("Defult state");

        }
        System.out.println("After switch");
    }
    
}
