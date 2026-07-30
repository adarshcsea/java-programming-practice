class Penclass{
    String color;
    String type;

    public void write(){
        System.out.println("Just chill");
    }
}

public class Pen {
    public static void main(String[]args){
        Penclass pen = new Penclass();
        pen.color = "red";
        pen.type = "Ink";
        pen.write();
    }
}
