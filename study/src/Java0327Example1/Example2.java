package Java0327Example1;

public class Example2 {
    public static void main(String[] args) {

        // 문제 2. int 타입의 변수 num이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하세요.
        // num이 12345 이면 , ‘1+2+3+4+5’ 15 의 결과인 를 출력
        int num = 12345;
        int sum = 0;

        // 숫자를 문자로
        String a = String.valueOf(num);

        // 문자열의 각 자리 숫자를 하나씩 가져와 합을 계산
        for (int i = 0; i < a.length(); i++) {
            // 문자를 숫자로 변환하여 합에 더함
            sum += Character.getNumericValue(a.charAt(i));
        }

        System.out.println("sum=" + sum); // 15
    }
}