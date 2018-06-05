
package singletonpattern;

public class SingleTonClass {
    
     private static SingleTonClass instance = null;
 
    
   
    private SingleTonClass()
    {
        System.out.println("SignleTon Class");
        
    }
 
   
    public static SingleTonClass getInstance()
    {
        if (instance == null)
            instance = new SingleTonClass();
 
        return instance;
    }
   
    

}

