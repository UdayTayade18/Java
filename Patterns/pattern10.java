/* print c2w1 c2w2 c2w3 
         c2w1 c2w2 c2w3
         c2w1 c2w2 c2w3 
 */
class pattern10 {
    public static void main(String[]args){
        for( int i=1;i<=3;i++){
            int x=1;
            for(int j=1;j<=3;j++){
                System.out.print(" C2W"+x++);
            }
            System.out.println();
        }
    }
    
}
