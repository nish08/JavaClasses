package Arrays;

public class ArrayCopying {
    public static void main(String[] args) {
        char [] word = {'a','b','c','n','i','t','i','s','h','e','f','d'};
        char [] wordto = new char[6];

        System.arraycopy(word,3,wordto,0,6 );
        System.out.println(String.valueOf(wordto));
    }
}
