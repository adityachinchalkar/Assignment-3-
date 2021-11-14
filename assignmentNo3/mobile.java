package assignmentNo3;

public class mobile implements Cloneable {


    private   String name;
    private String company;
    private int cost;

    public mobile(String name, String company, int cost) {
        this.name = name;
        this.company = company;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public Integer getCost() {
        return cost;
    }

    public void print(){
        System.out.println(String.format("name : %S, company : %s, cost : %d",getName(), getCompany(), getCost()));
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        mobile mobile= new mobile("redmi","xaomi",10000);
        mobile.print();
        mobile m2 = (mobile)mobile.clone();
        m2.print();




    }
}
