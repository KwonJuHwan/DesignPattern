package homework;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> intStack = new MyStack<>();
        for (int i = 0; i < 10; i++) {
            intStack.push(i);
        }

        System.out.println("Iterator ���");
        for (Integer n : intStack) {
            System.out.println(n);
        }


        System.out.println("Pop ���");
        while (!intStack.isEmpty()) {
            int n = intStack.pop();
            System.out.println(n);
        }

        //Boolean empty = ;
        System.out.printf("������ ������� Ȯ��: %s\n", intStack.isEmpty());
    }
}