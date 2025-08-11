package OOPs;

public class penObject {
    public static void main(String [] args){
        Pen p1 = new Pen();
        p1.color = "red";
        p1.type = "ball";
        p1.write();
        System.out.println("Type of pen " + p1.print("t"));
    }
}
