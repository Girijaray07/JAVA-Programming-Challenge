package StringPractice;

public class stringBuilderPrac {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(32);

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            s.append(ch);
        }

        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.length());
    }
}
