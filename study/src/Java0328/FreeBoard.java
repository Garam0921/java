package Java0328;

import java.util.ArrayList;
import java.util.List;

public class FreeBoard {
    private int FreeBoard;
    private String title;
    private String content;
    private String loginId;
    private List<Reply> replies;

    public FreeBoard() {
        this.replies = new ArrayList<>();
    }

    public FreeBoard(int FreeBoard, String title, String contents, String loginId, List<Reply> replies) {
        this.FreeBoard = FreeBoard;
        this.title = title;
        this.content = contents;
        this.loginId = loginId;
        this.replies = new ArrayList<>();
    }
   // getter

    public int getFreeBoard() {
        return FreeBoard;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return content;
    }

    public String getLoginId() {
        return loginId;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    // settet

    public void setFreeBoard(int FreeBoard) {
        this.FreeBoard = FreeBoard;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContents(String contents) {
        this.content = content;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

    public void addReply(Reply reply) {
        this.replies.add(reply);
    }

    @Override
    public String toString() {
        return title + ", " + content + ", " + loginId;
    }
}
