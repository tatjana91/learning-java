public class Variables {
    public static void main(String[] args) {
        //Integer variables
        int age = 20; //User age
        System.out.println("Age: " + age);
        int roomTemperature = 18; // Temperature in the room in °C
        System.out.println("Room temperature: " + roomTemperature + " degrees Celsius");

        byte numberOfChildren = 2; // Number of children a user has
        System.out.println("Number of Children: " + numberOfChildren);
        byte productRating = 5; // Rating of a product on a scale from 1 to 5
        System.out.println("Product Rating: " + productRating);

        short monthlySalary = 1500; // Monthly salary of the user in local currency
        System.out.println("Monthly Salary: €" + monthlySalary);
        short daysInVacation = 28; // Number of vacation days the user have
        System.out.println("Vacation Days: " + daysInVacation);

        long accountBalance = 1_000_000_000L; // User's bank account balance
        System.out.println("Account Balance: €" + accountBalance);
        long distanceToWork = 7_000L; // Distance from user's home to workplace in meters
        System.out.println("Distance to Work: " + distanceToWork + " meters");


        //Floating-point variables
        double temperature = 36.6; // User body temperature
        System.out.println("Body Temperature: " + temperature);
        double piValue = 3.14; //Value of the mathematical constant Pi
        System.out.println("Value of pi: " + piValue);

        float weight = 61.5f; //Weight of the person
        System.out.println("Weight of the person: " + weight);
        float customerRating = 4.7f; // Average customer rating of the product
        System.out.println("Customer Rating: " + customerRating);

        // Character variables
        char gender = 'M'; //User gender
        System.out.println("Gender: " + gender);
        char grade = 'A'; //User grade in the school
        System.out.println("Grade: " + grade);

        // Boolean variables
        boolean hasAccount = false; // whether a user has an account or not
        System.out.println("Has an account? " + hasAccount);
        boolean isStudent = true; // whether a user is a student or not
        System.out.println("Student: " + isStudent);


    }
}
