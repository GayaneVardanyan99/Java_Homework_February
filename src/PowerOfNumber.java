public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(moduleOfNumber(-5));
        double powerOfNumber = powerOfNumber(11,3);
        if (powerOfNumber == -1) {
            System.out.println("The module of number is greater than 10.");
        } else if (powerOfNumber == -2) {
            System.out.println("This number is negative.");
        } else {
            System.out.println(powerOfNumber);
        }
    }
    static int moduleOfNumber(int number) {
        if (number < 0) {
            number = number * (-1);
        }
        return number;
    }
    static double powerOfNumber(int number, int power) {
        if (moduleOfNumber(number) > 10 || moduleOfNumber(power) > 10) {
            return -1;
        }
        if (number <= 0) {
            return -2;
        }
        double result = 1;
        for (int i = 1; i <= moduleOfNumber(power); i++) {
            result = result * number;
        }
        if (power < 0) {
            return 1/result;
        }
        return result;
    }
}