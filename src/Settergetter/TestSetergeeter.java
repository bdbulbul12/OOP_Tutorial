
package Settergetter;


public class TestSetergeeter {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("BULBUL");
        student.setAge(23);
        System.out.println("Name is "+student.getName());
        System.out.println("Age  is "+student.getAge());
    }
}
