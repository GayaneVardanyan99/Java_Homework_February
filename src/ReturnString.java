public class ReturnString {
    public static void main(String[] args) {
        System.out.println(returnString("string word method of string"));
        System.out.println(returnString("java programming language"));
        System.out.println(returnString(""));
    }
    static int returnString(String text) {
        int count = 0;
        String word = "string";
        for (String newWord : text.split(" ")) {
            if (newWord.equals(word)) {
                count++;
            }
        } if (text.length() == 0) {
                return -2;
            } else if (count == 0) {
                return -1;
            } return(count);
        }
}