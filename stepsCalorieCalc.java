package CalorieCalc;

import java.util.Scanner;

public class stepsCalorieCalc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double height;
        double weight = 0;
        String pace = "";
        double met = 0;
        int steps;
        double stride;
        double distance;
        double time;
        double caloriesBurned = 0;
        double speed = 0;


        System.out.print("Enter your height in meters: ");
        height = scanner.nextDouble();
        if(height <= 0){
            System.out.println("Invalid height");
            return;
        }

            System.out.print("Enter your weight in kgs: ");
            weight = scanner.nextDouble();

        if(weight <= 0){
            System.out.println("Invalid height");
            return;
        }
        scanner.nextLine();

            System.out.print("Enter walking pace (slow 2mph ," +
                    " medium 3mph, fast 4mph): ");
            pace = scanner.nextLine().toLowerCase();

        switch (pace){
            case "slow", "2" -> { met = 2.8; speed = 0.9; }
            case "medium", "3" ->{ met = 3.5; speed = 1.34; }
            case "fast", "4" -> { met = 5; speed = 1.79; }
            default -> {
                System.out.println("invalid input");
                return;
            }
        }

        System.out.print("Enter number of steps: ");
        steps = scanner.nextInt();

        if(met == 0){
            System.out.println("Invalid input");
        }else {
            stride = height * 0.414;
            distance = stride * steps;
            time = distance / speed;
            caloriesBurned = time * met * 3.5 * (weight / (200.0 * 60.0));
        }

        System.out.printf("You have burned: %.2f calories %n", caloriesBurned);





        scanner.close();
    }
}
