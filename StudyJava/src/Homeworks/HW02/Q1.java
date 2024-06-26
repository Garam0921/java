package Homeworks.HW02;

public class Q1 {
    public static void main(String[] args) {
        // String 문자열의 소문자는 대문자로, 대문자는 소문자로 변경시킨
        // String 문자열을 리턴하는 메서드(changeCase)를 완성하시오
        String str = "cHanGe CasE";
        String result = changeCase(str);
        System.out.println(result); // ChANgE cASe
    }

    public static String changeCase(String str) {
        // 여기 코드 작성 !!
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ('A' <= ch && ch <= 'Z')
                result += (char) (ch + 32);
            else if ('a' <= ch && ch <= 'z')
                result += (char) (ch - 32);
            else
                result += ch;
        }
        return result;
    }
}