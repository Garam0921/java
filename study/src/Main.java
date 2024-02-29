public class Main {
    public static void main(String[] args) {

        // if 단독사용
        boolean x = true;
        if (x) {
            System.out.println("테스트중!!!");
        }
        if (!x) {
            System.out.println("이건 안보일걸");
        }
        // if ~ else
        if (x) {
            System.out.println("x는 true");
        }else {
            System.out.println("x는 false");
        }
        // if ~ else의 중복 사용
        boolean a = false;
        boolean b = true;
        boolean c = true;
        if (a) {
            System.out.println("a가 true");
        }else if (b) {
            System.out.println("a는 false, b가 true");
        }else if (c) {
            System.out.println("a,b는 false, c가 true");
        }else {
            System.out.println("a,b,c는 false");
        }

        // 학점 코드 (범위를 나타내는 조건식)
        // 조건식에 사용된 범위가 전체를 100% 커버해야한다
        int score = 91;
        if (score >= 90) {
            System.out.println("A 학점");
        } else if (score >= 80 && score < 90) {
            System.out.println("B 학점");
        } else if (score >= 70 && score < 80) {
            System.out.println("C 학점");
        } else if (score >= 60 && score < 70) {
            System.out.println("D 학점");
        } else {
            System.out.println("F 학점");
        }
    }
}