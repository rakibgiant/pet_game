public class PetTest {
    public static void main(String[] args) {
        Dog dog = new Dog("George",85,10,"poodle");
        dog.print();
        dog.setName("Jack");
        dog.setHealth(80);
        dog.setBreed("smart dog");
        
        dog.print();

        Peinguine penguin = new Peinguine();
        penguin.setName("Bikki");
        penguin.setHealth(87);
        penguin.setSex("Boy");
        penguin.print();
    }
}