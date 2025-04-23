package oop;

class Animal {
    public void speak() {
        System.out.println("Hayvan havliyor");
    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("Kopek havliyor");
    }

    public void speak(String sound) {
        System.out.println("Kopek şu sesi cikartiyor: " + sound);
    }

    public void speak2(){
        System.out.println("Kopek uzulerek havliyor.");
    }
}

public class Oop {
    public static void main(String[] args) {
        // System.out.println("Hayvan havliyor"); Animal
        // System.out.println("Kopek havliyor"); Dog
        Animal animal = new Dog();
//        animal.speak2(); çalışmaz sebebi de Dog'un metodu Animal'ın değil.
        Dog dog = new Dog();
        animal.speak();
        dog.speak("Hayvan mutlu havlıyor");
        dog.speak2();
        dog.speak();
        System.out.println("*********************************");
    }
}