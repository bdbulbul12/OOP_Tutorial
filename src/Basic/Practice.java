
package Basic;


public class Practice {
    String name; 
    int age;

    public void setName(String name) {
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    
    
    public static void main(String[] args) {
        Practice obj = new Practice();
        obj.setName("BULBUL");
    }
}
