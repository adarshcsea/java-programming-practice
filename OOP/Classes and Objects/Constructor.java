public class Constructor{
  public static void main(String[]args){
    Laptop l1 = new Laptop();
    l1.brand = "lenovo";
    l1.ram = 16;
    l1.type = "Gaming";
    l1.onLaptop();
  }
}

class Laptop{
  String type;
  String brand;
  int ram;

  Laptop(){
    System.out.println("New Laptop brought!");
  }

  void onLaptop(){
    System.out.println("Laptop is turning on!");
    System.out.println("Displaying Laptop specs -");
    System.out.println("Brand - " + this.brand);
    System.out.println("Laptop type - " + this.type);
    System.out.println("Laptop ram installed -" + this.ram + "GB");
  }
}