
package mytutorialoop;


public class Dog {
    String name;
    int age;
    String color;
    
    void setValue(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    
    void display(){
        System.out.println("Name is "+name);
        System.out.println("Age  is "+age);
        System.out.println("Name is "+color);
    }
        
    
 
}
