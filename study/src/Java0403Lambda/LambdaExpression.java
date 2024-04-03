package Java0403Lambda;
// 이것만 이해해도 성공!!!
interface A {                         // 입력없고 리턴있음
    void method1();
}
interface B {                             // 입력있고 리턴없음
    void method2(int a);
}
interface  C {                            // 입력없고 리턴있음
    int method3();
}
interface D {                             // 입력있고 리턴있음
    double method4(int a, double b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        A a0 = new A() {    // 익명 이너클래스
            public void method1() {
                System.out.println("pattern 1");
            }
        };
        A a = () -> { System.out.println("pattern 1"); };  // 람다식 단축형
        a.method1();

        B b = (int x) -> System.out.println("pattern 2 : " + x);
        B b1 = (x) -> System.out.println("pattern 2 : " + x);
        B b2 = x -> System.out.println("pattern 2 : " + x);    // 매개변수가 하나인 경우만 소괄호 삭제
        b2.method2(5);

        C c = () -> { return 4; };  // return이 있으므로 중괄호가 필요함
        C c1 = () -> 4;  // return을 생략하려면 중괄호도 같이 생략해야함
        System.out.println(c1.method3());

        D d = (int x, double y) -> { return x + y; };
        D d1 = (int x, double y) -> x + y;
        D d2 = (x, y) -> x + y;
        System.out.println(d2.method4(10, 5.5));
    }
}
