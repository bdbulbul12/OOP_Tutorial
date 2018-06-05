
package inheritence;


public class Son extends Father{
    
    String computer;

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public String getComputer() {
        return computer;
    }
    
    @Override
    void display(){
      System.out.println(getCar());
      System.out.println(getHouse());
      System.out.println(getComputer());
  }
    
  
}
