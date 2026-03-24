class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    //Override
    void speak() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    //Override
    void speak() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Animal()};
        for (Animal a : animals) {
            a.speak(); // Runtime polymorphism
        }
    }
}
