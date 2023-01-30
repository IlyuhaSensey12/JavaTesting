public class Cat extends Animal{
    String name;
    String color;


    public Cat(String type, int age, String name, String color) {
        super("cat", age);
        this.name = name;
        this.color = color;
    }

    @Override
    void eat() {
        System.out.println(name + " is drinking milk");
    }

    @Override
    public void moving() {
        System.out.println(name + " is running");
    }
}
