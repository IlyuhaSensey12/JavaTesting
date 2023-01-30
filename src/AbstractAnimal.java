public abstract class AbstractAnimal implements Methods, Methods2{
    private int gender;

    public AbstractAnimal(int gender){
        this.gender = gender;
    }
    public void gender(){
        System.out.println();
    }

    @Override
    public void SayHello() {

    }

    @Override
    public void doAction() {

    }
}
