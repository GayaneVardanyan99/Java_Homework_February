public class NumbersFromSmallestToBiggest {
    public static void main(String[] args) {
        int[] numbers = {5, -23, 5, 12, 5, 12, 12, -23};

        int smallest = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    smallest = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = smallest;
                }
            }
        }
        System.out.print("The sorted array is { ");
        for (int n = 0; n < numbers.length; n++) {
            System.out.print(numbers[n] + " ");
        }
        System.out.print("}");
    }
}