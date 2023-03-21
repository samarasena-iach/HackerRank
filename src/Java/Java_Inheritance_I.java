package Java;

// Link: https://www.hackerrank.com/challenges/java-inheritance-1/problem?isFullScreen=true
public class Java_Inheritance_I {
    public static void main(String args[]) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}
