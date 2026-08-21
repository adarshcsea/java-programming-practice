public class Thiskeyword{
  
  static class student{
    String name;

    void printname(){
      System.out.println(this.name);
    }
    void printname1(){
      System.out.println("HI");
    }
  }

  public static void main(String[]args){
    student stu1 = new student();
    student stu2 = new student();
    stu1.name = "abi";
    stu2.name = "adarsh";
    stu1.printname();
    stu2.printname();
    stu1.printname1();
    stu2.printname1();
  }
}