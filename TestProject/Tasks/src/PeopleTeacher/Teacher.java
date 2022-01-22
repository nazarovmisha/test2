package PeopleTeacher;

public class Teacher extends People {
    String subject;

    public Teacher(String name, int age, String profession, String subject) {
        super(name, profession, age);
        this.subject = subject;
    }

    @Override
    public String getProfession() {
        return profession;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    String getSubject() {
        return subject;
    }

    String giveALesson() {
        return "The lesson was ended";
    }
}
