public class FirstHomeWork {
    public static void main(String[] args) {

        // Easy peasy
        int number = 30; // Change this number to test different cases
        if (number > 0) {
            System.out.println("Positive number.");
        }

        // Odd or even
        int integer = 16;
        if (integer % 2 == 0) {
            System.out.println("Even number.");
        }

        //Age group classifier
        int age = 32;
        if (age < 18) {
            System.out.println("Teenager.");
        } else {
            System.out.println("Adult.");
        }

        //Leap year checker
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year.");
        }

        //Multiple conditions
        int anothernumber = 55;
        if (number > 0 && number % 2 == 0 && number < 100) {
            System.out.println("Valid number.");
        }

        //Nested conditions
        int yetanothernumber = 10;
        if (number > 0 && number % 2 == 0) {
            System.out.println("Positive and Even.");
        }

        //Character type identifier
        char ch = 'a';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel.");
        }

        //BMI calculator
        double weight = 59;
        double height = 1.69; //

        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }

        
    }
}

