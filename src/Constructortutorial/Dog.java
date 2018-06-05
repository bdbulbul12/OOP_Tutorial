
package Constructortutorial;


public class Dog {
    String name;
    int age;
    String color;
    
    int square(int value){
        return value*value;
    }
    
    Dog(){
        
        System.out.println("Default Constructor");
    }
    
    Dog(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    
    Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    
    void display(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
        System.out.println("Color "+color);
    }
}
