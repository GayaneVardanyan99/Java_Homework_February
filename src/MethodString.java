public class MethodString {
    public static void main(String[] args) {
        System.out.println(methodStringEqual("java methods java strings java word", "java"));
        System.out.println(methodStringEqual("methods strings word", "java"));
        System.out.println(methodStringEqual("methods strings word", ""));
    }

    static int methodStringEqual(String text, String word) {
        int count = 0;
        for (String newWord : text.split(" ")) {
            if (newWord.equals(word)) {
                count++;
            }
        } if (count == 0) {
                return -1;
            } else if (text.length() == 0 || word.length() == 0) {
                return -2;
            } return(count);
        }
    }