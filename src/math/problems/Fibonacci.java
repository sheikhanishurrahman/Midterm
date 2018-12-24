package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int x,y,z;
        x=0;y =1;z =1;
        System.out.print("1 ,1,");
        while (x<=40){
         x = y+z;
         System.out.print(x + ",");
         y =z;
         z=x;
        }

    }
}
