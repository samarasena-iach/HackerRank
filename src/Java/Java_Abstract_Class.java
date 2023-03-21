package Java;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-abstract-class/problem?isFullScreen=true
public class Java_Abstract_Class {
    public static void main(String[] args) {
        // Inputs
        // 01. "A tale of two cities"

        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());

    }
}

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    void setTitle(String s) {
        title = s;
    }
}
