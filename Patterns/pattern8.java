/* print c b a
         c b a
         c b a
 */
class pattern8 {
    public static void main(String[]args){
        for(int i=1;i<=3;i++){
            char ch='c';
            for(int j=1;j<=3;j++){
                System.out.print(" "+ch--);
            }
            System.out.println();
        }
    }
    
}
