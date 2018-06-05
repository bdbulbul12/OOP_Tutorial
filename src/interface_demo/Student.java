
package interface_demo;


public class Student implements Teacher {

    @Override
    public void teaching() {
        System.out.println("Student Class");
    }
    
}
