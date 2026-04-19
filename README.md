Steps-calories-burned-calculator

A program that calculates how many calories you burn from your step count by taking your height, weight, walking pace, and total steps walked.
Allows for user input for height (in meters), weight (in kgs), pace, and total step count. This program uses the standard MET formula for is calculation:  

•Stride Length: Estimated as height * 0.414  
•Time: Calculated by dividing total distance (steps * stride) by velocity (m/s).  
•Calories: (Time_in_minutes * MET * 3.5 * weight) / 200.  

Example: Enter your height in meters: 1.8  
Enter your weight in kgs: 80  
Enter walking pace (slow 2mph , medium 3mph, fast 4mph): medium  
Enter number of steps: 5000  
You have burned: 227.08 calories  

Prerequisites: JDK 17 or higher  
How to run this program
1. Clone the repository using Git: git clone https://github.com/Sarthi267/Steps-calories-burned-calculator.git
2. Then, move into the project directory: cd Steps-calories-burned-calculator
3. Compile: javac stepsCalorieCalc.java
4. Run: java stepsCalorieCalc
