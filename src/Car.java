import java.util.Random;

public class Car {

    int km;
    public int random(int a){
        Random random = new Random();
        return random.nextInt(a);
    }

    void randomArray(){
        int array[] = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = random(10);
        }
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

}
