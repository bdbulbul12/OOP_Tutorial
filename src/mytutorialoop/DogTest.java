
package mytutorialoop;


public class DogTest {
     public static void main(String[] args) {
        Dog dog1 = new Dog();
       
        dog1.setValue("Ginger", 2, "red");
        dog1.display();
        
        System.out.println("");
        
        Dog dog2 = new Dog();
        dog2.setValue("Tommy", 4, "Black");
        dog2.display();
         
    }
}
