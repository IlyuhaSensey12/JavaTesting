public class Dolphin extends Animal{
    String name;

    public Dolphin(String type, int age, String name) {
        super(type, age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void moving() {
        System.out.println(type + " is swimming");
    }

    @Override
    public void SayHello() {
        System.out.println("Dolphin is eating");
    }
}
