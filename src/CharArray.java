public class CharArray {
    public static void main(String[] args) {
        System.out.println(charArray('u', 'a', 'g'));
        System.out.println(intArray(117, 97, 103));
    }
    static int charArray(char... array) {
        int i;
        for (i = 0; i < array.length - 1; i++) {
            System.out.println((int) array[i]);
        }
        return array[i];
    }

    static char intArray(int... array1) {
        int i;
        for (i = 0; i < array1.length - 1; i++) {
            System.out.println((char) array1[i]);
        }
        return (char) array1[i];
    }
}