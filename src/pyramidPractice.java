public class pyramidPractice {
    public static void main(String[] args) {
       builder(10);
    }

   public static void builder(int n){
       for (int i = 0; i < n; i++) {

           for (int s1 = n-1; s1 >= i; s1--) {
               System.out.print("s");
           }

           for (int p1 = 0; p1 <= i; p1++) {
               System.out.print("*");
           }

           System.out.print(" ");

           for (int p2 = 0; p2 <= i; p2++) {
               System.out.print("*");
           }

           for (int s2 = n-1; s2 >= i; s2--) {
               System.out.print("s");
           }
           System.out.println();
       }
   }
}