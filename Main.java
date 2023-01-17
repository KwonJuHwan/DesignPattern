package homework;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> intStack = new MyStack<>();
        for (int i = 0; i < 10; i++) {
            intStack.push(i);
        }

        System.out.println("Iterator 사용");
        for (Integer n : intStack) {
            System.out.println(n);
        }


        System.out.println("Pop 사용");
        while (!intStack.isEmpty()) {
            int n = intStack.pop();
            System.out.println(n);
        }

        //Boolean empty = ;
        System.out.printf("스택이 비었는지 확인: %s\n", intStack.isEmpty());
    }
}