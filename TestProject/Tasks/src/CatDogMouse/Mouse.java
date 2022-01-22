package CatDogMouse;

 public class Mouse implements Movable, Edible {


    public void move() {
        System.out.println("Mouse move invisible");
    }

    public void beEaten() {
        System.out.println("Opps, mouse was eating");
    }


 }
