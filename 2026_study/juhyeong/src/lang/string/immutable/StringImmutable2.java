package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        // String 불변이다
        String str = "hello";
        String str2 = str.concat(" java");
        System.out.println("str2 = " + str2);
    }
}
