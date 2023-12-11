class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + "is eating");
    }

    public void sleep() {
        System.out.println(name + "is sleeping");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

}

class Cat extends Animal {
    boolean isIndoor;

    Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    public void speak() {
        System.out.println(name + " is meowing");
    }
}

public class InheriTance {
    public static void main(String[] args) {
        Dog aa = new Dog("Scc", 5, "cc");
        aa.bark();
        Cat cc = new Cat("Csss", 10, false);
        cc.speak();
    }
}
