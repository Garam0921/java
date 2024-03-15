package java0315;

public class Count {
    public static void main(String[] args) {

        // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
        // 모음은 a e i o u
        // 스페이스는 문자 아님
        String str = "This is a really simple sentence";
        int vlCount = 0;
        int cCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char alpha = Character.toLowerCase(str.charAt(i));
            if (alpha >= 'a' && alpha <= 'z') {
                if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
                    vlCount++;
                } else {
                    cCount++;
                }
            }
        }
        System.out.println("모음: " + vlCount);
        System.out.print("자음: " + cCount);
    }
}