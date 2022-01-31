package lesson1.HomeWork1.Task3;

public class Task3 {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        System.out.println("appleBox weight is " + appleBox.getWeight());

        appleBox2.add(new Apple());
        System.out.println("appleBox2 weight is " + appleBox.getWeight());

        appleBox.moveAllTo(appleBox2);
        System.out.println("appleBox weight is " + appleBox.getWeight());
        System.out.println("appleBox2 weight is " + appleBox.getWeight());

    }
}
