public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.eat();
        dog.bark();
        dog.eat();
        // animal.bark() Animal has no bark method. This won't compile.
    }
}