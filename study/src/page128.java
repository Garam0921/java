public class page128 {
    public static void main(String[] args) {
        //for 문 기본문법 구조
        int a;
        for (a = 0; a < 3; a++) {
            System.out.print(a + "");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(i + "");
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.print(i + "");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + "");
        }
        System.out.println();

        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + "");
        }
        System.out.println();

        for (int i = 0, j = 0; i < 10; i++, j++) {
            System.out.print(i + j + "");
        }
        System.out.println();
    }
}
