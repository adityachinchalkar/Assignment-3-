package assignmentNo3.abstractpractice;

public class circle extends shape{

    private double radius;

    private circle(String colour, double radius){
        super(colour);
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getparemiter() {
        return 2 * 3.14 * radius;
    }
}
