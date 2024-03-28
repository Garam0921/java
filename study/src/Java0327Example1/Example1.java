package Java0327Example1;

public class Example1 {
    public static void main(String[] args) {

        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int total = 0;
        float average = 0;

        // 2차원 배열의 모든 값의 합
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }

        // 평균 구하기
        average = (float) total / 20; //???????? 뭘로 나눠야 할지 모르겠당~

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    }
}