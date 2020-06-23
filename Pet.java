public class Pet {
    private String name;
    private int helth;
    private int love;
    public void print() {
        System.out.println("Hi my name is "+this.name+" my healgth is "+this.helth+" intemence honer is "+this.love);  
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
        
    }
    public int getHealth(){
        return helth;
    }
    public void setHealth(int helth) {
        this.helth = helth;
        
    }
    public int getLove(){
        return love;
    }
    public void setLove(int love) {
        this.love = love;
    }
    
}