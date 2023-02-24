public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(lengthOfNumber(153));
        System.out.println(power(2, 4));
        System.out.println(isArmstrong(153));

    }

    static boolean isArmstrong(int number) {
        int sum = 0;
        int length = lengthOfNumber(number);
        for (int i = number; i > 0; i = i / 10) {
            int lastElement = i % 10;
            sum = sum + power(lastElement, length);
        }
        return number == sum;
    }

    static int lengthOfNumber(int number) {
        int length = 0;
        int element = number % 10;
        for (int i = element; number > 0; number /= 10) {
            length++;
        }
        return length;
    }

    static int power(int number, int power) {
        int result;
        for (result = 1; power > 0; power--) {
            result = result * number;
        }
        return result;
    }
}