import java.util.ArrayList;
import java.util.Random;

public class Test {
    public int random(int a){
        Random random = new Random();
        return random.nextInt(a);
    }

    public int[] randomArray(){
        int array[] = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = random(10);
        }
        return array;
    }

}
