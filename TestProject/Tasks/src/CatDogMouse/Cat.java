package CatDogMouse ;

public class Cat implements Movable, Eat,Edible {
    public void move(){
        System.out.println("Cat move quietly");
    }
    public void eat(){
        System.out.println("Cat can eat");
    }

    public void beEaten(){
        System.out.println("Oops, cat was eating");
    }
}
