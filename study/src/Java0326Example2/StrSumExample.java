package Java0326Example2;

public class StrSumExample {

    // 문자열 "12345"의 각 자리에 있는 숫자를 더하는 코드를 완성하시오
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for (int i=0; i<str.length(); i++) {
            sum = sum + (str.charAt(i) - '0');
        }

/*        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            // '0' 문자의 ASCII 코드 값인 48을 빼면 해당 문자가 나타내는 숫자 값을 얻을 수 있습니다.
            int num = a - '0';
            sum += num;*/


/*        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));*/

            System.out.println("합계는 " + sum); // 15
            //System.out.println("유니코드 값: " + (int)a);
        }
    }

