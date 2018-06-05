/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism2;

/**
 *
 * @author bulbul
 */
public class Test {
    public static void main(String[] args) {
        Animal a;
        
        a=new Cat();
        a.eat();
        
        a=new Dog();
        a.eat();
        
        a = new Lion();
        a.eat();
    }
}
