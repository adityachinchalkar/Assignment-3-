package assignmentNo3.abstractpractice;


public class rectangle extends shape {

    public double width;
    public double breath;

    public rectangle(String colour, double width, double breath){
        super(colour);
        this.breath = breath;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width *breath;
    }

    @Override
    public double getparemiter() {
        return 2 * (width + breath) ;
    }
}
