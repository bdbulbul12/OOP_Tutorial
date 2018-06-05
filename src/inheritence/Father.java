
package inheritence;


public class Father {
   private String Car;
   private  String house;

    public String getCar() {
        return Car;
    }

    public String getHouse() {
        return house;
    }

    public void setCar(String Car) {
        this.Car = Car;
    }

    public void setHouse(String house) {
        this.house = house;
    }
    
  void display(){
      System.out.println(getCar());
      System.out.println(getHouse());
  }
    
}
