public class Animal extends Creature {
    
    private int weight;
    private String type;
    public Animal(String name, int age, int weight, String type) {
        super(name, age);
        this.weight = weight;
        this.type = type;
    }
    
    public int getWeight() {
        return weight;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal [weight=" + weight + ", type=" + type + ", Name=" + getName() + ", Age=" + getAge()
                + "]";
    }

    public void makeSound(){
        System.out.println(" making sound ");
    }
    

    
}
