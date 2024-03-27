package Java0326;

public class ChildA extends Object implements A, B { // extends Object 생략 가능
    @Override
    public void abc() {
        System.out.println("child of A");
    }

    @Override
    public void bcd() {
        System.out.println("Child of B");
    }
}
