public class Shape {
    public static void main(String[] args){
       int rows =5;
       
        for(int i = 0; i <=rows; i++) {
            for(int space = 1; space <= rows - i; ++space) {
            System.out.print(" ");
            }
            
            for(int j=i; j <= (2 * i) - 1; ++j) {
            System.out.print("* ");
            }
            
            // for(int j = 0; j < (i - 1); ++j) {
            // System.out.print("* ");
            // }
            // int i = 0; i <=rows; i++
            //int i = rows; i >= 1; --i
            
            System.out.println();
            }
    }
    
}
