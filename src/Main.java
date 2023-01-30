import javax.swing.text.Position;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Human human = new Human("Ellias ", 12, 78);
//        Human human2 = new Human("Erlan", 20, 100);
//        Human human1 = new Human();
//        Human human3 = new Human();
//        human3.setName("");
//        human3.setAge(21);
//        human3.setHeight(180);
//        System.out.println(human3.getAge() + " " + human3.getName() + " " + human3.getHeight());
//
//        Human humen[] = {human, human2};
//
//        for (Human humans : humen) {
//            System.out.println(humans.getHumanData());
//        }
////        System.out.println(topHeight(humen).getHumanData());
//
//
////        public static Human topHeight (Human humen[]){
////            Human h = new Human();
////            int MaxHeight = humen[0].height;
////
////            for (int i = 0; i < humen.length; i++) {
////                if (humen[i].height > MaxHeight) {
////                    MaxHeight = humen[i].height;
////                    h = humen[i];
////                }
////            }
////            return h;
////        }
//
//
//        Animal animal = new Animal("Elephant", 23);
//        Cat cat = new Cat("cat", 10, "Bob", "white");
//        Cat cat1 = new Cat("cat", 5, "Mark", "black");
//        Dolphin dolphin = new Dolphin("dolphin", 5, "Mark");
//        Animal animals[] = {animal, cat, dolphin};
//        for (Animal animal1 : animals) {
//            animal1.eat();
//            animal1.moving();
//        }
//
////        Human human = new Human("Ellias", 12, 180);
////        Human human2 = new Human("Mansur", 30, 187);
////        Human human3 = new Human("Margulan", 25, 175);
//
//        ArrayList<Human> humans = new ArrayList<Human>();
//        humans.add(human);
//        humans.add(human2);
//        humans.add(human3);
//        humans.remove(human);
//        System.out.println(humans);
//
//        Car car1 = new Car();
//
//        car1.km = 200;
//
//        Car car2 = new Car();
//
//        car2.km = 100;
//        System.out.println(car1.km);
//        System.out.println(car2.km);
//
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
////        Animal animal = new Dolphin("dolphin", 12, "Bob");
//        Animal animal1 = new Animal("Jiraffe");
//        animal1.SayHello();
//        animal.SayHello();
//
//
//        Car car3 = new Car();
//
//        car3.randomArray();
//
//        car3.randomArray();
//        System.out.println();
//
//        Integer x = 10;
//
//        System.out.println(x);
//
//        System.out.println(car3.random(10));
////        System.out.println(car3.randomArray());
//
//        String separator = File.separator;
//        String path = "/Users/elliasmusaev/Desktop/text.txt";
//
////        File file = new File(path);
//
////        Scanner scanner = new Scanner(file);
//        String line = scanner.nextLine();
//        String[] strings = line.split(" ");
//        System.out.println(Arrays.toString(strings));
//
//        scanner.close();
//
//        File file = new File("/Users/elliasmusaev/Desktop/text.txt");
//
////        try {
////            Scanner scanner = new Scanner(file);
////        } catch (FileNotFoundException e) {
////            System.out.println("File isn't found");
////            e.printStackTrace();
////        }
//
//        System.out.println("After try catch block");

//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            int x = Integer.parseInt(scanner.nextLine());
//
//            if (x != 0) {
//                throw new IOException();
//            }
//        }
//
//        public static void test (Animal animal){
//            animal.SayHello();
//        }

//        int value = 0;
//        int i = 1;
//       while(value < 5){
//            System.out.println(i);
//            value++;
//            i++;
//        }

//        int arr[] = {1,2,3,4,5,6,7,8,9,10};
//        int target = 15;
//        for(int i = 0, i2 = 0; i <= arr.length; i++){
//            if(i >= arr.length){
//                i = 0;
//            }
//            int t = arr[i] + arr[i2];
//            if(t == target){
//                System.out.println(i + " " + i2);
//            }
//        }

//        Person p1 = new Person("Ellias", 3.4);
//        Person p2 = new Person("Lol", 2.9);
//        Person p3 = new Person("Lolka", 2.2);
//
//        Person allPersons[] = {p1, p2, p3};
//        for (Person allPerosn: allPersons) {
//            System.out.println(allPerosn.getData());
//        }
//
//        System.out.println(topPerson(allPersons).getData());
        List<Person> persons = getPerson();
        persons.stream()
                .filter(person -> person.getPosition().equals(Position.JUNIOR))


    }

    public static List<Person> getPerson(){
        return List.of(
                new Person("Ellias", 2.9, Person.POSITION.JUNIOR),
                new Person("Erlan", 3.0, Person.POSITION.JUNIOR),
                new Person("Eva", 4.0, Person.POSITION.MIDDLE),
                new Person("Evgeniy", 1.6, Person.POSITION.SENIOR)
        )
                
    }
    
    
//    public static Person topPerson(Person all[]){
//        Person p = new Person();
//        double maxGpa = all[0].gpa;
//
//        for(int i = 1; i < all.length; i++) {
//            if(all[i].gpa > maxGpa){
//                maxGpa = all[i].gpa;
//                p = all[i];
//            }
//        }
//
//        return p;
//    }
}

