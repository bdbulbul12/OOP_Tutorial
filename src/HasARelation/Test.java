
package HasARelation;


public class Test {
    public static void main(String[] args) {
        Address ad = new Address("Dhaka","Tangail","Bangladesh");
        Employee em = new Employee(1,"BULBUL",ad);
        em.display();
    }
}
