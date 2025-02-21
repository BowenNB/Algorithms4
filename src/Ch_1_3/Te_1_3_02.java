package Ch_1_3;

public class Te_1_3_02 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        String[] a = "it was - the best - of times - - - it was - the - -".split("\\s+");
        System.out.println(a.length);
        for (String s : a) {
            if(s.equals("-")){
                System.out.println(stack.pop());
            } else {
                stack.push(s);
            }
        }
    }
}
