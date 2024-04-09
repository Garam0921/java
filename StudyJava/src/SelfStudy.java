import java.util.HashMap;
import java.util.Map;

public class SelfStudy {
    public static void main(String[] args) {
        Map<String, String> albumLyrics = new HashMap<>();

        // 가수의 앨범별 가사 추가
        albumLyrics.put("앨범1", "앨범1 가사...");
        albumLyrics.put("앨범2", "앨범2 가사...");
        albumLyrics.put("앨범3", "앨범3 가사...");

        // 앨범별 가사 출력
        for (String album : albumLyrics.keySet()) {
            System.out.println("앨범: " + album);
            System.out.println("가사: " + albumLyrics.get(album));
            System.out.println();
        }
    }
}
