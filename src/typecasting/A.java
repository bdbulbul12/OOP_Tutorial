
package typecasting;


public class A {
      
    //Primitive -----1.implicit type casting 2. Explici ty...
    //Non primitive --Object type casting 1.Upcasting 2.Downcasting
    
    // byte short int long  float double
    //double float long int short byte
    
    public static void main(String[] args) {
        int x =10;
        double y=x;
        System.out.println(y);
        
        double a = 20.5;
        int b = (int)a;
        System.out.println(b);
    }
}
    

