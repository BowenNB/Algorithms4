package Ch_1_3;

public class StringLoop {

    public static void main(String[] args) {
        String str = "Hello World";
        int i = 0;

        while (i < str.length()){
            System.out.println(str.charAt(i));
            i++;
        }
    }
}
