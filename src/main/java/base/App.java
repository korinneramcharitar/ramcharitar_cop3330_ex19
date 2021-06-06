package base;
import java.text.DecimalFormat;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double weight, height;
        Scanner input = new Scanner(System.in);
        System.out.println("What is your weight?");
        weight = input.nextDouble();
        System.out.println("What is your height");
        height = input.nextDouble();

        DecimalFormat formatter = new DecimalFormat("#0.00");
        double bmi = ((weight / (height * height)) * 703);

        if (bmi > 18.4 && bmi < 26)
            System.out.println("Your BMI is " + formatter.format(bmi) + ".\n You are within the ideal weight range.");
        else
            System.out.println("Your BMI is " + formatter.format(bmi) + ".\n You are overweight. You should see your doctor.");
    }
}