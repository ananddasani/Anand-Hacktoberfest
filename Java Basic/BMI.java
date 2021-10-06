/*
program to calculate the BODY MASS INDEX
PRACTICE :: if-else block in java
 */
package basic_package;
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter your weight in KG :: ");
        float weight = sc.nextFloat();

        System.out.print("\nEnter your height in M:: ");
        float height = sc.nextFloat();

        float BMI = this.calculateBMI(weight, height);
        System.out.println("Your BMI is: " + BMI);
        
        System.out.println("You are " + this.evaluateBMI(BMI));
    }
    
    public float calculateBMI(float weight, float height) {
        return (weight / (hig * hig));
    }
    
    public String evaluateBMI(float BMI) {
        if (BMI < 18.5)
            return "underweight";
        
        if (BMI < 25)
            return "normal weight";
        
        if (BMI < 30)
            return "overweight";
        
        return "obese";
    }
}
