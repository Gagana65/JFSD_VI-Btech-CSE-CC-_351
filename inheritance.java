class Animal {
    String name;
    Animal(String name) { this.name = name; }
    void speak() { System.out.println(name + " makes a sound."); }
}

class Dog extends Animal {
    Dog(String name) { super(name); }
    void speak() { System.out.println(name + " barks."); }
}

class Cat extends Animal {
    Cat(String name) { super(name); }
    void speak() { System.out.println(name + " meows."); }
}

public class inheritance {
    public static void main(String[] args) {
        Animal dog = new Dog("Rex");
        Animal cat = new Cat("Whiskers");
        dog.speak(); 
        cat.speak();  
    }
}
