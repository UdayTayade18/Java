/* print 4 4 4 4
         5 5 5 5 
         6 6 6 6
         7 7 7 7
 */
class pattern11 {
    public static void main(String[]args){
        int x=4;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(" "+x);
            }x++;
            System.out.println();
        }
    }
    
}
