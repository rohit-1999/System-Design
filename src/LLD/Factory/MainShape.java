package LLD.Factory;

public class MainShape {
    public static void main(String[] args) {
        ShapeFactory s = new ShapeFactory();
        Shape s1 =  s.getShape("CIRCLE");
        s1.draw();
    }
}
