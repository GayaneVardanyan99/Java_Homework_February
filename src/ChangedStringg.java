public class ChangedStringg {
    public static void main(String[] args) {
        String originalText = "Programming with Java";
        String changedText = "";
        for (int i = originalText.length() - 1; i >= 0; i--) {
            changedText = changedText + originalText.charAt(i);
        }
        System.out.print(changedText);
    }
}