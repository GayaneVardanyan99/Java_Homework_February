public class GreatestDivider {
    public static void main(String[] args) {
        System.out.println(greatestDivider(5));
        System.out.println(greatestDividerForAll(15, 25, 5, 30));
    }

    public static int greatestDivider(int number) {
        int greatestDivider = 1;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    greatestDivider = i;
                } else {
                    continue;
                }
            }
        }
        return greatestDivider;
    }

    public static int greatestDividerForAll(int... numbers) {
        int divider = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            if ((numbers[i] < numbers[i + 1]) && (numbers[i + 1] % greatestDivider(numbers[i]) == 0)) {
                divider = greatestDivider(numbers[i]);
            } else if ((numbers[i] > numbers[i + 1]) && (numbers[i] % greatestDivider(numbers[i + 1]) == 0)) {
                divider = greatestDivider(numbers[i + 1]);
            } else if ((numbers[i] < numbers[i + 1]) && (numbers[i + 1] % greatestDivider(numbers[i]) != 0)) {
              while (numbers[i + 1] % greatestDivider(numbers[i]) != 0) {
                    divider--;
                    break;
                }
           } else if ((numbers[i] > numbers[i + 1]) && (numbers[i] % greatestDivider(numbers[i + 1]) != 0)) {
                while (numbers[i] % greatestDivider(numbers[i + 1]) != 0) {
                    divider--;
                    break;
                }
            }
        } return divider;
    }
}