public class study0305String {
    public static void main(String[] args) {
        // String 클래스의 첫번째 특징
        // 객체의 값을 변경하면 새로운 객체를 생성 (주소값이 새로운 주소로 변경)
        // String 객체변수는 값이 수정되지 않고 항상 새로운 값을 만듬!!
        String str1 = new String("Start");
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        str1 = "end";
        System.out.println(str1);
        System.out.println(str2);

        System.out.println();

        // String 클래스의 두번째 특징
        // 리터럴로 입력하는 경우, 해당 문자열을 재사용(=공유)함
        // 리터럴로 입력되는 값은, 런타임 이전(컴파일러타임)에 이미 메모리에 만들어짐
        String str5 = new String("Start");
        String str3 = "Start";
        String str4 = "Start";
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);

        System.out.println();

        // 문자열의 '+' 연산
        String a1 = "Hello";
        String a2 = "World";
        System.out.println(a1 + " " + a2);

        // 문자열과 숫자의 '+' 연산
        System.out.println(1 + "Hi");
        System.out.println(1 + 2 + "Hi");
        System.out.println("Hi" + 1 + 2);
    }
}
