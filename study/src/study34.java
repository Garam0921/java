public class study34 {
    public static void main(String[] args) {

      for (int i = 0; i < 10; i++) {
          System.out.print (i);
          }
        System.out.println ();
      // 무한루프
      // 조건식이 false가 될 수 있는지 여부를 반드시 확인!!!
//        for (int i = 0; i >= 0; i++) {
//            System.out.println(i);
//        }

        // while문
        int count = 0; //초기식
        while (count < 5) {
            System.out.print(count + " ");
            count++; // 증감식
        }
        System.out.println ();

        // 의도적인 무한루프에서 while문은 자주 쓰임
        // while(true) {
            // 무한루프
            // 유저가 버튼 클릭할때 까지 대기
            // if (esc버튼 클릭)
            //    break;


        // do ~ while 문
        int cnt1 = 0;  // 초기식
        do {
            System.out.print(cnt1 + " ");
            cnt1++;
        }while (cnt1 < 5);
        // 아래 while문과 비고하면
        // 반복문의 조건이 처음부터 false인 경우,
        // do~while문은 실행코드가 1회 실행되는 반면,  while문읜 실행되지 않음!!
        System.out.println ();


        // 이중루프, 이중반복문
        for (int k=0; k<3; k++) {
            for (int j=0; j<5; j++) {
                System.out.println("[k=" + k + ", j=" + j + "]");
            }
        }
      }
    }

