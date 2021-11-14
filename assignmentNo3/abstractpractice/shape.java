package assignmentNo3.abstractpractice;

public abstract class shape {

    public abstract double getArea();
    public abstract double getparemiter();

    private String colour;

    public shape(String colour) {
        this.colour = colour;
    }

    public String getColour(){
        return this.colour;
    }
}
