package Programs;

public class StringReverseOrder {
    public static void main(String[] args) {
        String str = "My name is admin";
        String ans = "";
        char check = ' ';
        int backIndex =str.length()-1;
        for (int i =0 ;i<str.length();i++){
            if(str.charAt(i) == check){
                ans += str.charAt(i);
            }else {
                if (str.charAt(backIndex) == check){
                    backIndex = backIndex-1;
                }
                ans += str.charAt(backIndex);
                backIndex --;
            }
        }
        System.out.println(ans);
    }
}
