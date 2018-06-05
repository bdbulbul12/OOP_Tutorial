
package inheritence;


public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        son.setCar("Toyota");
        son.setHouse("HouseName");
        son.setComputer("Dell");
        son.display();
        
        System.out.println("");
        
        Father father = new Father();
        father.setCar("Car Name");
        father.setHouse("HouseName");
        father.display();
    }
}
