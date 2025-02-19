/* print 14 15 16 17
         15 16 17 18
         16 17 18 19
         17 18 19 20
 */
class pattern12 {
    public static void main(String[]argts){
        for(int i=1;i<=4;i++){
            int x=14+i-1;
            for(int j=1;j<=4;j++){
                System.out.print(" "+x++);
            }
            System.out.println();
        }
    }
    
}
