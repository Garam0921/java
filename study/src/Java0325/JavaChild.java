
package Java0325;

public class JavaChild extends JavaAbstract {
    public JavaChild() {
        super();
    }
    public JavaChild(int a, String b) {
        super(a, b);
    }

    @Override
    public String getString() {
        return "자식클래스";
        // return super.b;
    }


    public void setValue(int a) {
        super.setValue(a); // 자바스타일, 자바는 세터와 개터를 사용하는 것을 추천함!!!
        // super.a =a;//
    }

    public void setString(String b) {
        super.setString(b);
    }
}
