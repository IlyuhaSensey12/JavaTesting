public class Animal implements Methods, Methods2{
    String type;
    int age;


    public Animal(){

    }

    public Animal(String newType) {
        type = newType;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    void eat(){
        System.out.println(type + " is eating");
    }

    public void moving(){
        System.out.println(type + " moves ");
    }

    @Override
    public void SayHello() {
        System.out.println("Animal is eating...");
    }

    @Override
    public void doAction() {

    }
}
