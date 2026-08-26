public class ParameterizedConstructor{
  public static void main(String[]args){
    
    Laptop l1 = new Laptop("Lenovo", "Gaming", 32);
    l1.onLaptop();
    
    
    Laptop l2 = new Laptop("Acer", "Business", 16);
    l2.onLaptop();
    
    
    Laptop l3 = new Laptop("HP", "Gaming", 16);
    l3.onLaptop();

    
    Laptop l4 = new Laptop("Dell", "Business", 24);
    l4.onLaptop();
    
  }
}

class Laptop{
  String type;
  String brand;
  int ram;

  Laptop(String brand, String type, int ram){
    System.out.println("New Laptop brought!");
    this.brand = brand;
    this.type = type;
    this.ram = ram;
  }


  void onLaptop(){
    System.out.println("Laptop is turning on!");
    System.out.println("Displaying Laptop specs -");
    System.out.println("Brand - " + this.brand);
    System.out.println("Laptop type - " + this.type);
    System.out.println("Laptop ram installed -" + this.ram + "GB");
    System.out.println("");
    System.out.println("");
    System.out.println("");
  }
}