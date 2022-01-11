public class Cat {
    private String name, owner;
    private int age;
    public Cat(String name, int age, String owner){
        this.name=name;
        this.age=age;
        this.owner=owner;

    }
    public String toString(){
        return "The cat" + name + "is already" + age + ". Her master" + owner + "takes care of her.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
 class PedigreeCat extends Cat {
    private String breed; //new field

    public PedigreeCat(String name, int age, String owner, String breed) {
        super(name, age, owner);
        this.breed = breed;
    }


    public String getBreed() { return breed; }

    public void setBreed(String breed) { this.breed = breed; }


    public String toString() {
        return "The cat" + this.getName() + "is very beautiful, although she is now" + this.getAge() + ", she belongs to the breed" + breed + ", and her owner" + this.getOwner() + "is very proud of her.";
    }
}