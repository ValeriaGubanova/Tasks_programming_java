
public class BaseConverter {

    private double Celsius;

    public static void convert(double Celsius) {
        double Fahrenheit = (Celsius * 1.8) + 32;
        double Kelvin = Celsius + 273.15;
        System.out.println("Fahrenheit: " + Fahrenheit + ", Kelvin: " + Kelvin);
    };
}
