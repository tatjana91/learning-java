package classroom;

public class ConditionalStatements {
    public static void main(String[] args) {

        // Conditional statements in Java allow to control the flow of your program based on certain
        // conditions.

        // 'If' statement

        /*
        if(condition) {
        // Code to be executed if the condition is true!
        }
         */

        if (true) {
            System.out.println("This code is executed!");
        }

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        if(x > 12) {
            System.out.println("x is greater than 12");
        }

        boolean isSpring = true;
        if(isSpring) {
            System.out.println("It is Spring!");
        }
        int age = 20;

        if(age <= 12) {
            System.out.println("This is child!");
        } else {
            System.out.println("Something else!");
        }

        if(age <= 12) {
            System.out.println("This is child!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("This is teenager!");
        } else if (age >= 20 && age <= 59) {
            System.out.println("This is adult!");
        } else {
                System.out.println("This is senior!");
            }





        }


    }
