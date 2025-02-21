package Ch_1_3;

import java.util.Scanner;

public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N;
    public FixedCapacityStack(int cap) {
        a = (Item[]) new Object[cap];
    }
    public boolean isEmpty() {return N == 0;}
    public int size() {return N;}
//    private void push(Item item) {
//        a[N++] = item;
//    }
    public void push(Item item) {
        //将元素压入栈顶
        if(N == a.length) resize(2*a.length);
    }
//    public Item pop() {
//        return a[--N];
//    }
    public Item pop() {
        //从栈顶删除元素
        Item item = a[--N];
        a[N] = null;
        if(N > 0 && N == a.length/4) resize(a.length/2);
        return item;
    }

    public static void main(String[] args) {
        FixedCapacityStack<String> stack = new FixedCapacityStack<>(100);
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String item = scanner.next();
            if(!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                System.out.println(stack.pop() + " ");
            }
            System.out.println("(" + stack.size() + " left on stack)");
        }
    }

    private void resize(int max){
        //将大小为N < = max的栈移动到一个新的大小为max的数组中
        Item[] items = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            items[i] = a[i];
            a = items;
        }
    }



}
