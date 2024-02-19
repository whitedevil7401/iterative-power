import java.io.*;
class Power{
    static int Iterative (int x,int y){
        int res =1;

        while (y>0){
                    //if y is odd
            if ((y&1)==1)
            res=res*x;

            //if y is even
            //else
            y= y>>1;
            x=x*x;
           
        }
        return res;
    }


public class Iteretivepower {
    public static void main (String []args){
    int x = 2;
    int y = 3;
    System.out.println("power is "+ Iterative(x,y));
}
}
}
