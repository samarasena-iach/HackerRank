package Java;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-factory/problem?isFullScreen=true
public class Java_Factory_Pattern {
    public static void main(String args[]) {
        // Inputs
        // 01. "cake"
        // 02. "pizza"

        try {
            Scanner sc = new Scanner(System.in);
            //creating the factory
            FoodFactory foodFactory = new FoodFactory();

            //factory instantiates an object
            Food food = foodFactory.getFood(sc.nextLine());

            System.out.println("The factory returned " + food.getClass());
            System.out.println(food.getType());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        switch (order) {
            case "pizza":
                return new Pizza();
            case "cake":
                return new Cake();
            default:
                return null;
        }
    }
}
