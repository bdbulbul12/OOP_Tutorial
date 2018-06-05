
package typecasting;


public class Test {
    public static void main(String[] args) {
        
        Student s = (Student)new Person();
        s.show();
    }
}
