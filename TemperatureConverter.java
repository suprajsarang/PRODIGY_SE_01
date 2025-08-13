import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Enter unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = sc.next().toUpperCase().charAt(0);

        if (unit == 'C') {
            double f = (temp * 9 / 5) + 32;
            double k = temp + 273.15;
            System.out.println("Fahrenheit: " + f);
            System.out.println("Kelvin: " + k);
        } else if (unit == 'F') {
            double c = (temp - 32) * 5 / 9;
            double k = c + 273.15;
            System.out.println("Celsius: " + c);
            System.out.println("Kelvin: " + k);
        } else if (unit == 'K') {
            double c = temp - 273.15;
            double f = (c * 9 / 5) + 32;
            System.out.println("Celsius: " + c);
            System.out.println("Fahrenheit: " + f);
        } else {
            System.out.println("Invalid unit. Please enter C, F, or K.");
        }

        sc.close();
    }
}
