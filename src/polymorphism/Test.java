/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author bulbul
 */
public class Test {
    public static void main(String[] args) {
       
        Man m = new Man();
        m.Working();
        m = new Dog();
        m.Working();
 
    }
}
