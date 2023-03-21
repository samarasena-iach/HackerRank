package Java;

// Link: https://www.hackerrank.com/challenges/java-singleton/problem?isFullScreen=true
public class Java_Singleton_Pattern {
    // Input
    // "hello world"

    static Java_Singleton_Pattern instance = new Java_Singleton_Pattern();

    private Java_Singleton_Pattern() {

    }

    public String str;

    static Java_Singleton_Pattern getSingleInstance() {
        return instance;
    }
}
