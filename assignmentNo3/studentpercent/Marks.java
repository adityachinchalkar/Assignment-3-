package assignmentNo3.studentpercent;

public abstract class Marks {

        public abstract float getPercentage();


    public static void main(String[] args) {

        A a = new A(80, 60, 100);

        System.out.println(a.getPercentage());

        B b = new B(90, 65, 67, 96);

        System.out.println(b.getPercentage());

    }

}




