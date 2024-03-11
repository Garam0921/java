public class study0311Method {
    static int a = 1;
    static int b = 2;
    public static void main(String[] args) {
        System.out.println(plusNums());
        System.out.println(plusNums(4,5));
        int[] intArray = {1,2,3,4,5};
        System.out.println(plusNums(intArray, intArray.length));
        System.out.println(plusNums(1,2,3,4,5,6));
    }
    // 메소드의 오버로딩
    public static int plusNums() {
        return a + b;
    }
    public static int plusNums(int x, int y) {
        return x + y;
    }
    public static int plusNums(int[] intArray, int length) {
        int sum = 0;
        for (int i=0; i< intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return sum;
    }
    // 가변길이 배열 입력법이 필요한 이유
    public static int plusNums(int a, int b, int c, int d, int e) {
        return a + b +c + d + e;
    }
    public static int plusNums(int a, int b, int c, int d, int e, int f) {
        return a + b +c + d + e + f;
    }
    public static int plusNums(int... values) {
        int sum = 0;
        for (int i=0; i < values.length; i++) {
            sum = sum + values[i];
        }
        return sum;
    }
}


/*
public class Main {
    public static void main(String[] args) {
        // 클래스의 생성자가 없는 경우 => 기본생성자가 자동으로 만들어짐
        // 매개변수가 있는 생성자만 있는 경우 =>기본생성자는 만들어 지지 않는다!!
        Students a = new Students();
        Students tom = new Students("tom", "20", "Seuoul", "12345");
    }
}

// 클래스 생성자 2개는 만들자
// 기본 생성자는 외우자
// public Students() {  // 기본생성자
//}
*/
