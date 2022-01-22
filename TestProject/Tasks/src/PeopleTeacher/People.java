package PeopleTeacher;

abstract public class People {
    String name, profession;
    int age;

    public People(String name, String profession, int age) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }
    abstract public String getProfession();
    abstract public int getAge();
    abstract public String getName();

}
