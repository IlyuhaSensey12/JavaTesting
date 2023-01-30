public class Person {
    private String fullName;
    private double gpa;

    private POSITION position;

    public Person(){

    }
    public Person(String fullName, double gpa, POSITION position) {
        this.fullName = fullName;
        this.gpa = gpa;
        this.position = position;
    }

    enum POSITION{
        JUNIOR, MIDDLE, SENIOR
    }

    String getData() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
