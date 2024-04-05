public class ReversedString {
    public static void main(String[] args) {
        String OriginalStr = "Hello";
        String ReversedStr = "";
        System.out.println("Original String:"+OriginalStr);
        for (int i=0; i < OriginalStr.length();i++){
            ReversedStr = OriginalStr.charAt(i) + ReversedStr;
        }
        System.out.println("Reversed String:" +ReversedStr);
    }
}
