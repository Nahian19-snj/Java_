public class Cats extends Animal {

    String breed;

    public Cats(String name, int age, int weight, String type, String breed) {
        super(name, age, weight, type);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cats [breed=" + breed + ", getName()=" + getName() + ", getBreed()=" + getBreed() + ", getWeight()="
                + getWeight() + ", getAge()=" + getAge() + ", getType()=" + getType() + "]";
    }

 

    

}
