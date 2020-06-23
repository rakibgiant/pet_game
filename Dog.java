public class Dog extends Pet {
   private String breed;
   public Dog(String string, int i, int j, String string2) {
}
/*
public String getString(){
       System.out.println("I am a "+breed);
       return breed;
   } */
   public void setBreed(String breed) {
    this.breed = breed;
}
public String getBreed() {
    return breed;
}
public void print() {
    super.print();
    System.out.println("I am a " + this.getBreed() + ".");
}
public void setHealth(int i) {
    super.getHealth();
}
public void setName(String string) {
    super.getName();
}
}